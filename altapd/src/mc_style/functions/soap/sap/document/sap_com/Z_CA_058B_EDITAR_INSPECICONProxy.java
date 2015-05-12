package mc_style.functions.soap.sap.document.sap_com;

public class Z_CA_058B_EDITAR_INSPECICONProxy implements mc_style.functions.soap.sap.document.sap_com.Z_CA_058B_EDITAR_INSPECICON_PortType {
  private String _endpoint = null;
  private mc_style.functions.soap.sap.document.sap_com.Z_CA_058B_EDITAR_INSPECICON_PortType z_CA_058B_EDITAR_INSPECICON_PortType = null;
  
  public Z_CA_058B_EDITAR_INSPECICONProxy() {
    _initZ_CA_058B_EDITAR_INSPECICONProxy();
  }
  
  public Z_CA_058B_EDITAR_INSPECICONProxy(String endpoint) {
    _endpoint = endpoint;
    _initZ_CA_058B_EDITAR_INSPECICONProxy();
  }
  
  private void _initZ_CA_058B_EDITAR_INSPECICONProxy() {
    try {
      z_CA_058B_EDITAR_INSPECICON_PortType = (new mc_style.functions.soap.sap.document.sap_com.Z_CA_058B_EDITAR_INSPECICON_ServiceLocator()).getZ_CA_058B_EDITAR_INSPECICON();
      if (z_CA_058B_EDITAR_INSPECICON_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)z_CA_058B_EDITAR_INSPECICON_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)z_CA_058B_EDITAR_INSPECICON_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (z_CA_058B_EDITAR_INSPECICON_PortType != null)
      ((javax.xml.rpc.Stub)z_CA_058B_EDITAR_INSPECICON_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mc_style.functions.soap.sap.document.sap_com.Z_CA_058B_EDITAR_INSPECICON_PortType getZ_CA_058B_EDITAR_INSPECICON_PortType() {
    if (z_CA_058B_EDITAR_INSPECICON_PortType == null)
      _initZ_CA_058B_EDITAR_INSPECICONProxy();
    return z_CA_058B_EDITAR_INSPECICON_PortType;
  }
  
  public mc_style.functions.soap.sap.document.sap_com.Bapiret2[] ZCa058BEditarInspecicon(java.lang.String apto, java.lang.String comentarios, java.lang.String estadoPureza, java.lang.String estados, java.lang.String fecha, java.lang.String fueraDeTipo, java.lang.String idAsignPos, java.lang.String idAsignacion, java.lang.String idInspeccion, java.lang.String idPlanificPos, java.lang.String inspector, mc_style.functions.soap.sap.document.sap_com.ZtmminspeccionI[] items, java.lang.String motivos, java.lang.String probabilidad, java.math.BigDecimal promFdt, java.lang.String r, java.math.BigDecimal rendEsperado, java.lang.String roguing, java.lang.String tipoDeInsp, java.lang.String v) throws java.rmi.RemoteException{
    if (z_CA_058B_EDITAR_INSPECICON_PortType == null)
      _initZ_CA_058B_EDITAR_INSPECICONProxy();
    return z_CA_058B_EDITAR_INSPECICON_PortType.ZCa058BEditarInspecicon(apto, comentarios, estadoPureza, estados, fecha, fueraDeTipo, idAsignPos, idAsignacion, idInspeccion, idPlanificPos, inspector, items, motivos, probabilidad, promFdt, r, rendEsperado, roguing, tipoDeInsp, v);
  }
  
  
}