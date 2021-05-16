package book.io.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class ControllerBook {
	
	@RequestMapping("/home")
	public String listaClientes() {
		
		return "lista-clientes";
		
	}

}
