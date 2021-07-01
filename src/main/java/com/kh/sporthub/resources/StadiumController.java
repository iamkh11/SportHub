package com.kh.sporthub.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.kh.sporthub.models.Stadium;
import com.kh.sporthub.models.Team;
import com.kh.sporthub.repositories.StadiumRepository;
import com.kh.sporthub.repositories.TeamRepository;
import com.kh.sporthub.repositories.TicketRepository;




@Controller
public class StadiumController {


	@Autowired
	private  StadiumRepository stadiumRepository;

	@Autowired
	private TeamRepository teamRepository;
	
	
	@RequestMapping("/our-stadium")
    public String stade(Model model) {
		
        model.addAttribute("stade", stadiumRepository.findAll());
        model.addAttribute("teams", teamRepository.findAll());
        return "our-stadium";
    }
	
	@RequestMapping("/our-court-hand")
    public String court(Model model) {
		
        model.addAttribute("stade", stadiumRepository.findAll());
        model.addAttribute("teams", teamRepository.findAll());
        return "our-court-hand";
    }
	
	
	
	@RequestMapping("/other-stadiums")
    public String stadium(Model model) {
		
        model.addAttribute("stadium", stadiumRepository.findAll());
        
        return "other-stadiums";
    }
	
	 @RequestMapping("/deletestade")
	    public String delete(@RequestParam String id) {
	        Optional<Stadium> stadium = stadiumRepository.findById(id);
	        stadiumRepository.delete(stadium.get());

	        return "redirect:/other-stadiums";
	    }
	 
	 
	 
	 
	 // CREATE  
	    @RequestMapping("/newstadium")
	    public String create(Model model) {
	    	
	    	  model.addAttribute("stadium", stadiumRepository.findAll());
	    	  model.addAttribute("teams", teamRepository.findAll());
	        return "newstadium";
	    }
	    
		 
		 @RequestMapping("/savestadium")
		    public String save(@RequestParam String stadium_fullname, @RequestParam String stadium_placement, 
		    		@RequestParam Integer stadium_capacity, @RequestParam String team_fullname, 
		    		@RequestParam String image_URL, @RequestParam String descipline
		    		
		    		) {
		    		
		    		
		    	
			 
			 Stadium stadium = new Stadium();
			 	
			 stadium.setStadium_fullname(stadium_fullname);
			 stadium.setStadium_placement(stadium_placement);
			 stadium.setStadium_capacity(stadium_capacity);
			 stadium.setTeam_fullname(team_fullname);
			
		    	
			 stadium.setImage_URL(image_URL);
		    	
			 stadium.setDescipline(descipline);
			 
			
			 	
			 stadiumRepository.save(stadium);
			
		        return "redirect:/other-stadiums";
		    }
		 
		 // END
	 
	 
	 
	 
	 
		//  Modify
		 
		 
		 @RequestMapping("/edit-stadium/{id}")
		    public String edit(@PathVariable String id, Model model) {
			 
		        model.addAttribute("stadium", stadiumRepository.findById(id).get());
		        model.addAttribute("teams", teamRepository.findAll());
		        
		        return "/edit-stadium";
		        
		    }
		 
		 
		 
		 @RequestMapping("/updatestadium")
		    public String update(@RequestParam String id, @RequestParam String stadium_fullname, @RequestParam String stadium_placement, 
		    		@RequestParam Integer stadium_capacity, @RequestParam String team_fullname, 
		    		@RequestParam String image_URL ) {
		      
		    	Optional<Stadium> stadium = stadiumRepository.findById(id);
		    	
		    	
		    	stadium.get().setStadium_fullname(stadium_fullname);
		    	stadium.get().setStadium_placement(stadium_placement);
		    	stadium.get().setStadium_capacity(stadium_capacity);
		    	stadium.get().setTeam_fullname(team_fullname);
		    	stadium.get().setImage_URL(image_URL);
		    	
		    	
		    	stadiumRepository.save(stadium.get());

		        return "redirect:/our-stadium" ;
		    }
		 
		 
		 @RequestMapping("/updatestades")
		    public String updates(@RequestParam String id, @RequestParam String stadium_fullname, @RequestParam String stadium_placement, 
		    		@RequestParam Integer stadium_capacity, @RequestParam String team_fullname, 
		    		@RequestParam String image_URL ) {
		      
			 Optional<Stadium> stadium = stadiumRepository.findById(id);
		    	
		    	
		    	stadium.get().setStadium_fullname(stadium_fullname);
		    	stadium.get().setStadium_placement(stadium_placement);
		    	stadium.get().setStadium_capacity(stadium_capacity);
		    	stadium.get().setTeam_fullname(team_fullname);
		    	stadium.get().setImage_URL(image_URL);
		    	
		    	
		    	stadiumRepository.save(stadium.get());

		        return "redirect:/other-stadiums" ;
		    }
		 
		 // END Modify
		 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
}
