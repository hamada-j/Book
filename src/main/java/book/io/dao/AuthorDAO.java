package book.io.dao;

import java.util.List;

import book.io.controller.entity.Author;


public interface AuthorDAO {
	
	public List <Author> getAllAuthor();
	
	public void addAuthor(Author author);
	
	public void updateAuthor(Author author, int idAuthor);
	
	public Author getAuthor(int idAuthor);

	public void deleteAuthor(int idAuthor);

}
