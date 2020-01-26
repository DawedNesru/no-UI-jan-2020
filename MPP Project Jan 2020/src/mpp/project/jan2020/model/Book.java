package mpp.project.jan2020.model;


public class Book {
private String ISBN;
private String title;
private boolean flag;
private BookCopy bookCopy;
private Author author;
public Book(String iSBN, String title, int bc, String fName, String lName, String credential, String shortBio) {
	super();
	ISBN = iSBN;
	this.title = title;
	this.flag = true;
	this.bookCopy = new BookCopy(bc);
	flag = true;
	author = new Author(fName, lName, credential, shortBio);
	
}
public String getISBN() {
	return ISBN;
}
public String getTitle() {
	return title;
}
public boolean isFlag() {
	return flag;
}
public BookCopy getBookCopy() {
	return bookCopy;
}
public Author getAuthor() {
	return author;
}
@Override
public String toString() {
	return "Book ISBN=" + ISBN + ", title=" + title + ", bookCopy=" + bookCopy +"\n";
}



}
