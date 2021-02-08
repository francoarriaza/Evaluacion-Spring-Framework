package cl.security.proyecto.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ListarUsuarios {
	
	@RequestMapping(value = "/listarusuarios", method = RequestMethod.GET)
	public String listusu(Locale locale, Model model) {
		
		return "listarusuarios";
    }

	@RequestMapping(value = "/nuevousuario", method = RequestMethod.GET)
	public String newusu(Locale locale, Model model) {
		
		return "crearusuario";
    }
	
	@RequestMapping(value = "/editarcliente", method = RequestMethod.GET)
	public String editcliente(Locale locale, Model model) {
		
		return "editarcliente";
    }
	
	@RequestMapping(value = "/editaradministrativo", method = RequestMethod.GET)
	public String editadm(Locale locale, Model model) {
		
		return "editaradministrativo";
    }
	
	@RequestMapping(value = "/editarporfesional", method = RequestMethod.GET)
	public String editpro(Locale locale, Model model) {
		
		return "editarprofesional";
    }
}
