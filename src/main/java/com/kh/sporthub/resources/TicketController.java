package com.kh.sporthub.resources;

import java.io.OutputStream;
import java.util.Arrays;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.sporthub.helpers.ZXingHelper;
import com.kh.sporthub.models.Stadium;
import com.kh.sporthub.models.Ticket;
import com.kh.sporthub.repositories.StadiumRepository;
import com.kh.sporthub.repositories.TicketRepository;


@Controller

public class TicketController {

	@Autowired
	private TicketRepository ticketRepository;
	@Autowired
	private  StadiumRepository stadiumRepository;

	
	
	
	
	
	
	
	
	@RequestMapping("/virage")
    public String ticket(Model model) {
		
        model.addAttribute("ticket", ticketRepository.findAll());
        
        return "virage";
    }

	@RequestMapping(value = "qrcode/{match_tag}", method = RequestMethod.GET)
	public void qrcode(@PathVariable("match_tag") String match_tag, HttpServletResponse response) throws Exception {
		response.setContentType("image/png");
		OutputStream outputStream = response.getOutputStream();
		outputStream.write(ZXingHelper.getQRCodeImage(match_tag, 500, 500));
		outputStream.flush();
		outputStream.close();
	}
	
	
	// Create Tickets 
	 
			 @RequestMapping("/ticketgen")
			    public String create(Model model) {
				 model.addAttribute("ticket", ticketRepository.findAll());
				 model.addAttribute("stade", stadiumRepository.findAll());
			        return "ticketgen";
			    }
			 
			 @RequestMapping("/save-tickets")
			    public String save(@RequestParam int n, @RequestParam String match_name,
			    		@RequestParam String stadium_name, @RequestParam String stadium_zone , @RequestParam double price 	) {
			    	
				 for (int i=1 ; i < n+1 ; i++ ) {
				 Ticket ticket = new Ticket();
				 	
				
				 ticket.setMatch_name(match_name);
				 ticket.setStadium_name(stadium_name);
				 ticket.setStadium_zone(stadium_zone);
				 ticket.setPrice(price);
				
				 Stadium b = (new Stadium ("Old Trafford","Manchester",76000, "Manchester United","app-assets/img/Old Trafford.jpg","football"));
					Stadium x = (new Stadium ("Rades","Manchester",76000, "Manchester United","app-assets/img/Old Trafford.jpg","football"));
					 stadiumRepository.save(b);
					 stadiumRepository.save(x);
					 ticket.setStade(Arrays.asList(b,x)) ;
				 	
				 	ticketRepository.save(ticket);
				 }
				
				
					
				 
			        return "redirect:/virage";
			    }
			 
			 // END
	
	
	
	
	
	
	
	
}
