/**
 * RegistrapassagemserviceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.nostop.registrapassagemservice;

public class RegistrapassagemserviceSOAPSkeleton implements br.com.nostop.registrapassagemservice.Registrapassagemservice_PortType, org.apache.axis.wsdl.Skeleton {
    private br.com.nostop.registrapassagemservice.Registrapassagemservice_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://nostop.com.br/domain/passagem_pedagio_semparar", "PassagemEvento"), br.com.nostop.domain.passagem_pedagio_semparar.PassagemEvento.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("registraPassagem", _params, new javax.xml.namespace.QName("", "out"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://nostop.com.br/domain/passagem_pedagio_semparar", "PassagemEvento"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://nostop.com.br/registrapassagemservice/", "registraPassagem"));
        _oper.setSoapAction("http://http://nostop.com.br/registrapassagemservice/registraPassagem");
        _myOperationsList.add(_oper);
        if (_myOperations.get("registraPassagem") == null) {
            _myOperations.put("registraPassagem", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("registraPassagem")).add(_oper);
    }

    public RegistrapassagemserviceSOAPSkeleton() {
        this.impl = new br.com.nostop.registrapassagemservice.RegistrapassagemserviceSOAPImpl();
    }

    public RegistrapassagemserviceSOAPSkeleton(br.com.nostop.registrapassagemservice.Registrapassagemservice_PortType impl) {
        this.impl = impl;
    }
    public br.com.nostop.domain.passagem_pedagio_semparar.PassagemEvento registraPassagem(br.com.nostop.domain.passagem_pedagio_semparar.PassagemEvento in) throws java.rmi.RemoteException
    {
        br.com.nostop.domain.passagem_pedagio_semparar.PassagemEvento ret = impl.registraPassagem(in);
        return ret;
    }

}
