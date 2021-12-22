package springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
// There are two ways to transfer data(model) to view. 1) using Model 2) using ModelAndView

	// This view of this controller uses lengthy way of extracting data
	@RequestMapping("/home")
	public String home(Model model) { // Make model for transfering data. Pass it in the arguement
		System.out.println("this is home URL");

		// Use addAttribute method which takes String key and Object obj as a parameter,
		// to transfer the data.
		// This data will be extracted in the view(jsp) by request.getAttribute("key");
		model.addAttribute("name", "Ayush Singh Singh");
		model.addAttribute("age", 23);

		ArrayList<String> friendList = new ArrayList<String>();
		friendList.add("Palak");
		friendList.add("Pratik");
		friendList.add("Oshin");

		model.addAttribute("friend", friendList);

		return "index";
	}

	// The view of this controller uses JSP Expression language for extracting data,
	// eliminating the use of request.getAttribute and it helps in directly getting
	// the data.
	@RequestMapping("about")
	public ModelAndView about() { // For ModelAndView it has to be returned and it should contain the attribute
									// and the view name
		System.out.println("About controller");

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Ayush Singh");
		modelAndView.addObject("age", 23);

		ArrayList<String> friendList = new ArrayList<String>();
		friendList.add("Palak");
		friendList.add("Pratik");
		friendList.add("Oshin");

		modelAndView.addObject("friend", friendList);

		// Setting view
		modelAndView.setViewName("about");

		return modelAndView;
	}
}
