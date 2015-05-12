package mc_style.functions.soap.sap.document.sap_com;

public class Z_CA_001_1_LISTA_PLANIFICACIONProxy implements mc_style.functions.soap.sap.document.sap_com.Z_CA_001_1_LISTA_PLANIFICACION_PortType {
  private String _endpoint = null;
  private mc_style.functions.soap.sap.document.sap_com.Z_CA_001_1_LISTA_PLANIFICACION_PortType z_CA_001_1_LISTA_PLANIFICACION_PortType = null;
  
  public Z_CA_001_1_LISTA_PLANIFICACIONProxy() {
    _initZ_CA_001_1_LISTA_PLANIFICACIONProxy();
  }
  
  public Z_CA_001_1_LISTA_PLANIFICACIONProxy(String endpoint) {
    _endpoint = endpoint;
    _initZ_CA_001_1_LISTA_PLANIFICACIONProxy();
  }
  
  private void _initZ_CA_001_1_LISTA_PLANIFICACIONProxy() {
    try {
      z_CA_001_1_LISTA_PLANIFICACION_PortType = (new mc_style.functions.soap.sap.document.sap_com.Z_CA_001_1_LISTA_PLANIFICACION_ServiceLocator()).getZ_CA_001_1_LISTA_PLANIFICACION();
      if (z_CA_001_1_LISTA_PLANIFICACION_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)z_CA_001_1_LISTA_PLANIFICACION_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)z_CA_001_1_LISTA_PLANIFICACION_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (z_CA_001_1_LISTA_PLANIFICACION_PortType != null)
      ((javax.xml.rpc.Stub)z_CA_001_1_LISTA_PLANIFICACION_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mc_style.functions.soap.sap.document.sap_com.Z_CA_001_1_LISTA_PLANIFICACION_PortType getZ_CA_001_1_LISTA_PLANIFICACION_PortType() {
    if (z_CA_001_1_LISTA_PLANIFICACION_PortType == null)
      _initZ_CA_001_1_LISTA_PLANIFICACIONProxy();
    return z_CA_001_1_LISTA_PLANIFICACION_PortType;
  }
  
  public mc_style.functions.soap.sap.document.sap_com.ZscaDatosPlanificacion[] ZCa0011ListaPlanificacion(java.lang.String IAtributo, java.lang.String IAvanceCosecha, java.lang.String ICampana, java.lang.String ICodCampoProp, java.lang.String ICodCampoTerc, java.lang.String ICodLoteProp, java.lang.String ICodLoteTerc, java.lang.String ICodMatSembrado, java.lang.String IContratistaCose, java.lang.String ICultivo, java.lang.String IEncargado, java.lang.String IIdPlanificacion, java.lang.String IIdSector, java.lang.String INombreCliente, java.lang.String IPropTercero, java.lang.String IProveedor, java.lang.String ISociedad) throws java.rmi.RemoteException{
    if (z_CA_001_1_LISTA_PLANIFICACION_PortType == null)
      _initZ_CA_001_1_LISTA_PLANIFICACIONProxy();
    return z_CA_001_1_LISTA_PLANIFICACION_PortType.ZCa0011ListaPlanificacion(IAtributo, IAvanceCosecha, ICampana, ICodCampoProp, ICodCampoTerc, ICodLoteProp, ICodLoteTerc, ICodMatSembrado, IContratistaCose, ICultivo, IEncargado, IIdPlanificacion, IIdSector, INombreCliente, IPropTercero, IProveedor, ISociedad);
  }
  
  
}