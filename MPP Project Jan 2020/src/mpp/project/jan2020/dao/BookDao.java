package mpp.project.jan2020.dao;

import java.util.List;
import java.util.Optional;

import mpp.project.jan2020.model.Book;

public interface BookDao {
	
public boolean insertBook(Book book);
public List<Book> selectAllBooks();
public Book  selectBookByISBN(String isbn);
public boolean deleteBookByISBN(String isbn);
public boolean updateBookByISBN(String isbn, Book book);
}
