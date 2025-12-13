package com.hibernate.HibeDemo;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	private String state;
	private String city;
	private String pinCode;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	
	
}
