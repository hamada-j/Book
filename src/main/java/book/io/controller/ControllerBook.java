package book.io.controller;



import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.ServletContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import book.io.controller.entity.Author;
import book.io.controller.entity.Book;
import book.io.dao.AuthorDAO;
import book.io.dao.BookDAO;


;

@Controller
@RequestMapping("/book")
public class ControllerBook {
	
	private String Id = "";
	
	@Autowired
	private BookDAO bookDAO;
	
	@Autowired
	private AuthorDAO authorDAO;
	
	@RequestMapping("/author")
	public String listAuthors(Model elModelo) {
		
		List <Author> allAuthor = authorDAO.getAllAuthor();
			
		elModelo.addAttribute("author", allAuthor);
		
		return "author";
		
	}
	
	@RequestMapping("/home")
	public String showHome(Model elModelo) {
		
		return "home";
		
	}
	
	
	@RequestMapping("/list")
	public String listBooks(Model elModelo) {
		
		List <Book> allBooks = bookDAO.getAllBooks();
			
		elModelo.addAttribute("books", allBooks);
		
		return "list";
		
	}
	
	
	@RequestMapping("/download_book")
	public String oneBook(@RequestParam("id") int id, Model elModelo) {
		
		Id = String.valueOf(id);
		
		Book bookTemp = bookDAO.getBook(id);
		
		System.out.println(id);
		System.out.println(bookTemp);
		
		elModelo.addAttribute("bookTemp", bookTemp);
		
		return "download";
		
	}
	
 
	@RequestMapping(value = "/download", method = RequestMethod.GET)
	public void downloader(HttpServletRequest request, HttpServletResponse response) {
		
		String name = Id + "pdf.pdf";
		
		System.out.println(name);

		ServletContext context = request.getSession().getServletContext();
 
		String downloadFolder = context.getRealPath("/WEB-INF/resource/books/");


		Path file = Paths.get(downloadFolder, name);
		
		// Check if file exists
		if (Files.exists(file)) {
			// set content type
			response.setContentType("application/pdf");
			// add response header
			response.addHeader("Content-Disposition", "attachment; filename=" + name);
			try {
				// copies all bytes from a file to an output stream
				Files.copy(file, response.getOutputStream());
				// flushes output stream
				response.getOutputStream().flush();
			} catch (IOException e) {
				System.out.println("Error :- " + e.getMessage());
			}
		} else {
			System.out.println("Sorry File not found!!!!");
		}
	}
	
}
