package mc_style.functions.soap.sap.document.sap_com;

public class Z_CA_057B_LISTA_REG_INSPECCIONProxy implements mc_style.functions.soap.sap.document.sap_com.Z_CA_057B_LISTA_REG_INSPECCION_PortType {
  private String _endpoint = null;
  private mc_style.functions.soap.sap.document.sap_com.Z_CA_057B_LISTA_REG_INSPECCION_PortType z_CA_057B_LISTA_REG_INSPECCION_PortType = null;
  
  public Z_CA_057B_LISTA_REG_INSPECCIONProxy() {
    _initZ_CA_057B_LISTA_REG_INSPECCIONProxy();
  }
  
  public Z_CA_057B_LISTA_REG_INSPECCIONProxy(String endpoint) {
    _endpoint = endpoint;
    _initZ_CA_057B_LISTA_REG_INSPECCIONProxy();
  }
  
  private void _initZ_CA_057B_LISTA_REG_INSPECCIONProxy() {
    try {
      z_CA_057B_LISTA_REG_INSPECCION_PortType = (new mc_style.functions.soap.sap.document.sap_com.Z_CA_057B_LISTA_REG_INSPECCION_ServiceLocator()).getZ_CA_057B_LISTA_REG_INSPECCION();
      if (z_CA_057B_LISTA_REG_INSPECCION_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)z_CA_057B_LISTA_REG_INSPECCION_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)z_CA_057B_LISTA_REG_INSPECCION_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (z_CA_057B_LISTA_REG_INSPECCION_PortType != null)
      ((javax.xml.rpc.Stub)z_CA_057B_LISTA_REG_INSPECCION_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mc_style.functions.soap.sap.document.sap_com.Z_CA_057B_LISTA_REG_INSPECCION_PortType getZ_CA_057B_LISTA_REG_INSPECCION_PortType() {
    if (z_CA_057B_LISTA_REG_INSPECCION_PortType == null)
      _initZ_CA_057B_LISTA_REG_INSPECCIONProxy();
    return z_CA_057B_LISTA_REG_INSPECCION_PortType;
  }
  
  public void ZCa057BListaRegInspeccion(java.lang.String ICodMatSembrado, java.lang.String IIdAsignPos, java.lang.String IIdAsignacion, java.lang.String IIdInspeccion, java.lang.String IIdPlanificPos, mc_style.functions.soap.sap.document.sap_com.holders.ZtymmInspeccionHolder EInspeccion, mc_style.functions.soap.sap.document.sap_com.holders.ZtymmInspeccionItemHolder EInspeccionItem, mc_style.functions.soap.sap.document.sap_com.holders.ZsmmHeadInspeccionHolder ESHeadInspeccion, mc_style.functions.soap.sap.document.sap_com.holders.Bapiret2THolder e_057Return) throws java.rmi.RemoteException{
    if (z_CA_057B_LISTA_REG_INSPECCION_PortType == null)
      _initZ_CA_057B_LISTA_REG_INSPECCIONProxy();
    z_CA_057B_LISTA_REG_INSPECCION_PortType.ZCa057BListaRegInspeccion(ICodMatSembrado, IIdAsignPos, IIdAsignacion, IIdInspeccion, IIdPlanificPos, EInspeccion, EInspeccionItem, ESHeadInspeccion, e_057Return);
  }
  
  
}