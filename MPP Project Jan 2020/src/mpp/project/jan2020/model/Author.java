package mpp.project.jan2020.model;

public class Author {
private String fName;
private String lName;
private String credentials;
private String shortBio;
public Author(String fName, String lName, String credentials, String shortBio) {
	super();
	this.fName = fName;
	this.lName = lName;
	this.credentials = credentials;
	this.shortBio = shortBio;
}
public String getfName() {
	return fName;
}

public String getlName() {
	return lName;
}
public String getCredentials() {
	return credentials;
}
public String getShortBio() {
	return shortBio;
}

@Override
public String toString() {
	return "Author fName=" + fName + ", lName=" + lName + ", credentials=" + credentials + ", shortBio=" + shortBio;
}

}
