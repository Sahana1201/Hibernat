package com.xworkz.soap.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.soap.constant.SoapType;

@Entity
@Table(name="soap_table")
public class SoapDTO implements Serializable {
	
	@Column(name="S_ID")
	@Id
	private int id;
	@Column(name="S_BA")
	private String brandAmbassador;
	@Column(name="S_ODOUR`")
	private String odour;
	@Column(name="S_CERTIFIED")
	private boolean certified;
	@Column(name="S_ANTIBACTIERIA")
	private boolean antibacteria;
	@Column(name="S_TYPE")
	private SoapType type;
	public SoapDTO() {
		super();
	}
	public SoapDTO(int id, String brandAmbassador, String odour, boolean certified, boolean antibacteria,
			SoapType type) {
		super();
		this.id = id;
		this.brandAmbassador = brandAmbassador;
		this.odour = odour;
		this.certified = certified;
		this.antibacteria = antibacteria;
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrandAmbassador() {
		return brandAmbassador;
	}
	public void setBrandAmbassador(String brandAmbassador) {
		this.brandAmbassador = brandAmbassador;
	}
	public String getOdour() {
		return odour;
	}
	public void setOdour(String odour) {
		this.odour = odour;
	}
	public boolean isCertified() {
		return certified;
	}
	public void setCertified(boolean certified) {
		this.certified = certified;
	}
	public boolean isAntibacteria() {
		return antibacteria;
	}
	public void setAntibacteria(boolean antibacteria) {
		this.antibacteria = antibacteria;
	}
	public SoapType getType() {
		return type;
	}
	public void setType(SoapType type) {
		this.type = type;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		SoapDTO other = (SoapDTO) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SoapDTO [id=" + id + ", brandAmbassador=" + brandAmbassador + ", odour=" + odour + ", certified="
				+ certified + ", antibacteria=" + antibacteria + ", type=" + type + "]";
	}
	

}
