package mc_style.functions.soap.sap.document.sap_com;

public class Z_CA_915_MD_AVANCE_COSECHAProxy implements mc_style.functions.soap.sap.document.sap_com.Z_CA_915_MD_AVANCE_COSECHA_PortType {
  private String _endpoint = null;
  private mc_style.functions.soap.sap.document.sap_com.Z_CA_915_MD_AVANCE_COSECHA_PortType z_CA_915_MD_AVANCE_COSECHA_PortType = null;
  
  public Z_CA_915_MD_AVANCE_COSECHAProxy() {
    _initZ_CA_915_MD_AVANCE_COSECHAProxy();
  }
  
  public Z_CA_915_MD_AVANCE_COSECHAProxy(String endpoint) {
    _endpoint = endpoint;
    _initZ_CA_915_MD_AVANCE_COSECHAProxy();
  }
  
  private void _initZ_CA_915_MD_AVANCE_COSECHAProxy() {
    try {
      z_CA_915_MD_AVANCE_COSECHA_PortType = (new mc_style.functions.soap.sap.document.sap_com.Z_CA_915_MD_AVANCE_COSECHA_ServiceLocator()).getZ_CA_915_MD_AVANCE_COSECHA();
      if (z_CA_915_MD_AVANCE_COSECHA_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)z_CA_915_MD_AVANCE_COSECHA_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)z_CA_915_MD_AVANCE_COSECHA_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (z_CA_915_MD_AVANCE_COSECHA_PortType != null)
      ((javax.xml.rpc.Stub)z_CA_915_MD_AVANCE_COSECHA_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mc_style.functions.soap.sap.document.sap_com.Z_CA_915_MD_AVANCE_COSECHA_PortType getZ_CA_915_MD_AVANCE_COSECHA_PortType() {
    if (z_CA_915_MD_AVANCE_COSECHA_PortType == null)
      _initZ_CA_915_MD_AVANCE_COSECHAProxy();
    return z_CA_915_MD_AVANCE_COSECHA_PortType;
  }
  
  public mc_style.functions.soap.sap.document.sap_com.Bapiret2[] ZCa915MdAvanceCosecha(java.lang.String IEstPlanDiaro, java.lang.String IHaPlanificadasHoy, java.lang.String IPlanDiario) throws java.rmi.RemoteException{
    if (z_CA_915_MD_AVANCE_COSECHA_PortType == null)
      _initZ_CA_915_MD_AVANCE_COSECHAProxy();
    return z_CA_915_MD_AVANCE_COSECHA_PortType.ZCa915MdAvanceCosecha(IEstPlanDiaro, IHaPlanificadasHoy, IPlanDiario);
  }
  
  
}