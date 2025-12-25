package com.spring.bean;

public class Student {
	
	private int age;
	private Laptop lap;
	
	
	
	public Student(int age, Laptop lap) {
		this.age = age;
		this.lap = lap;
	}

	public Laptop getLap() {
		return lap;
	}

	public void setLap(Laptop lap) {
		this.lap = lap;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void study() {
		System.out.println("Studing..");
		lap.code();
		
	}

}
