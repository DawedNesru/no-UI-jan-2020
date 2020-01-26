package mpp.project.jan2020.model;

public class LibraryMember {
private String fName;
private String lName;
private String UID;
private Address address;
public LibraryMember(String fName, String lName, String UID, String street, String city, String state, int zip) {
	super();
	this.fName = fName;
	this.lName = lName;
	this.UID = UID;
	this.address = new Address(street, city, state, zip);
}
public String getfName() {
	return fName;
}
public String getlName() {
	return lName;
}
public String getUID() {
	return UID;
}
public Address getAddress() {
	return address;
}
@Override
public String toString() {
	return "LibraryMember fName=" + fName + ", lName=" + lName + ", UID=" + UID + ", address=" + address + "\n";
}

}
