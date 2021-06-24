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

	
	
	
	
	
	
	
	
	@RequestMapping("/tickets")
    public String ticket(Model model) {
		
        model.addAttribute("ticket", ticketRepository.findAll());
        
        return "tickets";
    }

	@RequestMapping(value = "qrcode/{match_tag}", method = RequestMethod.GET)
	public void qrcode(@PathVariable("match_tag") String match_tag, HttpServletResponse response) throws Exception {
		response.setContentType("image/png");
		OutputStream outputStream = response.getOutputStream();
		outputStream.write(ZXingHelper.getQRCodeImage(match_tag, 500, 500));
		outputStream.flush();
		outputStream.close();
	}
	
	
	
	
	
	
	
	
	
	
	
}
