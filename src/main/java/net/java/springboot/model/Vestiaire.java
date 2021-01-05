package net.java.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Vestiaire")

public class Vestiaire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	
	private long id;
	
	@Column(name ="num")
	private long num;
	
	@Column(name ="code")
	private long code;
	
	@Column(name ="nbarticle")
	private long nbarticle;
	
	@Column(name ="poids")
	private long poids;
	
	@Column(name ="prix")
	private long prix;
	
	
	public Vestiaire() {

	}

	public Vestiaire(long num, long code, long nbarticle, long poids, long prix) {
		this.num = num;
		this.code = code;
		this.nbarticle = nbarticle;
		this.poids = poids;
		this.prix = prix;
	}

	public long getId() {
		return id;
	}

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}
	
	public long getNbarticle() {
		return nbarticle;
	}

	public void setNbarticle(long nbarticle) {
		this.nbarticle = nbarticle;
	}
	
	public long getPoids() {
		return poids;
	}

	public void setPoids(long poids) {
		this.poids = poids;
	}
	
	public long getPrix() {
		return prix;
	}

	public void setPrix(long prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", num =" + num + ", desc=" + code + ", poids=" + poids + " , prix=" + prix + "]";
	}
}
