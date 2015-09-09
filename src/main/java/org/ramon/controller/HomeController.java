package org.ramon.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.ramon.dao.jdbcPersonaDao;
import org.ramon.model.Persona;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private static jdbcPersonaDao jdbc=new jdbcPersonaDao();
	private static List<Persona> personas;
	
	public HomeController(){
		
		 personas=jdbc.getPersonas();
	}
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Loading Init Page");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/inicio")
	public ModelAndView helloWorld(){
		logger.info("Loading Index Page");
		return new ModelAndView("inicio", "message", "Session Login");
	}
	
	@RequestMapping(value = "/exito", method = { RequestMethod.POST })
	public String inicioSesion (@RequestParam("username") String user,
			@RequestParam("password") String pass, Persona p ,ModelMap model,
			RedirectAttributes redirectAttributes, SessionStatus sessionStatus) {
		logger.info("Loading sucessfull Page");
		logger.info("Searching Person Init Page");
		Persona persona = buscarPersonaList(user, pass);
		if (persona != null) {
			logger.debug("Person find");
			if (persona.getUsername().equals("admin")) {
				logger.debug("Session Admin");
				model.addAttribute("persons", personas);
				model.addAttribute("Nombre", " ");
				model.addAttribute("Apellido", " ");
				model.addAttribute("Username", p.getUsername());
				return "exito";
			} else {
				logger.debug("Session other person");
				model.addAttribute("bienvenido", "Bienvenido");
				model.addAttribute("Id", persona.getId());
				model.addAttribute("Username", persona.getUsername());
				model.addAttribute("Password", persona.getPassword());
				model.addAttribute("Email", persona.getEmail());
				model.addAttribute("Nombre", persona.getNombre());
				model.addAttribute("Apellido", persona.getApellido());
				model.addAttribute("Img", persona.getImg());
				return "exito";
			}

		} else {
			logger.error("Person not find");
			redirectAttributes.addFlashAttribute("error",
					"wrong in username or password");
			return "redirect:inicio";
		}

		
	}
	
	public static Persona buscarPersonaList(String username, String password) {
		Persona aux = null;
		int i = 0;
		while (i < personas.size() && aux == null) {
			if (personas.get(i).getUsername().equals(username)
					&& personas.get(i).getPassword().equals(password)) {
				aux = personas.get(i);
				
			} else {
				aux = null;
			}
			i++;
		}
		return aux;

	}
	
	
}
