/**
 * Z_CA_006_GRABAR_PLAN_DIARIO_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public class Z_CA_006_GRABAR_PLAN_DIARIO_ServiceLocator extends org.apache.axis.client.Service implements mc_style.functions.soap.sap.document.sap_com.Z_CA_006_GRABAR_PLAN_DIARIO_Service {

    public Z_CA_006_GRABAR_PLAN_DIARIO_ServiceLocator() {
    }


    public Z_CA_006_GRABAR_PLAN_DIARIO_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Z_CA_006_GRABAR_PLAN_DIARIO_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Z_CA_006_GRABAR_PLAN_DIARIO
    
    // TODO c2330103.of1.net
    //private java.lang.String Z_CA_006_GRABAR_PLAN_DIARIO_address = "http://c2330103.of1.net:8000/sap/bc/srt/rfc/sap/z_ca_006_grabar_plan_diario/300/z_ca_006_grabar_plan_diario/z_ca_006_grabar_plan_diario";
    // private java.lang.String Z_CA_006_GRABAR_PLAN_DIARIO_address = "http://c2330103.of1.net:8000/sap/bc/srt/rfc/sap/z_ca_006_grabar_plan_diario/110/z_ca_006_grabar_plan_diario/z_ca_006_grabar_plan_diario";
    // private java.lang.String Z_CA_006_GRABAR_PLAN_DIARIO_address = "http://c2340103.of1.net:8001/sap/bc/srt/rfc/sap/z_ca_006_grabar_plan_diario/200/z_ca_006_grabar_plan_diario/z_ca_006_grabar_plan_diario";
    //private java.lang.String Z_CA_006_GRABAR_PLAN_DIARIO_address = "http://c2340103.of1.net:8001/sap/bc/srt/rfc/sap/z_ca_006_grabar_plan_diario/200/z_ca_006_grabar_plan_diario/z_ca_006_grabar_plan_diario";

    private java.lang.String Z_CA_006_GRABAR_PLAN_DIARIO_address = "http://200.51.229.243:8000/sap/bc/srt/rfc/sap/z_ca_006_grabar_plan_diario/300/z_ca_006_grabar_plan_diario/z_ca_006_grabar_plan_diario";

    
    public java.lang.String getZ_CA_006_GRABAR_PLAN_DIARIOAddress() {
        return Z_CA_006_GRABAR_PLAN_DIARIO_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Z_CA_006_GRABAR_PLAN_DIARIOWSDDServiceName = "Z_CA_006_GRABAR_PLAN_DIARIO";

    public java.lang.String getZ_CA_006_GRABAR_PLAN_DIARIOWSDDServiceName() {
        return Z_CA_006_GRABAR_PLAN_DIARIOWSDDServiceName;
    }

    public void setZ_CA_006_GRABAR_PLAN_DIARIOWSDDServiceName(java.lang.String name) {
        Z_CA_006_GRABAR_PLAN_DIARIOWSDDServiceName = name;
    }

    public mc_style.functions.soap.sap.document.sap_com.Z_CA_006_GRABAR_PLAN_DIARIO_PortType getZ_CA_006_GRABAR_PLAN_DIARIO() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Z_CA_006_GRABAR_PLAN_DIARIO_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getZ_CA_006_GRABAR_PLAN_DIARIO(endpoint);
    }

    public mc_style.functions.soap.sap.document.sap_com.Z_CA_006_GRABAR_PLAN_DIARIO_PortType getZ_CA_006_GRABAR_PLAN_DIARIO(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mc_style.functions.soap.sap.document.sap_com.Z_CA_006_GRABAR_PLAN_DIARIO_BindingStub _stub = new mc_style.functions.soap.sap.document.sap_com.Z_CA_006_GRABAR_PLAN_DIARIO_BindingStub(portAddress, this);
            _stub.setPortName(getZ_CA_006_GRABAR_PLAN_DIARIOWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setZ_CA_006_GRABAR_PLAN_DIARIOEndpointAddress(java.lang.String address) {
        Z_CA_006_GRABAR_PLAN_DIARIO_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mc_style.functions.soap.sap.document.sap_com.Z_CA_006_GRABAR_PLAN_DIARIO_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mc_style.functions.soap.sap.document.sap_com.Z_CA_006_GRABAR_PLAN_DIARIO_BindingStub _stub = new mc_style.functions.soap.sap.document.sap_com.Z_CA_006_GRABAR_PLAN_DIARIO_BindingStub(new java.net.URL(Z_CA_006_GRABAR_PLAN_DIARIO_address), this);
                _stub.setPortName(getZ_CA_006_GRABAR_PLAN_DIARIOWSDDServiceName());
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
        if ("Z_CA_006_GRABAR_PLAN_DIARIO".equals(inputPortName)) {
            return getZ_CA_006_GRABAR_PLAN_DIARIO();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "Z_CA_006_GRABAR_PLAN_DIARIO");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "Z_CA_006_GRABAR_PLAN_DIARIO"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Z_CA_006_GRABAR_PLAN_DIARIO".equals(portName)) {
            setZ_CA_006_GRABAR_PLAN_DIARIOEndpointAddress(address);
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
