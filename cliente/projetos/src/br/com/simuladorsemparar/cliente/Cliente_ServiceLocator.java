/**
 * Cliente_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.simuladorsemparar.cliente;

public class Cliente_ServiceLocator extends org.apache.axis.client.Service implements br.com.simuladorsemparar.cliente.Cliente_Service {

    public Cliente_ServiceLocator() {
    }


    public Cliente_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Cliente_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for clienteSOAP
    private java.lang.String clienteSOAP_address = "http://www.example.org/";

    public java.lang.String getclienteSOAPAddress() {
        return clienteSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String clienteSOAPWSDDServiceName = "clienteSOAP";

    public java.lang.String getclienteSOAPWSDDServiceName() {
        return clienteSOAPWSDDServiceName;
    }

    public void setclienteSOAPWSDDServiceName(java.lang.String name) {
        clienteSOAPWSDDServiceName = name;
    }

    public br.com.simuladorsemparar.cliente.Cliente_PortType getclienteSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(clienteSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getclienteSOAP(endpoint);
    }

    public br.com.simuladorsemparar.cliente.Cliente_PortType getclienteSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.simuladorsemparar.cliente.ClienteSOAPStub _stub = new br.com.simuladorsemparar.cliente.ClienteSOAPStub(portAddress, this);
            _stub.setPortName(getclienteSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setclienteSOAPEndpointAddress(java.lang.String address) {
        clienteSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.simuladorsemparar.cliente.Cliente_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.simuladorsemparar.cliente.ClienteSOAPStub _stub = new br.com.simuladorsemparar.cliente.ClienteSOAPStub(new java.net.URL(clienteSOAP_address), this);
                _stub.setPortName(getclienteSOAPWSDDServiceName());
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
        if ("clienteSOAP".equals(inputPortName)) {
            return getclienteSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", "cliente");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", "clienteSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("clienteSOAP".equals(portName)) {
            setclienteSOAPEndpointAddress(address);
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
