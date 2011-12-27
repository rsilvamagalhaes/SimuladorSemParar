/**
 * Registrapassagemservice_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.nostop.registrapassagemservice;

public class Registrapassagemservice_ServiceLocator extends org.apache.axis.client.Service implements br.com.nostop.registrapassagemservice.Registrapassagemservice_Service {

    public Registrapassagemservice_ServiceLocator() {
    }


    public Registrapassagemservice_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Registrapassagemservice_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for registrapassagemserviceSOAP
    private java.lang.String registrapassagemserviceSOAP_address = "http://localhost:8080/registrapassagemwebservice/services/registrapassagemserviceSOAP";

    public java.lang.String getregistrapassagemserviceSOAPAddress() {
        return registrapassagemserviceSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String registrapassagemserviceSOAPWSDDServiceName = "registrapassagemserviceSOAP";

    public java.lang.String getregistrapassagemserviceSOAPWSDDServiceName() {
        return registrapassagemserviceSOAPWSDDServiceName;
    }

    public void setregistrapassagemserviceSOAPWSDDServiceName(java.lang.String name) {
        registrapassagemserviceSOAPWSDDServiceName = name;
    }

    public br.com.nostop.registrapassagemservice.Registrapassagemservice_PortType getregistrapassagemserviceSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(registrapassagemserviceSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getregistrapassagemserviceSOAP(endpoint);
    }

    public br.com.nostop.registrapassagemservice.Registrapassagemservice_PortType getregistrapassagemserviceSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.nostop.registrapassagemservice.RegistrapassagemserviceSOAPStub _stub = new br.com.nostop.registrapassagemservice.RegistrapassagemserviceSOAPStub(portAddress, this);
            _stub.setPortName(getregistrapassagemserviceSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setregistrapassagemserviceSOAPEndpointAddress(java.lang.String address) {
        registrapassagemserviceSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.nostop.registrapassagemservice.Registrapassagemservice_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.nostop.registrapassagemservice.RegistrapassagemserviceSOAPStub _stub = new br.com.nostop.registrapassagemservice.RegistrapassagemserviceSOAPStub(new java.net.URL(registrapassagemserviceSOAP_address), this);
                _stub.setPortName(getregistrapassagemserviceSOAPWSDDServiceName());
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
        if ("registrapassagemserviceSOAP".equals(inputPortName)) {
            return getregistrapassagemserviceSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://nostop.com.br/registrapassagemservice/", "registrapassagemservice");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://nostop.com.br/registrapassagemservice/", "registrapassagemserviceSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("registrapassagemserviceSOAP".equals(portName)) {
            setregistrapassagemserviceSOAPEndpointAddress(address);
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
