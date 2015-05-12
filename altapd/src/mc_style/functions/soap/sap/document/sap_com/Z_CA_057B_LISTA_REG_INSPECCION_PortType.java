/**
 * Z_CA_057B_LISTA_REG_INSPECCION_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public interface Z_CA_057B_LISTA_REG_INSPECCION_PortType extends java.rmi.Remote {
    public void ZCa057BListaRegInspeccion(java.lang.String ICodMatSembrado, java.lang.String IIdAsignPos, java.lang.String IIdAsignacion, java.lang.String IIdInspeccion, java.lang.String IIdPlanificPos, mc_style.functions.soap.sap.document.sap_com.holders.ZtymmInspeccionHolder EInspeccion, mc_style.functions.soap.sap.document.sap_com.holders.ZtymmInspeccionItemHolder EInspeccionItem, mc_style.functions.soap.sap.document.sap_com.holders.ZsmmHeadInspeccionHolder ESHeadInspeccion, mc_style.functions.soap.sap.document.sap_com.holders.Bapiret2THolder e_057Return) throws java.rmi.RemoteException;
}
