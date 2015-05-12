package mc_style.functions.soap.sap.document.sap_com;

public class ZMM_EXTRACTOR_LOCALIDADESProxy implements mc_style.functions.soap.sap.document.sap_com.ZMM_EXTRACTOR_LOCALIDADES_PortType {
  private String _endpoint = null;
  private mc_style.functions.soap.sap.document.sap_com.ZMM_EXTRACTOR_LOCALIDADES_PortType zMM_EXTRACTOR_LOCALIDADES_PortType = null;
  
  public ZMM_EXTRACTOR_LOCALIDADESProxy() {
    _initZMM_EXTRACTOR_LOCALIDADESProxy();
  }
  
  public ZMM_EXTRACTOR_LOCALIDADESProxy(String endpoint) {
    _endpoint = endpoint;
    _initZMM_EXTRACTOR_LOCALIDADESProxy();
  }
  
  private void _initZMM_EXTRACTOR_LOCALIDADESProxy() {
    try {
      zMM_EXTRACTOR_LOCALIDADES_PortType = (new mc_style.functions.soap.sap.document.sap_com.ZMM_EXTRACTOR_LOCALIDADES_ServiceLocator()).getZMM_EXTRACTOR_LOCALIDADES();
      if (zMM_EXTRACTOR_LOCALIDADES_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)zMM_EXTRACTOR_LOCALIDADES_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)zMM_EXTRACTOR_LOCALIDADES_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (zMM_EXTRACTOR_LOCALIDADES_PortType != null)
      ((javax.xml.rpc.Stub)zMM_EXTRACTOR_LOCALIDADES_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mc_style.functions.soap.sap.document.sap_com.ZMM_EXTRACTOR_LOCALIDADES_PortType getZMM_EXTRACTOR_LOCALIDADES_PortType() {
    if (zMM_EXTRACTOR_LOCALIDADES_PortType == null)
      _initZMM_EXTRACTOR_LOCALIDADESProxy();
    return zMM_EXTRACTOR_LOCALIDADES_PortType;
  }
  
  public void zmmExtractorLocalidades(java.lang.String IEncargado, javax.xml.rpc.holders.StringHolder EMensaje, mc_style.functions.soap.sap.document.sap_com.holders.ZmmtLocalidadesHolder TLocalidades) throws java.rmi.RemoteException{
    if (zMM_EXTRACTOR_LOCALIDADES_PortType == null)
      _initZMM_EXTRACTOR_LOCALIDADESProxy();
    zMM_EXTRACTOR_LOCALIDADES_PortType.zmmExtractorLocalidades(IEncargado, EMensaje, TLocalidades);
  }
  
  
}