package com.elham.webapp.MyFirstWebApp.deafault;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

@Controller
public class MyDefaultPage {
		
	
	@RequestMapping(value = "/",  method = RequestMethod.GET)
	public String defaultPage(HttpSession session) {
		if (session.getAttribute("username")== null) {
			System.out.println("there is no username as "+ session.getAttribute("username"));
			return "/login";
		} else {
			System.out.println("there is username as "+ session.getAttribute("username"));
			return "/homePage";
		}
		
	}
//	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String sessionDestroyer(HttpSession session) {
//	    session.invalidate();  // Invalidate the session whenever the default page is visited
//	    return "/login";  // Redirect to login page
//	}

}
