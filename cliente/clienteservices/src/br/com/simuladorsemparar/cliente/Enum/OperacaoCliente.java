package br.com.simuladorsemparar.cliente.Enum;

public enum OperacaoCliente {
	OPER_INSERT("INSERT"),
	OPER_UPDATE("UPDATE");
	
	private String value;

	OperacaoCliente(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
