package com.ming.jenkins;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Welcome {

	@GetMapping(path = "/welcome")
	public String welcome(Model model) {
		model.addAttribute("value", "test jenkins");
		return "welcome";
	}
	
}