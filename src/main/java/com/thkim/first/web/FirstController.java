package com.thkim.first.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

	@GetMapping("/")
	public String hello(Model model) {
		model.addAttribute("name", "태현");
		return "hello.html";
	}
}
