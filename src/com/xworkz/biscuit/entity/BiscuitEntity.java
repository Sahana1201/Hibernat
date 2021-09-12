package com.xworkz.biscuit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Biscuit_Table")

public class BiscuitEntity implements Serializable{
	
	@Column(name = "B_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "B_NAME")
	String name;
	
	@Column(name = "B_BRAND")
	String  brand;
	
	@Column(name = "B_QUANTITY")
	int quantity;
	
	@Column(name = "B_PRICE")
	long price;
	

	public BiscuitEntity() {
		super();
	}


	public BiscuitEntity(int id, String brand, int quantity, long price) {
		super();
		this.id = id;
		this.brand = brand;
		this.quantity = quantity;
		this.price = price;
	}


	public BiscuitEntity(String name, String brand, int quantity, long price) {
		super();
		this.name = name;
		this.brand = brand;
		this.quantity = quantity;
		this.price = price;
	}


	private int getId() {
		return id;
	}


	private void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	private void setName(String name) {
		this.name = name;
	}


	public String getBrand() {
		return brand;
	}


	private void setBrand(String brand) {
		this.brand = brand;
	}


	private int getQuantity() {
		return quantity;
	}


	private void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	private long getPrice() {
		return price;
	}


	private void setPrice(long price) {
		this.price = price;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (price ^ (price >>> 32));
		result = prime * result + quantity;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BiscuitEntity other = (BiscuitEntity) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "BiscuitEntity [id=" + id + ", name=" + name + ", brand=" + brand + ", quantity=" + quantity + ", price="
				+ price + "]";
	}

	

}
