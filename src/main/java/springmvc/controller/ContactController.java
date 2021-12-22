package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {

	// Path which contains the view of the page that contains the form. When button
	// is pressed, data(Model) will be sent to "process" path and below control will
	// start acting then and it will collect the form data using the fields name by
	// using RequestMethod and then it will be given another view page which will
	// display the model data
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

	@RequestMapping(path = "process", method = RequestMethod.POST) // It must accept POST request for that path
	public ModelAndView handleForm(@RequestParam("email") String email, @RequestParam("username") String name,
			@RequestParam("password") String password) { // Use RequestParam to get the data from the forma nd inject
															// them into the variables in the arguement
		System.out.println(email + " " + name + " " + password);

		// Use ModeAndView or Model to send a new view with the new Model data
		// (form data) to display them
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", name);
		modelAndView.addObject("email", email);
		modelAndView.addObject("password", password);

		modelAndView.setViewName("success");
		return modelAndView;
	}
}
