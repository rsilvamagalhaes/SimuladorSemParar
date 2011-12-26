/**
 * ValidaaparelhoserviceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package semparar.com.br.validaaparelhoservice;

public class ValidaaparelhoserviceSOAPSkeleton implements semparar.com.br.validaaparelhoservice.Validaaparelhoservice_PortType, org.apache.axis.wsdl.Skeleton {
    private semparar.com.br.validaaparelhoservice.Validaaparelhoservice_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://nostop.com.br/domain", "aparelho_semparar"), br.com.nostop.domain.Aparelho_semparar.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("validaaparelho", _params, new javax.xml.namespace.QName("", "out"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://nostop.com.br/domain", "aparelho_semparar_validation_result"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://br.com.semparar/validaaparelhoservice/", "validaaparelho"));
        _oper.setSoapAction("http://br.com.semparar/validaaparelhoservice/validaaparelho");
        _myOperationsList.add(_oper);
        if (_myOperations.get("validaaparelho") == null) {
            _myOperations.put("validaaparelho", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("validaaparelho")).add(_oper);
    }

    public ValidaaparelhoserviceSOAPSkeleton() {
        this.impl = new semparar.com.br.validaaparelhoservice.ValidaaparelhoserviceSOAPImpl();
    }

    public ValidaaparelhoserviceSOAPSkeleton(semparar.com.br.validaaparelhoservice.Validaaparelhoservice_PortType impl) {
        this.impl = impl;
    }
    public br.com.nostop.domain.Aparelho_semparar_validation_result validaaparelho(br.com.nostop.domain.Aparelho_semparar in) throws java.rmi.RemoteException
    {
        br.com.nostop.domain.Aparelho_semparar_validation_result ret = impl.validaaparelho(in);
        return ret;
    }

}
