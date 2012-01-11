package br.com.simuladorsemparar.cliente.bs;

import br.com.simuladorsemparar.cliente.ent.Cliente;
import br.com.simuladorsemparar.cliente.exception.ClienteException;

public interface ClienteService {
	public Cliente consultacliente(String cpf);
	
	public void validarcliente(Cliente cliente) throws ClienteException;
	
	public String cadastrarcliente(Cliente cliente, String oper);
}
