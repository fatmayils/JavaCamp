package Entities;
import java.util.Date;

import Abstract.Entity;

public class Customer implements Entity{
int id;
private String firstName;
private String lastName;
private Date dateOfBirth;
private String nationalityID;
public Customer()
{
	
}
public Customer(int id, String firstName, String lastName, Date dateOfBirth, String nationalityID) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.dateOfBirth = dateOfBirth;
	this.nationalityID = nationalityID;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getNationalityID() {
	return nationalityID;
}
public void setNationalityID(String nationalityID) {
	this.nationalityID = nationalityID;
}

}
