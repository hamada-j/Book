package book.io.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import book.io.controller.entity.Author;


@Repository
public class AuthorDAOClass implements AuthorDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Author> getAllAuthor() {
		Session session = sessionFactory.getCurrentSession();
		Query <Author> myQuery = session.createQuery("from Author", Author.class);
		List<Author> authors = myQuery.getResultList();
		return authors;
	}

	@Override
	@Transactional
	public void addAuthor(Author author) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(author);	
	}

	@Override
	@Transactional
	public void updateAuthor(Author author, int idAuthor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public Author getAuthor(int idAuthor) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();	
		Author author = session.get(Author.class, idAuthor);		
		return author;
	}

	@Override
	@Transactional
	public void deleteAuthor(int idAuthor) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
