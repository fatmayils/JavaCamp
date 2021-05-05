package Entities;

import java.util.Date;

public class Member {

	private int id;
	private String firstName,lastName,userName,password,eMail,nationalityID,phone;
	private Date birthOfDay;
	public Member(int id, String firstName, String lastName, String userName, String password, String eMail,
	String nationalityID, Date birthOfDay,String phone) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.eMail = eMail;
		this.nationalityID = nationalityID;
		this.birthOfDay = birthOfDay;
		this.phone=phone;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getNationalityID() {
		return nationalityID;
	}
	public void setNationalityID(String nationalityID) {
		this.nationalityID = nationalityID;
	}
	public Date getBirthOfDay() {
		return birthOfDay;
	}
	public void setBirthOfDay(Date birthOfDay) {
		this.birthOfDay = birthOfDay;
	}
}
