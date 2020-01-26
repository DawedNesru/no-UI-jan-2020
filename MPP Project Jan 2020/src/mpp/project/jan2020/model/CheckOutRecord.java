package mpp.project.jan2020.model;

import java.time.LocalDate;

public class CheckOutRecord {
private LocalDate checkOutDate;
private LocalDate dueDate;
private Book book;
private LibraryMember libraryMember;
public CheckOutRecord(LocalDate dueDate, Book book, LibraryMember libraryMember) {
	super();
	this.checkOutDate = LocalDate.now();
	this.dueDate = dueDate;
	this.book = book;
	this.libraryMember = libraryMember;
}
public LocalDate getCheckOutDate() {
	return checkOutDate;
}
public LocalDate getDueDate() {
	return dueDate;
}
public Book getBook() {
	return book;
}
public LibraryMember getLibraryMember() {
	return libraryMember;
}
@Override
public String toString() {
	return "CheckOutRecord checkOutDate=" + checkOutDate + ", dueDate=" + dueDate + ", book=" + book
			+ ", libraryMember=" + libraryMember + "";
}

}
