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
package com.amalto.workbench.detailtabs.sections.composites;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDParticle;

import com.amalto.workbench.utils.IConstants;
import com.amalto.workbench.utils.Util;

public class ElementInfoConfigComposite extends Composite {

    private Combo comboReference;

    private Text txtName;

    private XSDParticle curXSDParticle;

    private Group occurenceGroup;

    private Spinner spinMax;

    private Spinner spinMin;

    public ElementInfoConfigComposite(Composite parent, int style) {
        super(parent, style);
        createControls();

    }

    public void setXSDParticle(XSDParticle curXSDParticle) {
        this.curXSDParticle = curXSDParticle;

        initUIContents();

        refresh();
    }

    public String getElementName() {
        return txtName.getText().trim();
    }

    public String getElementReference() {
        return comboReference.getText().trim();
    }

    public boolean hasElementReference() {
        return !("".equals(getElementReference()));
    }

    public int getMinCardinality() {
        return spinMin.getSelection();
    }

    public int getMaxCardinality() {
        return spinMax.getSelection();
    }

    public XSDParticle getElement() {
        return curXSDParticle;
    }

    public void refresh() {

        refreshCardinalityArea();

        refreshNameArea();
    }

    private void refreshCardinalityArea() {
        if (occurenceGroup == null)
            return;

        if (!hasElementReference() && Util.isSimpleTypedParticle(curXSDParticle)) {
            spinMin.setSelection(1);
            spinMax.setSelection(1);
        }

        enableOccurenceGroup(!Util.isSimpleTypedParticle(curXSDParticle) || hasElementReference());
    }

    private void enableOccurenceGroup(boolean isEnabled) {
        spinMin.setEnabled(isEnabled);
        spinMax.setEnabled(isEnabled);
    }

    private void refreshNameArea() {

        if (hasElementReference())
            txtName.setText("");

        txtName.setEditable(!hasElementReference());
    }

    private void createControls() {
        final GridLayout gridLayout = new GridLayout();
        gridLayout.numColumns = 2;
        setLayout(gridLayout);

        final Label lblName = new Label(this, SWT.NONE);
        lblName.setText("Name");

        txtName = new Text(this, SWT.BORDER);
        final GridData gd_txtName = new GridData(SWT.FILL, SWT.CENTER, true, false);
        txtName.setLayoutData(gd_txtName);

        final Label lblReference = new Label(this, SWT.NONE);
        lblReference.setText("Reference");//$NON-NLS-1$

        comboReference = new Combo(this, SWT.READ_ONLY);
        final GridData gd_comboReference = new GridData(SWT.FILL, SWT.CENTER, true, false);
        comboReference.setLayoutData(gd_comboReference);

        occurenceGroup = new Group(this, SWT.NONE);
        final GridData gd_occurenceGroup = new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1);
        occurenceGroup.setLayoutData(gd_occurenceGroup);
        occurenceGroup.setText("Occurence");//$NON-NLS-1$
        final GridLayout gridLayout_2 = new GridLayout();
        gridLayout_2.numColumns = 3;
        occurenceGroup.setLayout(gridLayout_2);

        final Label lblMinOcur = new Label(occurenceGroup, SWT.NONE);
        final GridData gd_lblMinOcur = new GridData(SWT.CENTER, SWT.CENTER, false, false);
        lblMinOcur.setLayoutData(gd_lblMinOcur);
        lblMinOcur.setText("Min");//$NON-NLS-1$

        new Label(occurenceGroup, SWT.NONE);

        final Label lblMaxOcur = new Label(occurenceGroup, SWT.NONE);
        final GridData gd_lblMaxOcur = new GridData(SWT.CENTER, SWT.CENTER, false, false);
        lblMaxOcur.setLayoutData(gd_lblMaxOcur);
        lblMaxOcur.setText("Max");//$NON-NLS-1$

        spinMin = new Spinner(occurenceGroup, SWT.BORDER);
        spinMin.setSelection(1);
        spinMin.setMinimum(0);
        spinMin.setMaximum(Integer.MAX_VALUE);

        final Label label = new Label(occurenceGroup, SWT.NONE);
        label.setText("----->");

        spinMax = new Spinner(occurenceGroup, SWT.BORDER);
        spinMax.setLayoutData(new GridData());
        spinMax.setMaximum(Integer.MAX_VALUE);
        spinMax.setMinimum(-1);
        spinMax.setSelection(1);

        initUIContents();

        initUIListeners();

        refresh();
    }

    private void initUIContents() {

        txtName.setText(Util.getParticleName(curXSDParticle));
        comboReference.setItems(getAllReferences());
        comboReference.setText(Util.getParticleReferenceName(curXSDParticle));

        if (curXSDParticle != null) {
            spinMin.setSelection(curXSDParticle.getMinOccurs());
            spinMax.setSelection(curXSDParticle.getMaxOccurs());
        }
    }

    private void initUIListeners() {

        initUIListenerForComboReference();
    }

    private void initUIListenerForComboReference() {

        comboReference.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseDown(MouseEvent e) {
                comboReference.setItems(getAllReferences());
            }

        });

        comboReference.addSelectionListener(new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {

                refresh();
            }

        });
    }

    private String[] getAllReferences() {

        ArrayList<String> elementDeclarations = new ArrayList<String>();
        elementDeclarations.add("");

        if (curXSDParticle == null)
            return elementDeclarations.toArray(new String[0]);

        for (XSDElementDeclaration eachXSDEleDeclaration : curXSDParticle.getSchema().getElementDeclarations()) {
            if (eachXSDEleDeclaration.getTargetNamespace() != null
                    && eachXSDEleDeclaration.getTargetNamespace().equals(IConstants.DEFAULT_NAME_SPACE))
                continue;

            elementDeclarations.add(eachXSDEleDeclaration.getQName()
                    + (eachXSDEleDeclaration.getTargetNamespace() != null ? " : " + eachXSDEleDeclaration.getTargetNamespace()
                            : ""));
        }

        return elementDeclarations.toArray(new String[0]);
    }
}