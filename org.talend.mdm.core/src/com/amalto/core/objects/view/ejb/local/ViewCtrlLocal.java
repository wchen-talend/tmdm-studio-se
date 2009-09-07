/*
 * Generated by XDoclet - Do not edit!
 */
package com.amalto.core.objects.view.ejb.local;

/**
 * Local interface for ViewCtrl.
 * @xdoclet-generated at 7-09-09
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */
public interface ViewCtrlLocal
   extends javax.ejb.EJBLocalObject
{
   /**
    * Creates or updates a View
    * @throws XtentisException
    */
   public com.amalto.core.objects.view.ejb.ViewPOJOPK putView( com.amalto.core.objects.view.ejb.ViewPOJO view ) throws com.amalto.core.util.XtentisException;

   /**
    * Get item
    * @throws XtentisException
    */
   public com.amalto.core.objects.view.ejb.ViewPOJO getView( com.amalto.core.objects.view.ejb.ViewPOJOPK pk ) throws com.amalto.core.util.XtentisException;

   /**
    * Get a View - no exception is thrown: returns null if not found
    * @throws XtentisException
    */
   public com.amalto.core.objects.view.ejb.ViewPOJO existsView( com.amalto.core.objects.view.ejb.ViewPOJOPK pk ) throws com.amalto.core.util.XtentisException;

   /**
    * Remove an item
    * @throws XtentisException
    */
   public com.amalto.core.objects.view.ejb.ViewPOJOPK removeView( com.amalto.core.objects.view.ejb.ViewPOJOPK pk ) throws com.amalto.core.util.XtentisException;

   /**
    * Retrieve all View PKS
    * @throws XtentisException
    */
   public java.util.Collection getViewPKs( java.lang.String regex ) throws com.amalto.core.util.XtentisException;

   /**
    * Retrieve all Views
    * @throws XtentisException
    */
   public java.util.ArrayList getAllViews( java.lang.String regex ) throws com.amalto.core.util.XtentisException;

}
