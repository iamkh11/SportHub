package com.kh.sporthub.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kh.sporthub.models.Stadium;
import com.kh.sporthub.repositories.StadiumRepository;
import com.kh.sporthub.repositories.TicketRepository;




@RestController
public class StadiumController {


	@Autowired
	private  StadiumRepository stadiumRepository;

	
	
	
	@RequestMapping("/our-stadium")
    public String team(Model model) {
		
        model.addAttribute("team", stadiumRepository.findAll());
        
        return "myteam-info";
    }
	
	
	
	
	
	
}
