package mpp.project.jan2020.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import mpp.project.jan2020.model.Book;
import mpp.project.jan2020.model.LibraryMember;

public class BookDataAccessService implements BookDao {
	private static List<Book> DB = new ArrayList<>();
	@Override
	public boolean insertBook(Book book) {
		if(book == null) return false;
		DB.add(new Book(book.getISBN(), book.getTitle(), book.getBookCopy().getNumCopy(), book.getAuthor().getfName(), book.getAuthor().getlName(), book.getAuthor().getCredentials(), book.getAuthor().getShortBio()));
		return true;
	}

	@Override
	public List<Book> selectAllBooks() {
		
		return DB;
	}

	@Override
	public Book selectBookByISBN(String isbn) {
		for(Book b: DB) {
			if(b.getISBN().equals(isbn))
				return b;
		}
		return null;
			}

	@Override
	public boolean deleteBookByISBN(String isbn) {
		
		Book bookToDelete = selectBookByISBN(isbn);
		if(bookToDelete == null) {
			return false;
		}
		DB.remove(bookToDelete);
		return true;
	}

	@Override
	public boolean updateBookByISBN(String isbn, Book book) {
		Book old = selectBookByISBN(isbn);
		for(int i = 0; i < DB.size(); i++) {
			if(old.getISBN().equals(isbn))
			{	DB.set(i, book);
			return true;
			}
			}
			

		return false;
	}

}
