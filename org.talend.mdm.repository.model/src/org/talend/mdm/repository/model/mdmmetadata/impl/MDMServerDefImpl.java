/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package org.talend.mdm.repository.model.mdmmetadata.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.talend.core.model.metadata.builder.connection.impl.AbstractMetadataObjectImpl;
import org.talend.mdm.repository.model.mdmmetadata.MDMServerDef;
import org.talend.mdm.repository.model.mdmmetadata.MdmmetadataPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>MDM Server Def</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.talend.mdm.repository.model.mdmmetadata.impl.MDMServerDefImpl#getHost <em>Host</em>}</li>
 * <li>{@link org.talend.mdm.repository.model.mdmmetadata.impl.MDMServerDefImpl#getPasswd <em>Passwd</em>}</li>
 * <li>{@link org.talend.mdm.repository.model.mdmmetadata.impl.MDMServerDefImpl#getPath <em>Path</em>}</li>
 * <li>{@link org.talend.mdm.repository.model.mdmmetadata.impl.MDMServerDefImpl#getPort <em>Port</em>}</li>
 * <li>{@link org.talend.mdm.repository.model.mdmmetadata.impl.MDMServerDefImpl#getUniverse <em>Universe</em>}</li>
 * <li>{@link org.talend.mdm.repository.model.mdmmetadata.impl.MDMServerDefImpl#getUrl <em>Url</em>}</li>
 * <li>{@link org.talend.mdm.repository.model.mdmmetadata.impl.MDMServerDefImpl#getUser <em>User</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MDMServerDefImpl extends AbstractMetadataObjectImpl implements MDMServerDef {

    /**
     * The default value of the '{@link #getHost() <em>Host</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getHost()
     * @generated
     * @ordered
     */
    protected static final String HOST_EDEFAULT = "localhost"; //$NON-NLS-1$

    protected static final String NAME_DEFAULT = ""; //$NON-NLS-1$

    /**
     * The cached value of the '{@link #getHost() <em>Host</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getHost()
     * @generated
     * @ordered
     */
    protected String host = HOST_EDEFAULT;

    /**
     * The default value of the '{@link #getPasswd() <em>Passwd</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getPasswd()
     * @generated NOT
     * @ordered
     */
    protected static final String PASSWD_EDEFAULT = ""; //$NON-NLS-1$

    /**
     * The cached value of the '{@link #getPasswd() <em>Passwd</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getPasswd()
     * @generated
     * @ordered
     */
    protected String passwd = PASSWD_EDEFAULT;

    /**
     * The default value of the '{@link #getPath() <em>Path</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getPath()
     * @generated NOT
     * @ordered
     */
    protected static final String PATH_EDEFAULT = "/talend/TalendPort"; //$NON-NLS-1$

    /**
     * The cached value of the '{@link #getPath() <em>Path</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getPath()
     * @generated
     * @ordered
     */
    protected String path = PATH_EDEFAULT;

    /**
     * The default value of the '{@link #getPort() <em>Port</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getPort()
     * @generated NOT
     * @ordered
     */
    protected static final String PORT_EDEFAULT = "8080"; //$NON-NLS-1$

    /**
     * The cached value of the '{@link #getPort() <em>Port</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getPort()
     * @generated
     * @ordered
     */
    protected String port = PORT_EDEFAULT;

    /**
     * The default value of the '{@link #getUniverse() <em>Universe</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getUniverse()
     * @generated NOT
     * @ordered
     */
    protected static final String UNIVERSE_EDEFAULT = ""; //$NON-NLS-1$

    /**
     * The cached value of the '{@link #getUniverse() <em>Universe</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see #getUniverse()
     * @generated
     * @ordered
     */
    protected String universe = UNIVERSE_EDEFAULT;

    /**
     * The default value of the '{@link #getUrl() <em>Url</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getUrl()
     * @generated
     * @ordered
     */
    protected static final String URL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getUrl()
     * @generated
     * @ordered
     */
    protected String url = URL_EDEFAULT;

    /**
     * The default value of the '{@link #getUser() <em>User</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getUser()
     * @generated NOT
     * @ordered
     */
    protected static final String USER_EDEFAULT = ""; //$NON-NLS-1$

    /**
     * The cached value of the '{@link #getUser() <em>User</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @see #getUser()
     * @generated
     * @ordered
     */
    protected String user = USER_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    protected MDMServerDefImpl() {
        super();
        label = NAME_DEFAULT;
        name = NAME_DEFAULT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MdmmetadataPackage.Literals.MDM_SERVER_DEF;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getHost() {
        return host;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setHost(String newHost) {
        String oldHost = host;
        host = newHost;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MdmmetadataPackage.MDM_SERVER_DEF__HOST, oldHost, host));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setPasswd(String newPasswd) {
        String oldPasswd = passwd;
        passwd = newPasswd;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MdmmetadataPackage.MDM_SERVER_DEF__PASSWD, oldPasswd, passwd));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getPath() {
        return path;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setPath(String newPath) {
        String oldPath = path;
        path = newPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MdmmetadataPackage.MDM_SERVER_DEF__PATH, oldPath, path));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getPort() {
        return port;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setPort(String newPort) {
        String oldPort = port;
        port = newPort;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MdmmetadataPackage.MDM_SERVER_DEF__PORT, oldPort, port));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getUniverse() {
        return universe;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setUniverse(String newUniverse) {
        String oldUniverse = universe;
        universe = newUniverse;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MdmmetadataPackage.MDM_SERVER_DEF__UNIVERSE, oldUniverse,
                    universe));
    }

    private static final String PATTERN_URL = "^http://(.+):(\\d+)(/.*)";//$NON-NLS-1$

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public String getUrl() {
        if (url == null) {
            StringBuffer sb = new StringBuffer();
            sb.append("http://");
            sb.append(host);
            sb.append(":");//$NON-NLS-1$
            sb.append(port);
            sb.append(path);
            url = sb.toString();
        }
        return url;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setUrl(String newUrl) {
        String oldUrl = url;
        url = newUrl;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MdmmetadataPackage.MDM_SERVER_DEF__URL, oldUrl, url));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getUser() {
        return user;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setUser(String newUser) {
        String oldUser = user;
        user = newUser;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MdmmetadataPackage.MDM_SERVER_DEF__USER, oldUser, user));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public boolean validate(String url) {
        if (url == null || url.length() == 0)
            return false;
        Matcher m = Pattern.compile(PATTERN_URL).matcher(url);
        return m.find();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public MDMServerDef parse(String url) {
        Matcher m = Pattern.compile(PATTERN_URL).matcher(url);

        if (!m.find())
            return null;

        host = m.group(1);
        port = m.group(2);
        path = m.group(3);
        return this;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case MdmmetadataPackage.MDM_SERVER_DEF__HOST:
            return getHost();
        case MdmmetadataPackage.MDM_SERVER_DEF__PASSWD:
            return getPasswd();
        case MdmmetadataPackage.MDM_SERVER_DEF__PATH:
            return getPath();
        case MdmmetadataPackage.MDM_SERVER_DEF__PORT:
            return getPort();
        case MdmmetadataPackage.MDM_SERVER_DEF__UNIVERSE:
            return getUniverse();
        case MdmmetadataPackage.MDM_SERVER_DEF__URL:
            return getUrl();
        case MdmmetadataPackage.MDM_SERVER_DEF__USER:
            return getUser();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case MdmmetadataPackage.MDM_SERVER_DEF__HOST:
            setHost((String) newValue);
            return;
        case MdmmetadataPackage.MDM_SERVER_DEF__PASSWD:
            setPasswd((String) newValue);
            return;
        case MdmmetadataPackage.MDM_SERVER_DEF__PATH:
            setPath((String) newValue);
            return;
        case MdmmetadataPackage.MDM_SERVER_DEF__PORT:
            setPort((String) newValue);
            return;
        case MdmmetadataPackage.MDM_SERVER_DEF__UNIVERSE:
            setUniverse((String) newValue);
            return;
        case MdmmetadataPackage.MDM_SERVER_DEF__URL:
            setUrl((String) newValue);
            return;
        case MdmmetadataPackage.MDM_SERVER_DEF__USER:
            setUser((String) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case MdmmetadataPackage.MDM_SERVER_DEF__HOST:
            setHost(HOST_EDEFAULT);
            return;
        case MdmmetadataPackage.MDM_SERVER_DEF__PASSWD:
            setPasswd(PASSWD_EDEFAULT);
            return;
        case MdmmetadataPackage.MDM_SERVER_DEF__PATH:
            setPath(PATH_EDEFAULT);
            return;
        case MdmmetadataPackage.MDM_SERVER_DEF__PORT:
            setPort(PORT_EDEFAULT);
            return;
        case MdmmetadataPackage.MDM_SERVER_DEF__UNIVERSE:
            setUniverse(UNIVERSE_EDEFAULT);
            return;
        case MdmmetadataPackage.MDM_SERVER_DEF__URL:
            setUrl(URL_EDEFAULT);
            return;
        case MdmmetadataPackage.MDM_SERVER_DEF__USER:
            setUser(USER_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case MdmmetadataPackage.MDM_SERVER_DEF__HOST:
            return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
        case MdmmetadataPackage.MDM_SERVER_DEF__PASSWD:
            return PASSWD_EDEFAULT == null ? passwd != null : !PASSWD_EDEFAULT.equals(passwd);
        case MdmmetadataPackage.MDM_SERVER_DEF__PATH:
            return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
        case MdmmetadataPackage.MDM_SERVER_DEF__PORT:
            return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
        case MdmmetadataPackage.MDM_SERVER_DEF__UNIVERSE:
            return UNIVERSE_EDEFAULT == null ? universe != null : !UNIVERSE_EDEFAULT.equals(universe);
        case MdmmetadataPackage.MDM_SERVER_DEF__URL:
            return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
        case MdmmetadataPackage.MDM_SERVER_DEF__USER:
            return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
        }
        return super.eIsSet(featureID);
    }

    @Override
    public boolean isReadOnly() {
        return false;
    }

    @Override
    public void setReadOnly(boolean newReadOnly) {

    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (host: ");
        result.append(host);
        result.append(", passwd: ");
        result.append(passwd);
        result.append(", path: ");
        result.append(path);
        result.append(", port: ");
        result.append(port);
        result.append(", universe: ");
        result.append(universe);
        result.append(", url: ");
        result.append(url);
        result.append(", user: ");
        result.append(user);
        result.append(')');
        return result.toString();
    }

} // MDMServerDefImpl