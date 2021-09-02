package com.xworkz.camera.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "camera_table")
public class CameraEntity implements Serializable{

	@Column(name = "c_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "c_name")
	String name;
	@Column(name = "c_brand")
	String brand;
	@Column(name = "c_version")
	String vrsion;
	@Column(name = "c_colour")
	String colour;
	@Column(name = "c_cost")
	int cost;
	@Column(name = "c_lensType")
	String lensetype;
	@Column(name = "c_formfactor")
	String formfactor;
	@Column(name = "c_opticalsensor")
	String opticalsensor;
	@Column(name = "c_specialFeature")
	String specialFeatures;

	public CameraEntity() {
		super();
	}

	

	public CameraEntity(String name, String brand, String vrsion, String colour, int cost, String lensetype,
			String formfactor, String opticalsensor, String specialFeatures) {
		super();
		this.name = name;
		this.brand = brand;
		this.vrsion = vrsion;
		this.colour = colour;
		this.cost = cost;
		this.lensetype = lensetype;
		this.formfactor = formfactor;
		this.opticalsensor = opticalsensor;
		this.specialFeatures = specialFeatures;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getVrsion() {
		return vrsion;
	}

	public void setVrsion(String vrsion) {
		this.vrsion = vrsion;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getLensetype() {
		return lensetype;
	}

	public void setLensetype(String lensetype) {
		this.lensetype = lensetype;
	}

	public String getFormfactor() {
		return formfactor;
	}

	public void setFormfactor(String formfactor) {
		this.formfactor = formfactor;
	}

	public String getOpticalsensor() {
		return opticalsensor;
	}

	public void setOpticalsensor(String opticalsensor) {
		this.opticalsensor = opticalsensor;
	}

	public String getSpecialFeatures() {
		return specialFeatures;
	}

	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + id;
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
		CameraEntity other = (CameraEntity) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CameraEntity [id=" + id + ", name=" + name + ", brand=" + brand + ", vrsion=" + vrsion + ", colour="
				+ colour + ", cost=" + cost + ", lensetype=" + lensetype + ", formfactor=" + formfactor
				+ ", opticalsensor=" + opticalsensor + ", specialFeatures=" + specialFeatures + "]";
	}

}
