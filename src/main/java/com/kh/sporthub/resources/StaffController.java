package com.kh.sporthub.resources;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.kh.sporthub.models.Staff;
import com.kh.sporthub.repositories.StaffRepository;



@Controller
public class StaffController {

	
	
	@Autowired
	private StaffRepository staffRepository;

		
	 @RequestMapping("/our-staff")
	    public String staff(Model model) {
	        model.addAttribute("staff", staffRepository.findAll());
	        return "our-staff";
	    }
	  
	  
	  
	  
	
	    @RequestMapping("/deletemystaff")
	    public String delete(@RequestParam String id) {
	        Optional<Staff> staff = staffRepository.findById(id);
	        staffRepository.delete(staff.get());

	        return "redirect:/our-staff";
	    }

	
	
	
	
	
}
