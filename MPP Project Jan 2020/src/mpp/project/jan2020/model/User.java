package mpp.project.jan2020.model;

public class User {
private String fName;
private String lName;
private String userName;
private String passWord;
private Address address;
private UserRole role;
public User(String fName, String lName, String userName, String passWord, Address address, UserRole role) {
	super();
	this.fName = fName;
	this.lName = lName;
	this.userName = userName;
	this.passWord = passWord;
	this.address = address;
	this.role = role;
}
public String getfName() {
	return fName;
}
public String getlName() {
	return lName;
}
public String getUserName() {
	return userName;
}
public String getPassWord() {
	return passWord;
}
public Address getAddress() {
	return address;
}
public UserRole getRole() {
	return role;
}


}
