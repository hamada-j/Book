package book.io.dao;

import java.util.List;

import book.io.controller.entity.Book;

public interface BookDAO {
	
	public List <Book> getAllBooks();
	
	public void addBook(Book book);
	
	public void updateBook(Book book, int idBook);
	
	public Book getBook(int idBook);

	public void deleteBook(int idBook);

}
