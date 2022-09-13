package com.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insurance")
public class Insurance {
	
	@Id
	private int id;
	
	private String name;
	
	private float amount;
	
	private String nominee;

	public Insurance(int id, String name, float amount, String nominee) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.nominee = nominee;
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

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Insurance [id=" + id + ", name=" + name + ", amount=" + amount + ", nominee=" + nominee + "]";
	}
	
	
	
	
	
	
	
	

}
