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
					
					//Author author = new Author("hibrane", "sql");
					
					//Book book = new Book("sql new", "text", 1202);
					
					//DetailsBook bookDetalles = new DetailsBook("fas", 25, 13,"prin");
					
					
					// Asociar 
					//book.setAuthor(author);
					//book.setDetailsBook(bookDetalles);
					
					// iniar trasaccion
					
					miSession.beginTransaction();
					
					Query <Book> myQuery = miSession.createQuery("from Book", Book.class);
					List<Book> books = myQuery.getResultList();
					
					System.out.println(books.size());
					
					for (Book unClima: books) {
						System.out.println("Filtrados: \n" + unClima);
					}
					
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
