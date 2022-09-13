package com.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="userdetails")
@Table(name = "info")
public class User {
	@Id
	private int id;

	private String name;

	private String city;

	private int mobile_number;

	private String address;

	public User(int id, String name, String city, int mobile_number, String address) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.mobile_number = mobile_number;
		this.address = address;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(int mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + ", mobile_number=" + mobile_number
				+ ", address=" + address + "]";
	}

	public User() {
		super();

	}

}
