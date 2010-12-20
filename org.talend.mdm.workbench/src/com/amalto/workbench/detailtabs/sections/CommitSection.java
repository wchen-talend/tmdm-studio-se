package com.amalto.workbench.detailtabs.sections;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.eclipse.ui.views.properties.tabbed.ITabDescriptor;
import org.eclipse.ui.views.properties.tabbed.ITabSelectionListener;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import com.amalto.workbench.detailtabs.sections.composites.CommitBarComposite;
import com.amalto.workbench.detailtabs.sections.composites.CommitBarComposite.CommitBarListener;

public class CommitSection extends BasePropertySection {

    private CommitBarComposite commitBar;

    @Override
    public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
        super.createControls(parent, aTabbedPropertySheetPage);

        Composite compTop = getWidgetFactory().createComposite(parent);
        compTop.setLayout(new FillLayout());

        Section section = getWidgetFactory().createSection(compTop, Section.TITLE_BAR | Section.EXPANDED);
        section.setText("Commit");
        section.setLayout(new FillLayout());
        getWidgetFactory().createCompositeSeparator(section);

        Composite compSectionClient = getWidgetFactory().createComposite(section);
        compSectionClient.setLayout(new FillLayout());

        commitBar = new CommitBarComposite(compSectionClient, SWT.NONE);

        section.setClient(compSectionClient);

        initUIListeners();
    }

    @Override
    public boolean shouldUseExtraSpace() {
        return true;
    }

    private void addCommbarListeners() {

        for (ISection eachSelection : getCurrentTabSections()) {

            if (!(eachSelection instanceof BasePropertySection))
                continue;

            if (!(eachSelection instanceof CommitBarListener))
                continue;

            if (!((BasePropertySection) eachSelection).getParentTabID().equals(getParentTabID()))
                continue;

            commitBar.addCommitListener((CommitBarListener) eachSelection);
        }

    }

    private void initUIListeners() {

        tabbedPropertySheetPage.addTabSelectionListener(new ITabSelectionListener() {

            public void tabSelected(ITabDescriptor tabDescriptor) {

                if (tabDescriptor.getId().equals(getParentTabID()))
                    addCommbarListeners();
            }
        });

    }
}