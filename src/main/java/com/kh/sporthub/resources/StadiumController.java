package com.kh.sporthub.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.sporthub.models.Stadium;
import com.kh.sporthub.repositories.StadiumRepository;
import com.kh.sporthub.repositories.TicketRepository;




@Controller
public class StadiumController {


	@Autowired
	private  StadiumRepository stadiumRepository;

	
	
	
	@RequestMapping("/our-stadium")
    public String stade(Model model) {
		
        model.addAttribute("stade", stadiumRepository.findAll());
        
        return "our-stadium";
    }
	
	
	
	@RequestMapping("/other-stadiums")
    public String stadium(Model model) {
		
        model.addAttribute("stadium", stadiumRepository.findAll());
        
        return "other-stadiums";
    }
	

	
}
