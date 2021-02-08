package cl.security.proyecto.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ListarPagos {
	@RequestMapping(value = "/listarpagos", method = RequestMethod.GET)
	public String pagos(Locale locale, Model model) {
		
		return "listarpagos";
    }
	
	@RequestMapping(value = "/crearpagos", method = RequestMethod.GET)
	public String newpagos(Locale locale, Model model) {
		
		return "crearpagos";
    }

}
