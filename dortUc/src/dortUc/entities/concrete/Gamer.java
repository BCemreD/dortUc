package dortUc.entities.concrete;

import dortUc.entities.IGamer;

public class Gamer implements IGamer {
int id;
public String nationalIdentity;
public String name;
public String lastName;
public String email;
public int dateOfBirth;
long password;

public Gamer(int id, String nationalIdentity, String name, String lastName, String email, int dateOfBirth,
		long password) {
	super();
	this.id = id;
	this.nationalIdentity = nationalIdentity;
	this.name = name;
	this.lastName = lastName;
	this.email = email;
	this.dateOfBirth = dateOfBirth;
	this.password = password;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNationalIdentity() {
	return nationalIdentity;
}

public void setNationalIdentity(String nationalIdentity) {
	this.nationalIdentity = nationalIdentity;
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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(int dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public long getPassword() {
	return password;
}

public void setPassword(long password) {
	this.password = password;
}


}
