package com.kh.sporthub.resources;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.sporthub.models.Admins;

import com.kh.sporthub.repositories.AdminsRepository;



@Controller
public class AdminsController {

		@Autowired
		private AdminsRepository adminsRepository;
		
		 @RequestMapping("/table-admin")
		    public String admins(Model model) {
		        
			 	model.addAttribute("admins", adminsRepository.findAll());
			 
		    return "table-admin";
		    }
		 
		 
		 
		 @GetMapping("/findOne")
		 @ResponseBody
		 public Optional<Admins> findOne(String id) {
			 return adminsRepository.findById(id);
		 }
		 
		 
		 @RequestMapping("/delete")
		    public String delete(@RequestParam String id) {
		        Optional<Admins> admins = adminsRepository.findById(id);
		        adminsRepository.delete(admins.get());

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
