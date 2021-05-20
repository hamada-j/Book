package book.io.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import book.io.controller.entity.Book;
import book.io.dao.BookDAO;

;

@Controller
@RequestMapping("/book")
public class ControllerBook {
	
	@Autowired
	private BookDAO bookDAO;
	
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

}
