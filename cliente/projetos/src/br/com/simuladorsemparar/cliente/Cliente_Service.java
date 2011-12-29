/**
 * Cliente_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.simuladorsemparar.cliente;

public interface Cliente_Service extends javax.xml.rpc.Service {
    public java.lang.String getclienteSOAPAddress();

    public br.com.simuladorsemparar.cliente.Cliente_PortType getclienteSOAP() throws javax.xml.rpc.ServiceException;

    public br.com.simuladorsemparar.cliente.Cliente_PortType getclienteSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
