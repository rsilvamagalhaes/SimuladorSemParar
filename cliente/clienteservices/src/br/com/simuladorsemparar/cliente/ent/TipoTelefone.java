package br.com.simuladorsemparar.cliente.ent;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.simuladorsemparar.cliente.Enum.TipoTelEnum;

@Entity
@Table(name = "tipoTelefone")
public class TipoTelefone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "tipo")
	private TipoTelEnum tipo;
	
	public int getId() {
		return id;
	}
	public TipoTelEnum getTipo() {
		return tipo;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTipo(TipoTelEnum tipo) {
		this.tipo = tipo;
	}
}
