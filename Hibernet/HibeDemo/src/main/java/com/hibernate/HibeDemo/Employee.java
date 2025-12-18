package com.hibernate.HibeDemo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "employee")
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Laptop> laptops = new ArrayList<>();

	// Getters & Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", laptops=" + laptops + "]";
	}

}
