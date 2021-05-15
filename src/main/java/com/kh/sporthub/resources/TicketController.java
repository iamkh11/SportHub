package com.kh.sporthub.resources;

import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kh.sporthub.helpers.ZXingHelper;
import com.kh.sporthub.repositories.TicketRepository;


@Controller

public class TicketController {

	@Autowired
	private TicketRepository ticketRepository;

	@RequestMapping("/tickets")
    public String ticket(Model model) {
		
        model.addAttribute("ticket", ticketRepository.findAll());
        
        return "tickets";
    }

	@RequestMapping(value = "qrcode/{id}", method = RequestMethod.GET)
	public void qrcode(@PathVariable("id") String id, HttpServletResponse response) throws Exception {
		response.setContentType("image/png");
		OutputStream outputStream = response.getOutputStream();
		outputStream.write(ZXingHelper.getQRCodeImage(id, 200, 200));
		outputStream.flush();
		outputStream.close();
	}
	
	
	
	
	
	
	
	
	
	
}
