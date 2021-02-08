package cl.security.proyecto.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ListarVisitas {
	
	@RequestMapping(value = "/visitas", method = RequestMethod.GET)
	public String visitas(Locale locale, Model model) {
		
		return "listarvisitas";
    }

	@RequestMapping(value = "/checklist", method = RequestMethod.GET)
	public String check (Locale locale, Model model) {
		
		return "responderchecklist";
    }
}
