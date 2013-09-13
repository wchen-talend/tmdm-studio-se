// ============================================================================
//
// Copyright (C) 2006-2013 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.mdm.repository.ui.actions.datamodel;

import java.util.ArrayList;
import java.util.List;

import org.talend.core.model.properties.Item;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.mdm.repository.core.service.IMatchRuleMapInfoService;
import org.talend.mdm.repository.i18n.Messages;
import org.talend.mdm.repository.ui.actions.DeployToAction;
import org.talend.mdm.repository.utils.ServiceUtil;

/**
 * created by HHB on 2013-9-2 Detailled comment
 * 
 */
public class DeployMatchRuleAction extends DeployToAction {

    IMatchRuleMapInfoService service = null;

    private IMatchRuleMapInfoService getService() {
        if (service == null) {
            service = ServiceUtil.getService(IMatchRuleMapInfoService.class);
        }
        return this.service;
    }

    public DeployMatchRuleAction() {
        super(Messages.DeployMatchRuleAction_label);
    }

    @Override
    protected List<IRepositoryViewObject> getSelectedRepositoryViewObject() {
        List<IRepositoryViewObject> viewObjs = new ArrayList<IRepositoryViewObject>();
        List<Object> selectedObjects = getSelectedObject();
        if (getService() != null && selectedObjects != null && !selectedObjects.isEmpty()) {
            IRepositoryViewObject viewObj = (IRepositoryViewObject) selectedObjects.get(0);
            Item item = viewObj.getProperty().getItem();
            if (item != null) {
                IRepositoryViewObject matchRuleViewObj = getService().generateWSMatchRuleObject(item);
                viewObjs.add(matchRuleViewObj);
            }
        }
        return viewObjs;
    }

}
