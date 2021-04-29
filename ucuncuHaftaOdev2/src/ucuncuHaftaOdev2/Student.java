package ucuncuHaftaOdev2;

public class Student extends User {

	private String contactPhoneNumber;
	private String address;
	public Student(int id, String name, String surname, String eMail, String password, String contactPhoneNumber,
			String address) {
		super(id, name, surname, eMail, password);
		this.contactPhoneNumber = contactPhoneNumber;
		this.address = address;
	}
	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}
	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
