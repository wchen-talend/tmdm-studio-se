/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.mdm.repository.model.mdmproperties.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.talend.core.model.properties.PropertiesPackage;
import org.talend.mdm.repository.model.mdmmetadata.MdmmetadataPackage;
import org.talend.mdm.repository.model.mdmproperties.MDMItem;
import org.talend.mdm.repository.model.mdmproperties.MDMServerDefItem;
import org.talend.mdm.repository.model.mdmproperties.MdmpropertiesFactory;
import org.talend.mdm.repository.model.mdmproperties.MdmpropertiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MdmpropertiesPackageImpl extends EPackageImpl implements MdmpropertiesPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mdmItemEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mdmServerDefItemEClass = null;

	/**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.talend.mdm.repository.model.mdmproperties.MdmpropertiesPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private MdmpropertiesPackageImpl() {
        super(eNS_URI, MdmpropertiesFactory.eINSTANCE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static boolean isInited = false;

	/**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link MdmpropertiesPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static MdmpropertiesPackage init() {
        if (isInited) return (MdmpropertiesPackage)EPackage.Registry.INSTANCE.getEPackage(MdmpropertiesPackage.eNS_URI);

        // Obtain or create and register package
        MdmpropertiesPackageImpl theMdmpropertiesPackage = (MdmpropertiesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MdmpropertiesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MdmpropertiesPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        MdmmetadataPackage.eINSTANCE.eClass();
        PropertiesPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theMdmpropertiesPackage.createPackageContents();

        // Initialize created meta-data
        theMdmpropertiesPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theMdmpropertiesPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(MdmpropertiesPackage.eNS_URI, theMdmpropertiesPackage);
        return theMdmpropertiesPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMDMItem() {
        return mdmItemEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMDMServerDefItem() {
        return mdmServerDefItemEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getMDMServerDefItem_ServerDef() {
        return (EReference)mdmServerDefItemEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MdmpropertiesFactory getMdmpropertiesFactory() {
        return (MdmpropertiesFactory)getEFactoryInstance();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isCreated = false;

	/**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        mdmItemEClass = createEClass(MDM_ITEM);

        mdmServerDefItemEClass = createEClass(MDM_SERVER_DEF_ITEM);
        createEReference(mdmServerDefItemEClass, MDM_SERVER_DEF_ITEM__SERVER_DEF);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isInitialized = false;

	/**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        PropertiesPackage thePropertiesPackage = (PropertiesPackage)EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI);
        MdmmetadataPackage theMdmmetadataPackage = (MdmmetadataPackage)EPackage.Registry.INSTANCE.getEPackage(MdmmetadataPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        mdmItemEClass.getESuperTypes().add(thePropertiesPackage.getItem());
        mdmServerDefItemEClass.getESuperTypes().add(this.getMDMItem());

        // Initialize classes and features; add operations and parameters
        initEClass(mdmItemEClass, MDMItem.class, "MDMItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(mdmServerDefItemEClass, MDMServerDefItem.class, "MDMServerDefItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMDMServerDefItem_ServerDef(), theMdmmetadataPackage.getMDMServerDef(), null, "serverDef", null, 0, 1, MDMServerDefItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //MdmpropertiesPackageImpl