package com.kh.sporthub.resources;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.kh.sporthub.models.Team;
import com.kh.sporthub.repositories.TeamRepository;






@Controller
public class TeamController {

	@Autowired
	private TeamRepository teamRepository;

	
	@RequestMapping("/myteam-info")
    public String team(Model model) {
		
        model.addAttribute("team", teamRepository.findAll());
        
        return "myteam-info";
    }
	
	
	@RequestMapping("/other-teams")
    public String teams(Model model) {
		
        model.addAttribute("teams", teamRepository.findAll());
        
        return "other-teams";
    }
	
	 @RequestMapping("/deleteteam")
	    public String delete(@RequestParam String id) {
	        Optional<Team> teams = teamRepository.findById(id);
	        teamRepository.delete(teams.get());

	        return "redirect:/other-teams";
	    }
	 
	
	
}
