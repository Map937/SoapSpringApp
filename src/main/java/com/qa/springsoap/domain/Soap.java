package com.qa.springsoap.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Soap {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "Soap must be named")
	private String name; 
	
	@NotNull(message = "Scent must be given")
	private String scent; 
	
	@NotNull(message = "Item must be priced")
	private double price; 
	
	public Soap() {}
	
	//test constructor
	public Soap(long id, String name, String scent, double price) {
		super(); 
		this.id = id; 
		this.name = name;
		this.scent = scent; 
		this.price = price;
	}
	
	//actual constructor
	public Soap(String name, String scent, double price) {
		super();
		this.name = name; 
		this.scent = scent; 
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScent() {
		return scent;
	}

	public void setScent(String scent) {
		this.scent = scent;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, price, scent);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Soap other = (Soap) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(scent, other.scent);
	}
	
	
		
	
	

}
