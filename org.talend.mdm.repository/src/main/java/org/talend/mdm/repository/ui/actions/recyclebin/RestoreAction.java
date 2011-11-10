// ============================================================================
//
// Copyright (C) 2006-2011 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.mdm.repository.ui.actions.recyclebin;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.Path;
import org.talend.commons.exception.BusinessException;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.properties.Item;
import org.talend.core.model.properties.ItemState;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.model.ProxyRepositoryFactory;
import org.talend.mdm.repository.core.AbstractRepositoryAction;
import org.talend.mdm.repository.core.service.ContainerCacheService;
import org.talend.mdm.repository.i18n.Messages;
import org.talend.mdm.repository.models.ContainerRepositoryObject;
import org.talend.mdm.repository.utils.RepositoryResourceUtil;
import org.talend.repository.ProjectManager;
import org.talend.repository.model.IProxyRepositoryFactory;

import com.amalto.workbench.image.EImage;
import com.amalto.workbench.image.ImageCache;

/**
 * DOC hbhong class global comment. Detailled comment
 */
public class RestoreAction extends AbstractRepositoryAction {

    static Logger log = Logger.getLogger(RestoreAction.class);

    IProxyRepositoryFactory factory = ProxyRepositoryFactory.getInstance();

    /**
     * DOC hbhong RestoreAction constructor comment.
     * 
     * @param text
     */
    public RestoreAction() {
        super(Messages.RestoreAction_title);
        setImageDescriptor(ImageCache.getImage(EImage.ADD_OBJ.getPath()));
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.talend.mdm.repository.core.AbstractRepositoryAction#getGroupName()
     */
    @Override
    public String getGroupName() {
        return GROUP_EDIT;
    }

    @Override
    public void run() {
        for (Object obj : getSelectedObject()) {
            IRepositoryViewObject viewObj = (IRepositoryViewObject) obj;
            restore(viewObj);
            // restore parent
            restoreParent(viewObj);

        }
        // save
        try {
            factory.saveProject(ProjectManager.getInstance().getCurrentProject());
        } catch (PersistenceException e) {
            log.error(e.getMessage(), e);
        }
        commonViewer.refresh();
    }

    private void restore(IRepositoryViewObject viewObj) {
        if (viewObj instanceof ContainerRepositoryObject) {
            restoreFolder((ContainerRepositoryObject) viewObj);
        } else {
            restoreServerObject(viewObj);
        }
    }

    private void restoreFolder(ContainerRepositoryObject viewObj) {
        Item item = viewObj.getProperty().getItem();
        ERepositoryObjectType type = viewObj.getRepositoryObjectType();
        if (RepositoryResourceUtil.isDeletedFolder(item, type)) {
            ItemState state = item.getState();
            state.setDeleted(false);
            String path = ERepositoryObjectType.getFolderName(type);
            if (!path.isEmpty()) {
                path += state.getPath();
            }
            List<String> deletedFolderPaths = ProjectManager.getInstance().getCurrentProject().getEmfProject()
                    .getDeletedFolders();
            deletedFolderPaths.remove(path);
            for (IRepositoryViewObject child : viewObj.getChildren()) {
                restore(child);
            }
        }
    }

    private void restoreServerObject(IRepositoryViewObject viewObj) {
        Item item = viewObj.getProperty().getItem();
        try {
            factory.restoreObject(viewObj, new Path(item.getState().getPath()));
            if (RepositoryResourceUtil.isOpenedInEditor(viewObj)) {
                factory.lock(viewObj);
            }
        } catch (PersistenceException e) {
            log.error(e.getMessage(), e);
        } catch (BusinessException e) {
            log.error(e.getMessage(), e);
        }
    }

    private void restoreParent(IRepositoryViewObject viewObj) {
        IRepositoryViewObject parent = ContainerCacheService.getParent(viewObj);
        if (parent != null && parent instanceof ContainerRepositoryObject) {
            Item item = parent.getProperty().getItem();
            ERepositoryObjectType type = parent.getRepositoryObjectType();
            if (RepositoryResourceUtil.isDeletedFolder(item, type)) {
                item.getState().setDeleted(false);
                restoreParent(parent);
            }
        }
    }
}