package com.xworkz.bird.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bird_table")
public class BirdEntity {

	@Column(name = "B_ID")
	@Id
	int id;

	@Column(name = "B_NAME")
	String name;

	@Column(name = "B_HOUSENAME")
	String housename;

	@Column(name = "B_BREED")
	String breed;

	@Column(name = "B_TYPE")
	String type;

	@Column(name = "B_FOOD")
	String food;

	@Column(name = "B_GENDER")
	String gender;

	@Column(name = "B_NEST")
	boolean nest;

	@Column(name = "B_COLOUR")
	String colour;

	@Column(name = "B_HOLESIZE")
	String holeSize;

	public BirdEntity() {
		super();
	}

	public BirdEntity(int id, String name, String housename, String breed, String type, String food, String gender,
			boolean nest, String colour, String holeSize) {
		super();
		this.id = id;
		this.name = name;
		this.housename = housename;
		this.breed = breed;
		this.type = type;
		this.food = food;
		this.gender = gender;
		this.nest = nest;
		this.colour = colour;
		this.holeSize = holeSize;
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

	public String getHousename() {
		return housename;
	}

	public void setHousename(String housename) {
		this.housename = housename;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isNest() {
		return nest;
	}

	public void setNest(boolean nest) {
		this.nest = nest;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getHoleSize() {
		return holeSize;
	}

	public void setHoleSize(String holeSize) {
		this.holeSize = holeSize;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
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
		BirdEntity other = (BirdEntity) obj;
		if (breed == null) {
			if (other.breed != null)
				return false;
		} else if (!breed.equals(other.breed))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BirdEntity [id=" + id + ", name=" + name + ", housename=" + housename + ", breed=" + breed + ", type="
				+ type + ", food=" + food + ", gender=" + gender + ", nest=" + nest + ", colour=" + colour
				+ ", holeSize=" + holeSize + "]";
	}

}
