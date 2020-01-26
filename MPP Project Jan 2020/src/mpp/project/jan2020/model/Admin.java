package mpp.project.jan2020.model;

import java.util.ArrayList;
import java.util.List;

public class Admin {
private List<Book> book;
private List<LibraryMember> libraryMember;
public Admin() {
	super();
	book = new ArrayList<>();
	libraryMember =new ArrayList<>();
}


public void addBook(Book b) {
	book.add(b);

}

public void addLibMem(LibraryMember lm) {
	libraryMember.add(lm);

}

public boolean deleteBook(String isbn) {
	for(int i = 0; i < book.size(); i++)
	{
		if(book.get(i).getISBN().equals(isbn)) {
			book.remove(i);
			return true;
		}
		} 
	return false;
}

public boolean deleteLibMem(String uid) {
	
	for(int i = 0; i < libraryMember.size(); i++)
	{
		if(libraryMember.get(i).getUID().equals(uid)) {
			libraryMember.remove(i);
			return true;
		}
		} 
	return false;

}

}
