package connection.database.MySQL.io;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import book.io.controller.entity.Author;
import book.io.controller.entity.Book;
import book.io.controller.entity.DetailsBook;



public class test {
	

	 public static void main(String[] args) {
			 
			 SessionFactory miFactory = new Configuration()
					 .configure("hibernate.cfg.xml")
					 .addAnnotatedClass(Author.class)
					 .addAnnotatedClass(Book.class)
					 .addAnnotatedClass(DetailsBook.class)
					 .buildSessionFactory();
				
				Session miSession = miFactory.openSession();
				
				try {
					
					// Insert
					
					Author author = new Author("ISBN", "Overview Java SE with Hibernate or Spring");
					
					Book book = new Book("Arquitectura Java Solida", "Arquitectura", 2012);
					
					DetailsBook bookDetalles = new DetailsBook("Arquitectura.jpeg", 9, 0,"The objective of this book is not to become experts in Hibernate or Spring but to be able to begin to handle each of these frameworks and acquire a global vision as architects of how to build a business application.");
					
					
					// Asociar 
					book.setAuthor(author);
					book.setDetailsBook(bookDetalles);
					
					// iniar trasaccion
					
					
					miSession.save(author);
					miSession.save(book);
					miSession.beginTransaction();
					
					//Query <Book> myQuery = miSession.createQuery("from Book", Book.class);
					//List<Book> books = myQuery.getResultList();
					
					//System.out.println(books.size());
					
					//for (Book unClima: books) {
						//System.out.println("Filtrados: \n" + unClima);
					//}
					
					//miSession.save(author);
					//miSession.save(book);
					
					miSession.getTransaction().commit();
					
					System.out.println("Insertado correctamente en DB!");
					
					
					//Close
					miSession.close();
					
				}finally {	
					miFactory.close();
				}
			 
		 }

}
