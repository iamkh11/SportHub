package com.kh.sporthub.resources;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.kh.sporthub.models.Players;

import com.kh.sporthub.repositories.PlayersRepository;








@Controller
public class PlayersController {

	
	
	@Autowired
	private PlayersRepository playersRepository;
	

	  @RequestMapping("/our-players")
	    public String players(Model model) {
	        model.addAttribute("players", playersRepository.findAll());
	        return "our-players";
	    }
	  
	  @RequestMapping("/other-players")
	    public String joueurs(Model model) {
	        model.addAttribute("joueurs", playersRepository.findAll());
	        return "other-players";
	    }
	  
	  
	  

	    @RequestMapping("/create")
	    public String create(Model model) {
	        return "create";
	    }
	    
	    

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



	    
	   
	}
		

		
	
	
	
