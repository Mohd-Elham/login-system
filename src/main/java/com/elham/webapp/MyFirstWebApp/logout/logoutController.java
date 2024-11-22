package com.elham.webapp.MyFirstWebApp.logout;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

@Controller
public class logoutController {

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String toLogoutPage(HttpSession session) {
		
		
		System.out.println("LOGGED OUT");
		session.invalidate();
		
		
		
		return "redirect:/";
	}
}
