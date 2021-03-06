package com.kh.sporthub.resources;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.kh.sporthub.models.Players;
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
	 
	 
	 
	 //  Modify
	 
	 
	 @RequestMapping("/edit-team/{id}")
	    public String edit(@PathVariable String id, Model model) {
	        model.addAttribute("teams", teamRepository.findById(id).get());
	        return "/edit-team";
	        
	    }
	 
	 
	 
	 @RequestMapping("/updateteam")
	    public String update(@RequestParam String id, @RequestParam String team_nickname, 
	    		@RequestParam String team_founded, @RequestParam String team_owner , 
	    		@RequestParam String team_league ,@RequestParam String logo_URL ) {
	      
	    	Optional<Team> team = teamRepository.findById(id);
	    	
	    	
	    	team.get().setTeam_nickname(team_nickname);
	    	team.get().setTeam_founded(team_founded);
	    	team.get().setTeam_owner(team_owner);
	    	team.get().setTeam_league(team_league);
	    	team.get().setLogo_URL(logo_URL);
	    	
	    	
	    	teamRepository.save(team.get());

	        return "redirect:/myteam-info" ;
	    }
	 
	 
	 @RequestMapping("/updateteams")
	    public String updates(@RequestParam String id, @RequestParam String team_nickname, 
	    		@RequestParam String team_founded, @RequestParam String team_owner , 
	    		@RequestParam String team_league ,@RequestParam String logo_URL ) {
	      
	    	Optional<Team> team = teamRepository.findById(id);
	    	
	    	
	    	team.get().setTeam_nickname(team_nickname);
	    	team.get().setTeam_founded(team_founded);
	    	team.get().setTeam_owner(team_owner);
	    	team.get().setTeam_league(team_league);
	    	team.get().setLogo_URL(logo_URL);
	    	
	    	
	    	teamRepository.save(team.get());

	        return "redirect:/other-teams" ;
	    }
	 
	 // END Modify
	 
	 
	 // CREATE  
	    @RequestMapping("/new-team")
	    public String create(Model model) {
	    	
	    	  model.addAttribute("team", teamRepository.findAll());
	    	  
	        return "new-team";
	    }
	    
		 
		 @RequestMapping("/saveteam")
		    public String save(@RequestParam String fullname, @RequestParam String team_nickname, 
		    		@RequestParam String team_founded, @RequestParam String team_owner, 
		    		@RequestParam String team_league, @RequestParam String logo_URL, 
		    		@RequestParam String descipline
		    		) {
		    		
		    		
		    	
			 
			 Team team = new Team();
			 	
			 team.setFullname(fullname);
			 team.setTeam_nickname(team_nickname);
			 team.setTeam_founded(team_founded);
			 team.setTeam_owner(team_owner);
			 team.setTeam_league(team_league);
		    	
			 team.setLogo_URL(logo_URL);
		    	
			 team.setDescipline(descipline);
			 
			
			 	
			 teamRepository.save(team);
			
		        return "redirect:/other-teams";
		    }
		 
		 // END
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
}
