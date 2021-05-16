package book.io.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import book.io.controller.entity.Book;


@Repository
public class BookDAOClass implements BookDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Book> getAllBooks() {
		Session session = sessionFactory.getCurrentSession();
		Query <Book> myQuery = session.createQuery("from Book", Book.class);
		List<Book> books = myQuery.getResultList();
		return books;
	}
	
	@Override
	@Transactional
	public void addBook(Book book) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(book);	
	}

	@Override
	public void updateBook(Book book, int idBook) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book getBook(int idBook) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBook(int idBook) {
		// TODO Auto-generated method stub
		
	}
	
	

}
