package br.com.simuladorsemparar.cliente.ent;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "documento")
public class Documento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "numero")
	private int numero;
	
	@OneToOne(mappedBy = "tipo")
	private TipoDoc tipo;

	public Documento(int numero, TipoDoc tipo) {
		this.numero = numero;
		this.tipo = tipo;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public TipoDoc getTipo() {
		return tipo;
	}
	public void setTipo(TipoDoc tipo) {
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
