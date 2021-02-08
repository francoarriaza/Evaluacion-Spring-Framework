package cl.security.proyecto.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ListarCapacitaciones {
	
	@RequestMapping(value = "/capacitaciones", method = RequestMethod.GET)
	public String cap(Locale locale, Model model) {
		
		return "listarcapacitaciones";
    }

	@RequestMapping(value = "/nuevacapacitacion", method = RequestMethod.GET)
	public String newcap(Locale locale, Model model) {
		
		return "crearcapacitaciones";
    }
}
