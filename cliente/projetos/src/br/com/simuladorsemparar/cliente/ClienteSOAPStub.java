/**
 * ClienteSOAPStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.simuladorsemparar.cliente;

public class ClienteSOAPStub extends org.apache.axis.client.Stub implements br.com.simuladorsemparar.cliente.Cliente_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[3];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("consultacliente");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", "consultaclienteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", ">consultaclienteRequest"), br.com.simuladorsemparar.cliente.ConsultaclienteRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", ">consultaclienteResponse"));
        oper.setReturnClass(br.com.simuladorsemparar.cliente.ConsultaclienteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", "consultaclienteResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validarcliente");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", "validarclienteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", ">validarclienteRequest"), br.com.simuladorsemparar.cliente.ValidarclienteRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", ">validarclienteResponse"));
        oper.setReturnClass(br.com.simuladorsemparar.cliente.ValidarclienteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", "validarclienteResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cadastrarcliente");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", "cadastrarclienteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", ">cadastrarclienteRequest"), br.com.simuladorsemparar.cliente.CadastrarclienteRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", ">cadastrarclienteResponse"));
        oper.setReturnClass(br.com.simuladorsemparar.cliente.CadastrarclienteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", "cadastrarclienteResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

    }

    public ClienteSOAPStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ClienteSOAPStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ClienteSOAPStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", ">cadastrarclienteRequest");
            cachedSerQNames.add(qName);
            cls = br.com.simuladorsemparar.cliente.CadastrarclienteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", ">cadastrarclienteResponse");
            cachedSerQNames.add(qName);
            cls = br.com.simuladorsemparar.cliente.CadastrarclienteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", ">consultaclienteRequest");
            cachedSerQNames.add(qName);
            cls = br.com.simuladorsemparar.cliente.ConsultaclienteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", ">consultaclienteResponse");
            cachedSerQNames.add(qName);
            cls = br.com.simuladorsemparar.cliente.ConsultaclienteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", ">validarclienteRequest");
            cachedSerQNames.add(qName);
            cls = br.com.simuladorsemparar.cliente.ValidarclienteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", ">validarclienteResponse");
            cachedSerQNames.add(qName);
            cls = br.com.simuladorsemparar.cliente.ValidarclienteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://simuladorsemparar.com.br/domain", "cliente");
            cachedSerQNames.add(qName);
            cls = br.com.simuladorsemparar.domain.Cliente.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://simuladorsemparar.com.br/domain", "clienteoper");
            cachedSerQNames.add(qName);
            cls = br.com.simuladorsemparar.domain.Clienteoper.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://simuladorsemparar.com.br/domain", "operacao");
            cachedSerQNames.add(qName);
            cls = br.com.simuladorsemparar.domain.Operacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://simuladorsemparar.com.br/domain", "resultadocadastro");
            cachedSerQNames.add(qName);
            cls = br.com.simuladorsemparar.domain.Resultadocadastro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://simuladorsemparar.com.br/domain", "resultadovalidacao");
            cachedSerQNames.add(qName);
            cls = br.com.simuladorsemparar.domain.Resultadovalidacao.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public br.com.simuladorsemparar.cliente.ConsultaclienteResponse consultacliente(br.com.simuladorsemparar.cliente.ConsultaclienteRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://simuladorsemparar.com.br/cliente/consultacliente");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "consultacliente"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.simuladorsemparar.cliente.ConsultaclienteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.simuladorsemparar.cliente.ConsultaclienteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.simuladorsemparar.cliente.ConsultaclienteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.simuladorsemparar.cliente.ValidarclienteResponse validarcliente(br.com.simuladorsemparar.cliente.ValidarclienteRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://simuladorsemparar.com.br/cliente/validarcliente");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "validarcliente"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.simuladorsemparar.cliente.ValidarclienteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.simuladorsemparar.cliente.ValidarclienteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.simuladorsemparar.cliente.ValidarclienteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public br.com.simuladorsemparar.cliente.CadastrarclienteResponse cadastrarcliente(br.com.simuladorsemparar.cliente.CadastrarclienteRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://simuladorsemparar.com.br/cliente/cadastrarcliente");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "cadastrarcliente"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.com.simuladorsemparar.cliente.CadastrarclienteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.com.simuladorsemparar.cliente.CadastrarclienteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, br.com.simuladorsemparar.cliente.CadastrarclienteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
