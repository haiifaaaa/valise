
package net.java.springboot.model;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "Client")

public class Client {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	
	private long id;
	
	@Column(name ="name")
	private String name;
	
	@Column(name ="prenom")
	private String prenom;
	
	@Column(name ="CIN")
	private long CIN;
	
	//pas encore déclaré les getters et les setters
	@CreationTimestamp
	private Date date;
	
	@Column(name ="code")
	private long code;
	
	@Column(name ="email")
	private String email;
	
	
	public Client() {	
		
	}

	public Client(String name, String prenom , long CIN , long code , String email) {
		this.name = name;
		this.prenom = prenom;
		this.CIN = CIN;
		this.code = code;
		this.email = email;
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public long getCIN() {
		return CIN;
	}

	public void setCIN(long CIN) {
		this.CIN = CIN;
	}
	
	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

		

}
