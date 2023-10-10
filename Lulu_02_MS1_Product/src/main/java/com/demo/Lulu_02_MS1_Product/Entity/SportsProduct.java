package com.demo.Lulu_02_MS1_Product.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Shravya")
public class SportsProduct {
	@Id
	int id;
	String name;
	float cost;
	String desp;
	public SportsProduct(int id, String name, float cost, String desp) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.desp = desp;
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
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getdesp() {
		return desp;
	}
	public void setdesp(String desp) {
		this.desp = desp;
	}
	
	public SportsProduct() {
		super();
	}

}
