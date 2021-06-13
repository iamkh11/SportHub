package com.kh.sporthub.resources;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SidebarController {

	
	
	@RequestMapping("/sidebar")
	public String viewSettings(Model model) {
		  // do stuff
		  model.addAttribute("classActiveSettings","active");
		  return "sidebar";
		}
	
	
	
	
}
