// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation ��1.1.2_01������� R40��
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;


public class WSSuspendTask {
    protected java.lang.String taskUUID;
    protected boolean assignTask;
    
    public WSSuspendTask() {
    }
    
    public WSSuspendTask(java.lang.String taskUUID, boolean assignTask) {
        this.taskUUID = taskUUID;
        this.assignTask = assignTask;
    }
    
    public java.lang.String getTaskUUID() {
        return taskUUID;
    }
    
    public void setTaskUUID(java.lang.String taskUUID) {
        this.taskUUID = taskUUID;
    }
    
    public boolean isAssignTask() {
        return assignTask;
    }
    
    public void setAssignTask(boolean assignTask) {
        this.assignTask = assignTask;
    }
}
