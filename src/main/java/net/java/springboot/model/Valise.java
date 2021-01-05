package net.java.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Valise")

public class Valise {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	
	private long id;

	
	@Column(name ="numero")
	private long numero;
	
	@Column(name ="critere")
	private String critere;
	
	
public  Valise() {
  
		
	}

	public  Valise(long numero, String critere ) {
		
		this.numero = numero;
		this.critere = critere;
		
	}

	public long getId() {
		return id;
	}

	
	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}
	
	
	public String getCritere() {
		return critere;
	}

	public void setCritere(String critere) {
		this.critere = critere;
	}
	

}
