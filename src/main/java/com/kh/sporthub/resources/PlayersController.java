package com.kh.sporthub.resources;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.sporthub.models.Admins;
import com.kh.sporthub.models.Players;
import com.kh.sporthub.models.Team;
import com.kh.sporthub.repositories.PlayersRepository;
import com.kh.sporthub.repositories.TeamRepository;








@Controller
public class PlayersController {

	
	
	@Autowired
	private PlayersRepository playersRepository;
	
	@Autowired
	private TeamRepository teamRepository;
	
	
		// show 
	  @RequestMapping("/our-players")
	    public String players(Model model) {
	        model.addAttribute("players", playersRepository.findAll());
	        
	        model.addAttribute("team", teamRepository.findAll());
	        return "our-players";
	    }
	  
	  @RequestMapping("/other-players")
	    public String joueurs(Model model) {
	        model.addAttribute("joueurs", playersRepository.findAll());
	        return "other-players";
	    }
	  
	// END SHOW 
	  

	  
	 // CREATE  
	    @RequestMapping("/newplayer")
	    public String create(Model model) {
	    	  model.addAttribute("teams", teamRepository.findAll());
	        return "newplayer";
	    }
	    
		 
		 @RequestMapping("/saveplayer")
		    public String save(@RequestParam String player_fullname, @RequestParam Integer player_age, @RequestParam String player_birth_date ,
		    		@RequestParam String player_nationality ,@RequestParam String player_gender , @RequestParam Integer player_number , 
		    		@RequestParam String player_position , @RequestParam String team_name, @RequestParam String player_pic_URL, @RequestParam String player_descipline
		    		) {
		    		
		    		
		    	
			 
			 Players players = new Players();
			 	
			 players.setPlayer_fullname(player_fullname);
		    	players.setPlayer_age(player_age);
		    	players.setPlayer_birth_date(player_birth_date);
		    	players.setPlayer_nationality(player_nationality);
		    	players.setPlayer_gender(player_gender);
		    	
		    	players.setPlayer_number(player_number);
		    	
		    	players.setPlayer_position(player_position);
		    	players.setTeam_name(team_name);
		    	
		    	
		    	players.setPlayer_pic_URL(player_pic_URL);
		    	players.setPlayer_descipline(player_descipline);
			
			 	
			 playersRepository.save(players);
			
		        return "redirect:/other-players";
		    }
		 
		 // END
	    
	    
	    
	  // END CREATE 
	    
	    
	    
	    // MODIFY 
	    
	    // OUR PLAYERS
	    @RequestMapping("/updateplayer")
	    public String update(@RequestParam String id, @RequestParam String player_fullname, 
	    		@RequestParam Integer player_age, @RequestParam String player_birth_date , 
	    		@RequestParam String player_nationality ,@RequestParam String player_gender , @RequestParam Integer player_number , 
	    		@RequestParam String player_position , @RequestParam String team_name, @RequestParam String player_pic_URL) {
	    		
	      
	    	Optional<Players> players = playersRepository.findById(id);
	    	
	 	       
	    	
	    	players.get().setPlayer_fullname(player_fullname);
	    	players.get().setPlayer_age(player_age);
	    	players.get().setPlayer_birth_date(player_birth_date);
	    	players.get().setPlayer_nationality(player_nationality);
	    	players.get().setPlayer_gender(player_gender);
	    	players.get().setPlayer_number(player_number);
	    	players.get().setPlayer_position(player_position);
	    	players.get().setTeam_name(team_name);
	    	players.get().setPlayer_pic_URL(player_pic_URL);
	    
	    	
	    	
	    	
	    	playersRepository.save(players.get());

	        return "redirect:/our-players" ;
	    }
	    // END 
	    
	    // All Players
	    
	    @RequestMapping("/edit-player/{id}")
	    public String edit(@PathVariable String id, Model model) {
	    	
	        model.addAttribute("joueurs", playersRepository.findById(id).get());
	        model.addAttribute("teams", teamRepository.findAll());
	        
	        return "/edit-player";
	        
	    }
	    
	    @RequestMapping("/updateplayers")
	    public String updates(@RequestParam String id, @RequestParam String player_fullname, 
	    		@RequestParam Integer player_age, @RequestParam String player_birth_date , 
	    		@RequestParam String player_nationality ,@RequestParam String player_gender , @RequestParam Integer player_number , 
	    		@RequestParam String player_position , @RequestParam String team_name, @RequestParam String player_pic_URL) {
	    		
	      
	    	Optional<Players> players = playersRepository.findById(id);
	    	
	 	       
	    	
	    	players.get().setPlayer_fullname(player_fullname);
	    	players.get().setPlayer_age(player_age);
	    	players.get().setPlayer_birth_date(player_birth_date);
	    	players.get().setPlayer_nationality(player_nationality);
	    	players.get().setPlayer_gender(player_gender);
	    	players.get().setPlayer_number(player_number);
	    	players.get().setPlayer_position(player_position);
	    	players.get().setTeam_name(team_name);
	    	players.get().setPlayer_pic_URL(player_pic_URL);
	    
	    	
	    	
	    	
	    	playersRepository.save(players.get());

	        return "redirect:/other-players" ;
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    // END MODIFY 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    // DELETE 

	    @RequestMapping("/deleteourplayer")
	    public String delete(@RequestParam String id) {
	        Optional<Players> players = playersRepository.findById(id);
	        playersRepository.delete(players.get());

	        return "redirect:/our-players";
	    }
	    
	    @RequestMapping("/deletejoueur")
	    public String supprimer(@RequestParam String id) {
	        Optional<Players> joueurs = playersRepository.findById(id);
	        playersRepository.delete(joueurs.get());

	        return "redirect:/other-players";
	    }

	    // END DELETE

	    
	   
	}
		

		
	
	
	
