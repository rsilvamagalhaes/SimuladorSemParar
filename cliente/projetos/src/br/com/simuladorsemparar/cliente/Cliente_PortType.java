/**
 * Cliente_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.simuladorsemparar.cliente;

public interface Cliente_PortType extends java.rmi.Remote {
    public br.com.simuladorsemparar.cliente.ConsultaclienteResponse consultacliente(br.com.simuladorsemparar.cliente.ConsultaclienteRequest parameters) throws java.rmi.RemoteException;
    public br.com.simuladorsemparar.cliente.ValidarclienteResponse validarcliente(br.com.simuladorsemparar.cliente.ValidarclienteRequest parameters) throws java.rmi.RemoteException;
    public br.com.simuladorsemparar.cliente.CadastrarclienteResponse cadastrarcliente(br.com.simuladorsemparar.cliente.CadastrarclienteRequest parameters) throws java.rmi.RemoteException;
}
