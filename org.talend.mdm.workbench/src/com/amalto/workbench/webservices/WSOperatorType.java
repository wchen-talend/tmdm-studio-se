// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation ��1.1.2_01������� R40��
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;


import java.util.Map;
import java.util.HashMap;

public class WSOperatorType {
    private java.lang.String value;
    private static Map valueMap = new HashMap();
    public static final String _UPDATEString = "UPDATE";
    public static final String _INSERTString = "INSERT";
    public static final String _DELETEString = "DELETE";
    
    public static final java.lang.String _UPDATE = new java.lang.String(_UPDATEString);
    public static final java.lang.String _INSERT = new java.lang.String(_INSERTString);
    public static final java.lang.String _DELETE = new java.lang.String(_DELETEString);
    
    public static final WSOperatorType UPDATE = new WSOperatorType(_UPDATE);
    public static final WSOperatorType INSERT = new WSOperatorType(_INSERT);
    public static final WSOperatorType DELETE = new WSOperatorType(_DELETE);
    
    protected WSOperatorType(java.lang.String value) {
        this.value = value;
        valueMap.put(this.toString(), this);
    }
    
    public java.lang.String getValue() {
        return value;
    }
    
    public static WSOperatorType fromValue(java.lang.String value)
        throws java.lang.IllegalStateException {
        if (UPDATE.value.equals(value)) {
            return UPDATE;
        } else if (INSERT.value.equals(value)) {
            return INSERT;
        } else if (DELETE.value.equals(value)) {
            return DELETE;
        }
        throw new IllegalArgumentException();
    }
    
    public static WSOperatorType fromString(String value)
        throws java.lang.IllegalStateException {
        WSOperatorType ret = (WSOperatorType)valueMap.get(value);
        if (ret != null) {
            return ret;
        }
        if (value.equals(_UPDATEString)) {
            return UPDATE;
        } else if (value.equals(_INSERTString)) {
            return INSERT;
        } else if (value.equals(_DELETEString)) {
            return DELETE;
        }
        throw new IllegalArgumentException();
    }
    
    public String toString() {
        return value.toString();
    }
    
    private Object readResolve()
        throws java.io.ObjectStreamException {
        return fromValue(getValue());
    }
    
    public boolean equals(Object obj) {
        if (!(obj instanceof WSOperatorType)) {
            return false;
        }
        return ((WSOperatorType)obj).value.equals(value);
    }
    
    public int hashCode() {
        return value.hashCode();
    }
}
