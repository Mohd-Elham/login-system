package com.elham.webapp.MyFirstWebApp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

	@Autowired
	UserAuthenticateService auth;
	
	
	public LoginController(UserAuthenticateService auth) {
		super();
		this.auth = auth;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String toLoginPage(ModelMap map) {

		map.put("username", "");
		map.put("password", "");
		
		return "/login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String toHomePage(@RequestParam String username, @RequestParam String password, HttpSession session)
	{	
	
		if (auth.authenticate(username, password)) {
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			
			return "redirect:/";
		}
		
		
		return "redirect:/";
	}
}
