package com.kh.sporthub.resources;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.sporthub.models.Stadium;
import com.kh.sporthub.models.Staff;
import com.kh.sporthub.repositories.StaffRepository;
import com.kh.sporthub.repositories.TeamRepository;



@Controller
public class StaffController {

	
	
	@Autowired
	private StaffRepository staffRepository;

	@Autowired
	private TeamRepository teamRepository;
	
	
		
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

	    
	    
	    
	    
	    
	    // CREATE  
	    @RequestMapping("/newstaff")
	    public String create(Model model) {
	    	
	    	  model.addAttribute("staff", staffRepository.findAll());
	    	  model.addAttribute("teams", teamRepository.findAll());
	        return "newstaff";
	    }
	    
		 
		 @RequestMapping("/savestaff")
		    public String save(@RequestParam String staff_fullname, @RequestParam Integer staff_age, 
		    		@RequestParam String staff_birth_date, @RequestParam String staff_nationality, 
		    		@RequestParam String staff_gender, @RequestParam String team_fullname
		    		, @RequestParam String staff_role , @RequestParam String staff_pic_URL
		    		, @RequestParam String descipline
		    		) {
		    		
		    		
		    	
			 
			 Staff staff = new Staff();
			 	
			 staff.setStaff_fullname(staff_fullname);
			 staff.setStaff_age(staff_age);
			 staff.setStaff_birth_date(staff_birth_date);
			 staff.setStaff_nationality(staff_nationality);
			 staff.setStaff_gender(staff_gender);
		    	
			 staff.setTeam_fullname(team_fullname);
			 staff.setStaff_role(staff_role);
			 staff.setStaff_pic_URL(staff_pic_URL);
			
		    	
			 staff.setDescipline(descipline);
			 
			
			 	
			 staffRepository.save(staff);
			
		        return "redirect:/our-staff";
		    }
		 
		 // END
	 
	 
	 
	 
	 
		//  Modify
		 
		 
		
		 
		 
		 
		 @RequestMapping("/updatestaff")
		    public String update(@RequestParam String id,@RequestParam String staff_fullname, @RequestParam Integer staff_age, 
		    		@RequestParam String staff_birth_date, @RequestParam String staff_nationality, 
		    		@RequestParam String staff_gender
		    		, @RequestParam String staff_role , @RequestParam String staff_pic_URL
		    		 ) {
		      
		    	Optional<Staff> staff = staffRepository.findById(id);
		    	
		    	
		    	 staff.get().setStaff_fullname(staff_fullname);
				 staff.get().setStaff_age(staff_age);
				 staff.get().setStaff_birth_date(staff_birth_date);
				 staff.get().setStaff_nationality(staff_nationality);
				 staff.get().setStaff_gender(staff_gender);
			    	
				 
				 staff.get().setStaff_role(staff_role);
				 staff.get().setStaff_pic_URL(staff_pic_URL);
				
			    	
				 
		    	
		    	
		    	staffRepository.save(staff.get());

		        return "redirect:/our-staff" ;
		    }
		 
		 
		
		 
		 // END Modify
		 
	 
	
	
	
	
}
