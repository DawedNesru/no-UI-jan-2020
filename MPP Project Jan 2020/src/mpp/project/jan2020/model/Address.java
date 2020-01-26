package mpp.project.jan2020.model;

public class Address {
private String Street;
private String city;
private String state;
private int zip;
public Address(String street, String city, String state, int zip) {
	super();
	Street = street;
	this.city = city;
	this.state = state;
	this.zip = zip;
}
public String getStreet() {
	return Street;
}
public String getCity() {
	return city;
}
public String getState() {
	return state;
}
public int getZip() {
	return zip;
}
@Override
public String toString() {
	return "Address [Street=" + Street + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
}

}
