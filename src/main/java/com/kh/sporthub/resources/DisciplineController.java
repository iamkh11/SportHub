package com.kh.sporthub.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.kh.sporthub.repositories.DisciplineRepository;










@Controller
public class DisciplineController {

	@Autowired
	private DisciplineRepository disciplineRepository;
	
	
	
	
	 @RequestMapping("/index")
	    public String discipline(Model model) {
	        
		 	model.addAttribute("discipline", disciplineRepository.findAll());
		 
	    return "discipline";
	    }
	
	
	
	
	
	
	
	
	
	
	
	
}
