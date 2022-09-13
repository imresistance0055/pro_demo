package com.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="userdetails")
@Table(name = "UserInfo")
public class User {

	@Id
	private int id;

	private String first_name;

	private String last_name;

	private String city;

	private String address;

	private String email;

	private int contact;

	public User(int id, String first_name, String last_name, String city, String address, String email, int contact) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.city = city;
		this.address = address;
		this.email = email;
		this.contact = contact;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public User() {
		super();

	}

	@Override
	public String toString() {
		return "User [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", city=" + city
				+ ", address=" + address + ", email=" + email + ", contact=" + contact + "]";
	}

}
