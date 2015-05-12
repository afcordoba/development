/**
 * ZMM_EXTRACTOR_LOCALIDADES_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public class ZMM_EXTRACTOR_LOCALIDADES_ServiceLocator extends org.apache.axis.client.Service implements mc_style.functions.soap.sap.document.sap_com.ZMM_EXTRACTOR_LOCALIDADES_Service {

    public ZMM_EXTRACTOR_LOCALIDADES_ServiceLocator() {
    }


    public ZMM_EXTRACTOR_LOCALIDADES_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ZMM_EXTRACTOR_LOCALIDADES_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ZMM_EXTRACTOR_LOCALIDADES
    
    // TODO c2330103.of1.net
    //private java.lang.String ZMM_EXTRACTOR_LOCALIDADES_address = "http://c2330103.of1.net:8000/sap/bc/srt/rfc/sap/zmm_extractor_localidades/300/zmm_extractor_localidades/zmm_extractor_localidades";
  //  private java.lang.String ZMM_EXTRACTOR_LOCALIDADES_address = "http://c2340103.of1.net:8001/sap/bc/srt/rfc/sap/zmm_extractor_localidades/200/zmm_extractor_localidades/zmm_extractor_localidades";
    //private java.lang.String ZMM_EXTRACTOR_LOCALIDADES_address = "http://c2340103.of1.net:8000/sap/bc/srt/rfc/sap/zmm_extractor_localidades/110/zmm_extractor_localidades/zmm_extractor_localidades";

    
    private java.lang.String ZMM_EXTRACTOR_LOCALIDADES_address = "http://200.51.229.243:8000/sap/bc/srt/rfc/sap/zmm_extractor_localidades/300/zmm_extractor_localidades/zmm_extractor_localidades";

    
    public java.lang.String getZMM_EXTRACTOR_LOCALIDADESAddress() {
        return ZMM_EXTRACTOR_LOCALIDADES_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ZMM_EXTRACTOR_LOCALIDADESWSDDServiceName = "ZMM_EXTRACTOR_LOCALIDADES";

    public java.lang.String getZMM_EXTRACTOR_LOCALIDADESWSDDServiceName() {
        return ZMM_EXTRACTOR_LOCALIDADESWSDDServiceName;
    }

    public void setZMM_EXTRACTOR_LOCALIDADESWSDDServiceName(java.lang.String name) {
        ZMM_EXTRACTOR_LOCALIDADESWSDDServiceName = name;
    }

    public mc_style.functions.soap.sap.document.sap_com.ZMM_EXTRACTOR_LOCALIDADES_PortType getZMM_EXTRACTOR_LOCALIDADES() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ZMM_EXTRACTOR_LOCALIDADES_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getZMM_EXTRACTOR_LOCALIDADES(endpoint);
    }

    public mc_style.functions.soap.sap.document.sap_com.ZMM_EXTRACTOR_LOCALIDADES_PortType getZMM_EXTRACTOR_LOCALIDADES(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mc_style.functions.soap.sap.document.sap_com.ZMM_EXTRACTOR_LOCALIDADES_BindingStub _stub = new mc_style.functions.soap.sap.document.sap_com.ZMM_EXTRACTOR_LOCALIDADES_BindingStub(portAddress, this);
            _stub.setPortName(getZMM_EXTRACTOR_LOCALIDADESWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setZMM_EXTRACTOR_LOCALIDADESEndpointAddress(java.lang.String address) {
        ZMM_EXTRACTOR_LOCALIDADES_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mc_style.functions.soap.sap.document.sap_com.ZMM_EXTRACTOR_LOCALIDADES_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mc_style.functions.soap.sap.document.sap_com.ZMM_EXTRACTOR_LOCALIDADES_BindingStub _stub = new mc_style.functions.soap.sap.document.sap_com.ZMM_EXTRACTOR_LOCALIDADES_BindingStub(new java.net.URL(ZMM_EXTRACTOR_LOCALIDADES_address), this);
                _stub.setPortName(getZMM_EXTRACTOR_LOCALIDADESWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ZMM_EXTRACTOR_LOCALIDADES".equals(inputPortName)) {
            return getZMM_EXTRACTOR_LOCALIDADES();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZMM_EXTRACTOR_LOCALIDADES");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZMM_EXTRACTOR_LOCALIDADES"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ZMM_EXTRACTOR_LOCALIDADES".equals(portName)) {
            setZMM_EXTRACTOR_LOCALIDADESEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
