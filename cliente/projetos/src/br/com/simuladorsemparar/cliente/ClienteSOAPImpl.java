/**
 * ClienteSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.simuladorsemparar.cliente;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.simuladorsemparar.cliente.Enum.TipoDocEnum;
import br.com.simuladorsemparar.cliente.Enum.TipoTelEnum;
import br.com.simuladorsemparar.cliente.bs.ClienteService;
import br.com.simuladorsemparar.cliente.bs.ClienteServiceImpl;
import br.com.simuladorsemparar.cliente.ent.Cliente;
import br.com.simuladorsemparar.cliente.ent.Documento;
import br.com.simuladorsemparar.cliente.ent.Telefone;
import br.com.simuladorsemparar.cliente.ent.TipoDoc;
import br.com.simuladorsemparar.cliente.ent.TipoTelefone;
import br.com.simuladorsemparar.domain.Resultadovalidacao;

public class ClienteSOAPImpl implements br.com.simuladorsemparar.cliente.Cliente_PortType{
	ClienteService clienteService = new ClienteServiceImpl();
	
    public br.com.simuladorsemparar.cliente.ConsultaclienteResponse consultacliente(br.com.simuladorsemparar.cliente.ConsultaclienteRequest parameters) throws java.rmi.RemoteException {
    	Cliente clienteEnt = clienteService.consultacliente(parameters.getCpf());

    	ConsultaclienteResponse clienteRetor = new ConsultaclienteResponse();
    	
    	br.com.simuladorsemparar.domain.Cliente cliente = new br.com.simuladorsemparar.domain.Cliente(); 
    	
    	cliente.setCodigocli(String.valueOf(clienteEnt.getCodigo()));
    	if (clienteEnt.getDocumentos().size() > 0 && 
    			clienteEnt.getDocumentos().get(0).getTipo().equals(TipoDocEnum.CPF)) {
    		cliente.setCpf(new String[clienteEnt.getDocumentos().get(0).getNumero()]);
    	}

    	cliente.setDatanasc(clienteEnt.getDataNasc().getTime());
    	cliente.setNome(clienteEnt.getNome());
    	
    	
    	if (clienteEnt.getTelefones().size() > 0 && 
    			clienteEnt.getTelefones().get(0).getTipo().equals(TipoTelEnum.RESIDENCIAL)) {
    		cliente.setTelefone(new BigInteger[clienteEnt.getTelefones().get(0).getTelefone()]);
    	}
    	
    	clienteRetor.setCliente(cliente);
    	
        return clienteRetor;
    }

    public br.com.simuladorsemparar.cliente.ValidarclienteResponse validarcliente(br.com.simuladorsemparar.cliente.ValidarclienteRequest parameters) throws java.rmi.RemoteException {
    	Cliente clienteVal = clienteWs4Cliente(parameters.getCliente());
    	
    	String mensagem = "";
    	boolean isvalido = true;
    	try {
    		clienteService.validarcliente(clienteVal);
    	} catch (Exception e) {
    		mensagem = e.getMessage();
    		isvalido = false;
    	}
    	
    	Resultadovalidacao resultado = new Resultadovalidacao(mensagem, isvalido);
    	
    	ValidarclienteResponse retorno = new ValidarclienteResponse();
    	retorno.setResultadovalidacao(resultado);
    	
        return retorno;
    }

    public br.com.simuladorsemparar.cliente.CadastrarclienteResponse cadastrarcliente(br.com.simuladorsemparar.cliente.CadastrarclienteRequest parameters) throws java.rmi.RemoteException {
    	Cliente cliente = clienteWs4Cliente(parameters.getClienteoper().getCliente());
    	
    	clienteService.cadastrarcliente(cliente, parameters.getClienteoper().getOperacao().getNome());
    	
        return null;
    }

    
	private Cliente clienteWs4Cliente(br.com.simuladorsemparar.domain.Cliente cliente) {
		Calendar datanasc = new GregorianCalendar();
    	
    	Cliente clienteVal = new Cliente();
    	datanasc.setTimeInMillis(cliente.getDatanasc().getTime());
    	
    	clienteVal.setCodigo(Integer.valueOf(cliente.getCodigocli()));
    	clienteVal.setDataNasc(datanasc);
    	clienteVal.setNome(cliente.getNome());
   	
    	TipoDoc tipoDoc = new TipoDoc();
    	tipoDoc.setTipo(TipoDocEnum.CPF);
    	
    	Documento doc = new Documento(Integer.valueOf(cliente.getCpf()[0]).intValue(), tipoDoc);
    	List<Documento> documentos = new ArrayList<Documento>();
    	documentos.add(doc);
    	
    	clienteVal.setDocumentos(documentos);
    	
    	TipoTelefone tipoTel = new TipoTelefone();
    	tipoTel.setTipo(TipoTelEnum.RESIDENCIAL);
    	Telefone tel = new Telefone(cliente.getTelefone()[0].intValue(), tipoTel);
    	List<Telefone> telefones = new ArrayList<Telefone>();
    	telefones.add(tel);
    	
    	clienteVal.setTelefones(telefones);
		return clienteVal;
	}
}
