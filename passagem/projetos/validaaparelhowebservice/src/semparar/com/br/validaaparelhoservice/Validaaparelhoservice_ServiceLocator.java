/**
 * Validaaparelhoservice_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package semparar.com.br.validaaparelhoservice;

public class Validaaparelhoservice_ServiceLocator extends org.apache.axis.client.Service implements semparar.com.br.validaaparelhoservice.Validaaparelhoservice_Service {

    public Validaaparelhoservice_ServiceLocator() {
    }


    public Validaaparelhoservice_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Validaaparelhoservice_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for validaaparelhoserviceSOAP
    private java.lang.String validaaparelhoserviceSOAP_address = "http://www.semparar.com.br/";

    public java.lang.String getvalidaaparelhoserviceSOAPAddress() {
        return validaaparelhoserviceSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String validaaparelhoserviceSOAPWSDDServiceName = "validaaparelhoserviceSOAP";

    public java.lang.String getvalidaaparelhoserviceSOAPWSDDServiceName() {
        return validaaparelhoserviceSOAPWSDDServiceName;
    }

    public void setvalidaaparelhoserviceSOAPWSDDServiceName(java.lang.String name) {
        validaaparelhoserviceSOAPWSDDServiceName = name;
    }

    public semparar.com.br.validaaparelhoservice.Validaaparelhoservice_PortType getvalidaaparelhoserviceSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(validaaparelhoserviceSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getvalidaaparelhoserviceSOAP(endpoint);
    }

    public semparar.com.br.validaaparelhoservice.Validaaparelhoservice_PortType getvalidaaparelhoserviceSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            semparar.com.br.validaaparelhoservice.ValidaaparelhoserviceSOAPStub _stub = new semparar.com.br.validaaparelhoservice.ValidaaparelhoserviceSOAPStub(portAddress, this);
            _stub.setPortName(getvalidaaparelhoserviceSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setvalidaaparelhoserviceSOAPEndpointAddress(java.lang.String address) {
        validaaparelhoserviceSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (semparar.com.br.validaaparelhoservice.Validaaparelhoservice_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                semparar.com.br.validaaparelhoservice.ValidaaparelhoserviceSOAPStub _stub = new semparar.com.br.validaaparelhoservice.ValidaaparelhoserviceSOAPStub(new java.net.URL(validaaparelhoserviceSOAP_address), this);
                _stub.setPortName(getvalidaaparelhoserviceSOAPWSDDServiceName());
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
        if ("validaaparelhoserviceSOAP".equals(inputPortName)) {
            return getvalidaaparelhoserviceSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://br.com.semparar/validaaparelhoservice/", "validaaparelhoservice");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://br.com.semparar/validaaparelhoservice/", "validaaparelhoserviceSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("validaaparelhoserviceSOAP".equals(portName)) {
            setvalidaaparelhoserviceSOAPEndpointAddress(address);
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
