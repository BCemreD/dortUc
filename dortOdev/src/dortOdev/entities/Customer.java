package dortOdev.entities;

import java.util.Date;

import dortOdev.interfaces.Entity;

public class Customer implements Entity{
	private int id;
	private String name;
	private String lastName;
	private String identityNumber;
	private Date birthDate;
	
	public Customer() {}
	
	public Customer(int id, String name, String lastName, String identityNumber, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthDate = birthDate;
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
}
