package com.hibernate.HibeDemo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	
	@OneToMany(mappedBy = "emp", cascade = CascadeType.ALL)
	private List<Laptop> lap = new ArrayList<>();

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

	public List<Laptop> getLap() {
		return lap;
	}

	public void setLap(List<Laptop> lap) {
		this.lap = lap;
	}
	
	
}
