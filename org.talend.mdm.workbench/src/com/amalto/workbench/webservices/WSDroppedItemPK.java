// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation ��1.1.2_01������� R40��
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;


public class WSDroppedItemPK {
    protected com.amalto.workbench.webservices.WSItemPK wsItemPK;
    protected java.lang.String partPath;
    protected java.lang.String revisionId;
    
    public WSDroppedItemPK() {
    }
    
    public WSDroppedItemPK(com.amalto.workbench.webservices.WSItemPK wsItemPK, java.lang.String partPath, java.lang.String revisionId) {
        this.wsItemPK = wsItemPK;
        this.partPath = partPath;
        this.revisionId = revisionId;
    }
    
    public com.amalto.workbench.webservices.WSItemPK getWsItemPK() {
        return wsItemPK;
    }
    
    public void setWsItemPK(com.amalto.workbench.webservices.WSItemPK wsItemPK) {
        this.wsItemPK = wsItemPK;
    }
    
    public java.lang.String getPartPath() {
        return partPath;
    }
    
    public void setPartPath(java.lang.String partPath) {
        this.partPath = partPath;
    }
    
    public java.lang.String getRevisionId() {
        return revisionId;
    }
    
    public void setRevisionId(java.lang.String revisionId) {
        this.revisionId = revisionId;
    }
}
