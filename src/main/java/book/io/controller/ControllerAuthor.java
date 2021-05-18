package book.io.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import book.io.controller.entity.Author;
import book.io.dao.AuthorDAO;




@Controller
@RequestMapping("/author")
public class ControllerAuthor {
	
	@Autowired
	private AuthorDAO authorDAO;
	
	@RequestMapping("/home")
	public String listaClientes() {
		
		return "home";
		
	}
	
	
	@RequestMapping("/addAuthor")
	public String showFormAddAuthor(Model model) {	
		Author author = new Author();	
		model.addAttribute("author", author);
		System.out.println("done form!");
		return "authorForm";
	}
	
	@PostMapping("/insertAuthor")
	public String insertAuthor(@ModelAttribute("author") Author author) {
		
		System.out.println(author);
		authorDAO.addAuthor(author);
		System.out.println("after insert!");
		return "redirect:/author/home";
	}

}
