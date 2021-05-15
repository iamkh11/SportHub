package com.kh.sporthub.resources;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.sporthub.repositories.SupportersRepository;

@Controller
public class SupportersController {

	@Autowired
	private SupportersRepository supportersRepository;

		

	  @RequestMapping("/table-supporters")
	  
	    public String supporters(Model model) {
		  
	        model.addAttribute("supporters", supportersRepository.findAll());
	        
	        return "table-supporters";
	        
	    }
	  

	 
	
	
	
	
	
			
}



