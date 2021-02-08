package cl.security.proyecto.controller;

import java.util.Locale;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class Login {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String cap(Locale locale, Model model) {
		
		return "login";
    }

}
