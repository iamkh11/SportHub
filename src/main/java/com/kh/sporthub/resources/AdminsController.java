package com.kh.sporthub.resources;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.sporthub.models.Role;
import com.kh.sporthub.models.User;
import com.kh.sporthub.repositories.RoleRepository;
import com.kh.sporthub.repositories.UserRepository;



@Controller
public class AdminsController {

	  
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private RoleRepository roleRepository;
		@Autowired
		private UserRepository userRepository;
		
		
		 @RequestMapping("/table-admin")
		    public String admins(Model model) {
		        
			 	model.addAttribute("admins", userRepository.findAll());
			 
		    return "table-admin";
		    }
		 
		 
		 
		 
		 @RequestMapping("/delete")
		    public String delete(@RequestParam String id) {
		        Optional<User> admins = userRepository.findById(id);
		        userRepository.delete(admins.get());

		        return "redirect:/table-admin";
		    }
		 
		
		 
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		
	
	//@PostMapping("/addAdmin")
	//public String saveUser(@RequestBody Admins user) {
		
		//repository.save(user);
	//	return "Added user with id : " + user.getId();
		
	//}
	
	
	
	//@GetMapping("/findAllAdmins")
	//public List<Admins> getAdmins(){
		//return repository.findAll();
	//}
	
	//@GetMapping("/findAdmin")
	//public Optional<Admins> getAdmin(@PathVariable String id){
	//	return repository.findById(id);
	//}
	
	//@DeleteMapping("/deleteAdmin/{id}")
	//public String deleteAdmin(@PathVariable String id) {
	//	repository.deleteById(id);
	//	return "Admin deleted with id :" +id ; 
	//}
	
	
	
	
	
	
	
	
	
	
}
