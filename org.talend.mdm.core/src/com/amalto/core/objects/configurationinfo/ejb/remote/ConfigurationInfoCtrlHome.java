/*
 * Generated by XDoclet - Do not edit!
 */
package com.amalto.core.objects.configurationinfo.ejb.remote;

/**
 * Home interface for ConfigurationInfoCtrl.
 * @xdoclet-generated at 7-09-09
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */
public interface ConfigurationInfoCtrlHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/ConfigurationInfoCtrl";
   public static final String JNDI_NAME="amalto/remote/core/configurationinfoctrl";

   public com.amalto.core.objects.configurationinfo.ejb.remote.ConfigurationInfoCtrl create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
