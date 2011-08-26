// ============================================================================
//
// Talend Community Edition
//
// Copyright (C) 2006-2011 Talend �C www.talend.com
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
//
// ============================================================================
package org.talend.mdm.repository.core.impl.datamodel;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.talend.commons.exception.PersistenceException;
import org.talend.core.model.properties.Item;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.runtime.CoreRuntimePlugin;
import org.talend.mdm.repository.core.IServerObjectRepositoryType;
import org.talend.mdm.repository.core.impl.AbstractRepositoryNodeResourceProvider;
import org.talend.mdm.repository.model.mdmproperties.ContainerItem;
import org.talend.mdm.repository.model.mdmproperties.MdmpropertiesFactory;
import org.talend.mdm.repository.model.mdmproperties.WSDataModelItem;
import org.talend.mdm.repository.model.mdmserverobject.WSDataModelE;
import org.talend.mdm.repository.utils.RepositoryResourceUtil;
import org.talend.repository.model.IProxyRepositoryFactory;

/**
 * DOC hbhong class global comment. Detailled comment <br/>
 * 
 */
public class DataModelNodeResourceProvider extends AbstractRepositoryNodeResourceProvider {

    Logger log = Logger.getLogger(DataModelNodeResourceProvider.class);

    public ERepositoryObjectType getRepositoryObjectType(Item item) {
        if (item instanceof WSDataModelItem || item instanceof ContainerItem) {
            return IServerObjectRepositoryType.TYPE_DATAMODEL;
        }
        return null;
    }

    public Resource create(IProject project, Item item, int classifierID, IPath path) throws PersistenceException {
        ERepositoryObjectType repositoryType = getRepositoryObjectType(item);
        if (repositoryType != null) {
            Resource itemResource = createCommonItemResource(project, item, repositoryType, path);
            EList<EObject> contents = itemResource.getContents();
            contents.add(((WSDataModelItem) item).getWsDataModel());
            return itemResource;
        }
        return null;
    }

    public Resource save(Item item) throws PersistenceException {
        if (item instanceof WSDataModelItem) {
            Resource resource = xmiResourceManager.getItemResource(item);
            resource.getContents().clear();
            resource.getContents().add(((WSDataModelItem) item).getWsDataModel());
            Resource eResource = ((WSDataModelItem) item).getWsDataModel().eResource();
            return resource;
        }
        return null;
    }

    public Item createNewItem(ERepositoryObjectType type) {
        return MdmpropertiesFactory.eINSTANCE.createWSDataModelItem();
    }

    public boolean canHandleRepObjType(ERepositoryObjectType type) {
        return type == IServerObjectRepositoryType.TYPE_DATAMODEL;
    }

    @Override
    public boolean needSaveReferenceFile() {
        return true;
    }

    @Override
    public void handleReferenceFile(Item item) {
        IFile file = RepositoryResourceUtil.findReferenceFile(IServerObjectRepositoryType.TYPE_DATAMODEL, item, "xsd"); //$NON-NLS-1$

        try {

            createOrUpdateFile(item, file);

            linkReferenceFile(item, file);
            IProxyRepositoryFactory factory = CoreRuntimePlugin.getInstance().getProxyRepositoryFactory();

            factory.save(item);

        } catch (UnsupportedEncodingException e) {
            log.error(e.getMessage(), e);
        } catch (CoreException e) {
            log.error(e.getMessage(), e);
        } catch (PersistenceException e) {
            log.error(e.getMessage(), e);
        }
    }

    private IFile createOrUpdateFile(Item item, IFile file) throws UnsupportedEncodingException, CoreException {
        WSDataModelE dataModel = ((WSDataModelItem) item).getWsDataModel();
        String content = dataModel.getXsdSchema();
        if (!file.exists())
            file.create(new ByteArrayInputStream(content.getBytes("utf-8")), IFile.FORCE, new NullProgressMonitor());//$NON-NLS-1$
        else
            file.setContents(new ByteArrayInputStream(content.getBytes("utf-8")), IFile.FORCE, new NullProgressMonitor());//$NON-NLS-1$

        return file;
    }
}
