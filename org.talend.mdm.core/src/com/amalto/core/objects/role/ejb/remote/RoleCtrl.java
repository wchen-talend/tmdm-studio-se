/*
 * Generated by XDoclet - Do not edit!
 */
package com.amalto.core.objects.role.ejb.remote;

/**
 * Remote interface for RoleCtrl.
 * @xdoclet-generated at 13-08-09
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */
public interface RoleCtrl
   extends javax.ejb.EJBObject
{
   /**
    * Creates or updates a Role
    * @throws XtentisException
    */
   public com.amalto.core.objects.role.ejb.RolePOJOPK putRole( com.amalto.core.objects.role.ejb.RolePOJO role )
      throws com.amalto.core.util.XtentisException, java.rmi.RemoteException;

   /**
    * Get Role
    * @throws XtentisException
    */
   public com.amalto.core.objects.role.ejb.RolePOJO getRole( com.amalto.core.objects.role.ejb.RolePOJOPK pk )
      throws com.amalto.core.util.XtentisException, java.rmi.RemoteException;

   /**
    * Get a Role - no exception is thrown: returns null if not found
    * @throws XtentisException
    */
   public com.amalto.core.objects.role.ejb.RolePOJO existsRole( com.amalto.core.objects.role.ejb.RolePOJOPK pk )
      throws com.amalto.core.util.XtentisException, java.rmi.RemoteException;

   /**
    * Remove an item
    * @throws XtentisException
    */
   public com.amalto.core.objects.role.ejb.RolePOJOPK removeRole( com.amalto.core.objects.role.ejb.RolePOJOPK pk )
      throws com.amalto.core.util.XtentisException, java.rmi.RemoteException;

   /**
    * Retrieve all Role PKS
    * @throws XtentisException
    */
   public java.util.Collection getRolePKs( java.lang.String regex )
      throws com.amalto.core.util.XtentisException, java.rmi.RemoteException;

}
