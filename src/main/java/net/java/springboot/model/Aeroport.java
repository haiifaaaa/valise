package net.java.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Aeroport")

public class Aeroport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	
	
	private long id;
	
	@Column(name ="name")
	private String name;
	
	@Column(name ="pays")
	private String pays;
	
	public Aeroport() {

	}

	public Aeroport(String name, String pays) {
		this.name = name;
		this.pays = pays;
		
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}
	


}
