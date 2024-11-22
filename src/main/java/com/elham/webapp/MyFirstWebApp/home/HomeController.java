package com.elham.webapp.MyFirstWebApp.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

//@Controller
public class HomeController {

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String toLogout(HttpSession session) {
		System.out.println("SESSION DETRYED");
		session.invalidate();
		return "redirect:/login";
	}
}
