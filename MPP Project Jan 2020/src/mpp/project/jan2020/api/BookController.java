package mpp.project.jan2020.api;

import java.util.List;
import java.util.Optional;

import mpp.project.jan2020.model.Book;
import mpp.project.jan2020.service.BookService;

public class BookController {
	private  BookService bookService = new BookService();

		
	public void addBook(Book book) {
		bookService.addBook(book);
	}

	
	public List<Book> getAllBook() {
		return bookService.getAllBook();
	}
   
    public Book getBookByISBN(String isbn){
    	return bookService.getBookByISBN(isbn);
    }

	public void deleteBookByISBN(String isbn) {
		bookService.deleteBookByISBN(isbn);
	}

	
	public void updateBookISBN(String isbn, Book book) {
		bookService.updateBookISBN(isbn, book);
	}
}
