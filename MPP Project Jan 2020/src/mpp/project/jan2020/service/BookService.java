package mpp.project.jan2020.service;

import java.util.List;
import java.util.Optional;



import mpp.project.jan2020.dao.BookDao;
import mpp.project.jan2020.dao.BookDataAccessService;
import mpp.project.jan2020.model.Book;

public class BookService {


private  BookDao bookDao = new BookDataAccessService();


public boolean addBook(Book book) {
	return bookDao.insertBook(book);
}

public List<Book> getAllBook(){
	return bookDao.selectAllBooks();
}

public Book getBookByISBN(String isbn){
	return bookDao.selectBookByISBN(isbn);
}

public boolean deleteBookByISBN(String isbn) {
	return bookDao.deleteBookByISBN(isbn);
}

public boolean updateBookISBN(String isbn, Book book) {
	return bookDao.updateBookByISBN(isbn, book);
}
}
