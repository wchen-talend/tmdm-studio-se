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
package com.amalto.workbench.detailtabs.sections;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import com.amalto.workbench.detailtabs.exception.CommitException;
import com.amalto.workbench.detailtabs.exception.CommitValidationException;
import com.amalto.workbench.detailtabs.sections.composites.CommitBarComposite.CommitBarListener;
import com.amalto.workbench.detailtabs.sections.handlers.CommitHandler;
import com.amalto.workbench.detailtabs.sections.model.ISubmittable;
import com.amalto.workbench.detailtabs.sections.util.CommitBarListenerRegistry;

public abstract class CommitBarListenerSection<T> extends BasePropertySection implements CommitBarListener {

    public void onReset() {

        refreshUIByEditedObj();
    }

    public void onSubmit() {

        try {
            if (doSubmit()) {

                refreshUIByEditedObj();

                refreshDataModelMainPageAfterModification();
            }
        } catch (CommitException e) {
            handleCommitException(e, "Commit Error");
        } catch (CommitValidationException e) {
            handleCommitException(e, "Commit Validation Error");
        }
    }

    protected void handleCommitException(Exception e, String title) {

        MessageDialog.openError(getPart().getSite().getShell(), title, e.getMessage());

    }

    protected void refreshUIByEditedObj() {

        initUIContents(getEditedObj());

        refresh();

    }

    protected void refreshDataModelMainPageAfterModification() {
        getCurDataModelMainPage().refresh();
        getCurDataModelMainPage().markDirty();
    }

    protected boolean doSubmit() throws CommitException, CommitValidationException {
        return createCommotHandler().submit();
    }

    @SuppressWarnings("unchecked")
    @Override
    public void setInput(IWorkbenchPart part, ISelection selection) {
        super.setInput(part, selection);

        initUIContents((T) ((IStructuredSelection) selection).getFirstElement());
    }

    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
        super.createControls(parent, aTabbedPropertySheetPage);

        registToGolbalCommitBarListenerReg();
    }

    protected void registToGolbalCommitBarListenerReg() {
        CommitBarListenerRegistry.getInstance().registListener(getParentTabID(), this);
    }

    @Override
    public void dispose() {
        super.dispose();

        CommitBarListenerRegistry.getInstance().unregistListener(this);
    }

    protected CommitHandler<?> createCommotHandler() {
        return getSubmittedObj().createCommitHandler();
    }

    protected abstract ISubmittable getSubmittedObj();

    protected abstract T getEditedObj();

    protected abstract void initUIContents(T editedObj);

}