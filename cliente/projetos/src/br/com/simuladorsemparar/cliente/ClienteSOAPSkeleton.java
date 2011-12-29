/**
 * ClienteSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.simuladorsemparar.cliente;

public class ClienteSOAPSkeleton implements br.com.simuladorsemparar.cliente.Cliente_PortType, org.apache.axis.wsdl.Skeleton {
    private br.com.simuladorsemparar.cliente.Cliente_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", "consultaclienteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", ">consultaclienteRequest"), br.com.simuladorsemparar.cliente.ConsultaclienteRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("consultacliente", _params, new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", "consultaclienteResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", ">consultaclienteResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "consultacliente"));
        _oper.setSoapAction("http://simuladorsemparar.com.br/cliente/consultacliente");
        _myOperationsList.add(_oper);
        if (_myOperations.get("consultacliente") == null) {
            _myOperations.put("consultacliente", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("consultacliente")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", "validarclienteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", ">validarclienteRequest"), br.com.simuladorsemparar.cliente.ValidarclienteRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("validarcliente", _params, new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", "validarclienteResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", ">validarclienteResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "validarcliente"));
        _oper.setSoapAction("http://soaexpert.com.br/cliente/validarcliente");
        _myOperationsList.add(_oper);
        if (_myOperations.get("validarcliente") == null) {
            _myOperations.put("validarcliente", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("validarcliente")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", "cadastrarclienteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", ">cadastrarclienteRequest"), br.com.simuladorsemparar.cliente.CadastrarclienteRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("cadastrarcliente", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("", "cadastrarcliente"));
        _oper.setSoapAction("http://soaexpert.com.br/cliente/cadastrarcliente");
        _myOperationsList.add(_oper);
        if (_myOperations.get("cadastrarcliente") == null) {
            _myOperations.put("cadastrarcliente", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("cadastrarcliente")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", "atualizarclienteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", ">atualizarclienteRequest"), br.com.simuladorsemparar.cliente.AtualizarclienteRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("atualizarcliente", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("", "atualizarcliente"));
        _oper.setSoapAction("http://soaexpert.com.br/cliente/atualizarcliente");
        _myOperationsList.add(_oper);
        if (_myOperations.get("atualizarcliente") == null) {
            _myOperations.put("atualizarcliente", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("atualizarcliente")).add(_oper);
    }

    public ClienteSOAPSkeleton() {
        this.impl = new br.com.simuladorsemparar.cliente.ClienteSOAPImpl();
    }

    public ClienteSOAPSkeleton(br.com.simuladorsemparar.cliente.Cliente_PortType impl) {
        this.impl = impl;
    }
    public br.com.simuladorsemparar.cliente.ConsultaclienteResponse consultacliente(br.com.simuladorsemparar.cliente.ConsultaclienteRequest parameters) throws java.rmi.RemoteException
    {
        br.com.simuladorsemparar.cliente.ConsultaclienteResponse ret = impl.consultacliente(parameters);
        return ret;
    }

    public br.com.simuladorsemparar.cliente.ValidarclienteResponse validarcliente(br.com.simuladorsemparar.cliente.ValidarclienteRequest parameters) throws java.rmi.RemoteException
    {
        br.com.simuladorsemparar.cliente.ValidarclienteResponse ret = impl.validarcliente(parameters);
        return ret;
    }

    public void cadastrarcliente(br.com.simuladorsemparar.cliente.CadastrarclienteRequest parameters) throws java.rmi.RemoteException
    {
        impl.cadastrarcliente(parameters);
    }

    public void atualizarcliente(br.com.simuladorsemparar.cliente.AtualizarclienteRequest parameters) throws java.rmi.RemoteException
    {
        impl.atualizarcliente(parameters);
    }

}
