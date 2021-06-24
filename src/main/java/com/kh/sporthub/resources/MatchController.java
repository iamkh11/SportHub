package com.kh.sporthub.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.sporthub.models.Match;
import com.kh.sporthub.models.Stadium;
import com.kh.sporthub.models.Team;
import com.kh.sporthub.models.Ticket;
import com.kh.sporthub.repositories.MatchReposiroty;
import com.kh.sporthub.repositories.StadiumRepository;
import com.kh.sporthub.repositories.TeamRepository;
import com.kh.sporthub.repositories.TicketRepository;


@Controller
public class MatchController {

	
	@Autowired
	private MatchReposiroty matchRepository;
	
	@Autowired
	private TeamRepository teamRepository;

	@Autowired
	private  StadiumRepository stadiumRepository;
	
	@Autowired
	private TicketRepository ticketRepository;
	
	
	
	// show 
		  @RequestMapping("/calendar")
		    public String calendar(Model model) {
			  
			  
		        model.addAttribute("match", matchRepository.findAll());
		        
		       
		        return "calendar";
		    }
		
		  @RequestMapping("/deletematch")
		    public String delete(@RequestParam String id) {
		        Optional<Match> match = matchRepository.findById(id);
		        matchRepository.delete(match.get());

		        return "redirect:/calendar";
		    }
		

		  // CREATE  
		    @RequestMapping("/add-match")
		    public String create(Model model) {
		    	
		    	  model.addAttribute("match", matchRepository.findAll());
		    	  model.addAttribute("teams", teamRepository.findAll());
		    	  model.addAttribute("stade", stadiumRepository.findAll());
		    	  
		        return "add-match";
		    }
		    
			 
			 @RequestMapping("/savematch")
			    public String save(@RequestParam String home_team_logo, @RequestParam String away_team_logo, 
			    					@RequestParam String home_team,  @RequestParam String away_team, 
			    					@RequestParam String date,  @RequestParam String time, 
			    					@RequestParam String stadium,  @RequestParam String competition, 
			    					@RequestParam String discipline,  @RequestParam String season, 
			    					@RequestParam String status
			    		) {
			    		
			    		
			    	
				 
				 Match match = new Match();
				 	
				
				 match.setHome_team_logo(home_team_logo);
				 match.setAway_team_logo(away_team_logo);
				 match.setHome_team(home_team);
				 match.setAway_team(away_team);
			    	
				 match.setDate(date);
				 match.setTime(time);
				 
				 match.setStadium(stadium);
				 match.setCompetition(competition);
				 match.setDiscipline(discipline);
				 
				 match.setSeason(season);
				 match.setStatus(status);
			    	
				 	
			    	matchRepository.save(match);
				
			        return "redirect:/calendar";
			    }
			 
			 // END
	
			// Create Tickets 
			 
			 @RequestMapping("/ticketgen/{id}")
			 public String edit(@PathVariable String id, Model model) {
				 model.addAttribute("match", matchRepository.findById(id).get());
				 
				
				 model.addAttribute("stade", stadiumRepository.findAll());
				 model.addAttribute("teams", teamRepository.findAll());
				 
				 
			        return "ticketgen";
			    }
			 
			 
			
			 
			 @RequestMapping("/savetickets")
			    public String save(@RequestParam String id, Model model,@RequestParam int n, @RequestParam String match_name,
			    					@RequestParam String stadium_name, @RequestParam String stadium_zone , @RequestParam double price ,	
			    					@RequestParam String date, @RequestParam String time , @RequestParam String competition ,
			    					@RequestParam String discipline, @RequestParam String season  
			    					) {
				 
				 
				 
				 Optional<Match> match = matchRepository.findById(id);
				 
				 List<Ticket> list=new ArrayList<Ticket>();
				 
				 for (int i=1 ; i < n+1 ; i++ ) {
					
					 
				 Ticket ticket = new Ticket();
				 
				
				
				 ticket.setMatch_name(match_name);
				 ticket.setStadium_name(stadium_name);
				 ticket.setStadium_zone(stadium_zone);
				 ticket.setPrice(price);
				 
				 ticket.setDate(date);
				 ticket.setTime(time);
				 ticket.setCompetition(competition);
				 ticket.setDiscipline(discipline);
				 ticket.setSeason(season);
				 
				
				 
				
				 
				 ticketRepository.save(ticket);	
				 list.add(ticket);
				 
				
				
				 }
				 
				 match.get().setTickets(list);
				 matchRepository.save(match.get());
				 	
				 
			
				
					
				 
			        return "redirect:/tickets";
			    }
			 
			 // END
	
	
	
	
	
	
}
