package br.com.simuladorsemparar.cliente.ent;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.simuladorsemparar.cliente.Enum.TipoDocEnum;
@Entity
@Table(name = "tipoDoc")
public class TipoDoc {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "tipo")
	private TipoDocEnum tipo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TipoDocEnum getTipo() {
		return tipo;
	}
	public void setTipo(TipoDocEnum tipo) {
		this.tipo = tipo;
	}
}
