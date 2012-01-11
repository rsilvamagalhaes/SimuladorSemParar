package br.com.simuladorsemparar.cliente.bs;

import java.util.ArrayList;
import java.util.List;

import br.com.simuladorsemparar.cliente.Enum.OperacaoCliente;
import br.com.simuladorsemparar.cliente.ent.Cliente;
import br.com.simuladorsemparar.cliente.ent.Documento;
import br.com.simuladorsemparar.cliente.exception.ClienteException;

public class ClienteServiceImpl implements ClienteService {
	static List<Cliente> clientes;
	
	public ClienteServiceImpl() {
		if (clientes == null) {
			clientes = new ArrayList<Cliente>();
		}
	}
	
	@Override
	public Cliente consultacliente(String cpf) {
		
		for(Cliente cliente : clientes) {
			for (Documento document : cliente.getDocumentos()) {
				if (document.getNumero() != 0 &&
						String.valueOf(document.getNumero()).equals(cpf)) {
					return cliente;
				}
			}
		}
		
		return null;
	}

	@Override
	public void validarcliente(Cliente cliente) throws ClienteException{
		boolean isCompleto = true;
		boolean naoExiste = true;
		for (Cliente cli : clientes) {
			for(Documento doc : cli.getDocumentos()) {
				for(Documento doc1 : cliente.getDocumentos()) {
					if (String.valueOf(doc1.getNumero()).equals(doc.getNumero())) {
						
						if (cliente.getCodigo() == 0) {
							cliente.setCodigo(cli.getCodigo());
							isCompleto = false;
						}
						
						if (cliente.getDataNasc() == null) {
							cliente.setDataNasc(cli.getDataNasc());
							isCompleto = false;
						}
						
						if (cliente.getNome() == null) {
							cliente.setNome(cli.getNome());
							isCompleto = false;
						}
						
						naoExiste = false;
						//TODO  - Se nescessário terminar esse ponto
					}
				}
			}
		}
		
		if (!isCompleto) {
			throw new ClienteException("Cadastro do usuário não está completo.");
		}
		
		if (naoExiste) {
			throw new ClienteException("Cliente inexistente.");
		}
		
	}

	@Override
	public String cadastrarcliente(Cliente cliente, String oper) {
		
		if (oper.equals(OperacaoCliente.OPER_INSERT.getValue())) {
			clientes.add(cliente);
		} else {
			int cont = 0;
			for (Cliente cli : clientes) {
				for(Documento doc : cli.getDocumentos()) {
					for(Documento doc1 : cliente.getDocumentos()) {
						if (String.valueOf(doc1.getNumero()).equals(doc.getNumero())) {
							clientes.set(cont, cli);
						}
					}
				}
				cont++;
			}
		}
		
		return "";
	}

}
