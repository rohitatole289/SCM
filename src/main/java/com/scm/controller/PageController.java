package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@GetMapping("/home")
	public ModelAndView home() {
		return new ModelAndView("home");
	}

	@RequestMapping("/about")
	public ModelAndView about() {
		return new ModelAndView("about");
	}
	@GetMapping("/service")
	public ModelAndView service() {
		return new ModelAndView("service");
	}
	@GetMapping("/contact")
	public ModelAndView contact() {
		return new ModelAndView("contact");
	}
	@GetMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}
	@GetMapping("/signup")
	public ModelAndView signup() {
		return new ModelAndView("signup");
	}
}
