// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation ��1.1.2_01������� R40��
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;


public class WSProcessFileUsingTransformer {
    protected java.lang.String fileName;
    protected java.lang.String contentType;
    protected com.amalto.workbench.webservices.WSTransformerPK wsTransformerPK;
    protected com.amalto.workbench.webservices.WSOutputDecisionTable wsOutputDecisionTable;
    
    public WSProcessFileUsingTransformer() {
    }
    
    public WSProcessFileUsingTransformer(java.lang.String fileName, java.lang.String contentType, com.amalto.workbench.webservices.WSTransformerPK wsTransformerPK, com.amalto.workbench.webservices.WSOutputDecisionTable wsOutputDecisionTable) {
        this.fileName = fileName;
        this.contentType = contentType;
        this.wsTransformerPK = wsTransformerPK;
        this.wsOutputDecisionTable = wsOutputDecisionTable;
    }
    
    public java.lang.String getFileName() {
        return fileName;
    }
    
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }
    
    public java.lang.String getContentType() {
        return contentType;
    }
    
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }
    
    public com.amalto.workbench.webservices.WSTransformerPK getWsTransformerPK() {
        return wsTransformerPK;
    }
    
    public void setWsTransformerPK(com.amalto.workbench.webservices.WSTransformerPK wsTransformerPK) {
        this.wsTransformerPK = wsTransformerPK;
    }
    
    public com.amalto.workbench.webservices.WSOutputDecisionTable getWsOutputDecisionTable() {
        return wsOutputDecisionTable;
    }
    
    public void setWsOutputDecisionTable(com.amalto.workbench.webservices.WSOutputDecisionTable wsOutputDecisionTable) {
        this.wsOutputDecisionTable = wsOutputDecisionTable;
    }
}