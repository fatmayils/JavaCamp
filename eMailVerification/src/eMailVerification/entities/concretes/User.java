package eMailVerification.entities.concretes;

import eMailVerification.entities.abstracts.Entity;

public class User implements Entity{
	int userID;
	private String firstName,lastName,password,eMail;
public User() {
		super();
	}
public User(int userID, String firstName, String lastName, String password, String eMail) {
		super();
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.eMail = eMail;
	}
public int getUserID() {
	return userID;
}
public void setUserID(int userID) {
	this.userID = userID;
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String geteMail() {
	return eMail;
}
public void seteMail(String eMail) {
	this.eMail = eMail;
}

}
