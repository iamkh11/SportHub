package com.kh.sporthub.resources;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		 
		 
		 // Create new Admin 
		 
		 @RequestMapping("/add-admin")
		    public String create(Model model) {
		        return "add-admin";
		    }
		 
		 @RequestMapping("/save")
		    public String save(@RequestParam int j,@RequestParam String name, @RequestParam String username, @RequestParam String email, @RequestParam String password , @RequestParam String profil_pic_URL , @RequestParam String role) {
			 for (int i=0;i < j ; i++ ) {
			 Admins admins = new Admins();
			 	
			 	admins.setName(name);
			 	admins.setUsername(username);
			 	admins.setEmail(email);
			 	admins.setPassword(password);
			 	admins.setProfil_pic_URL(profil_pic_URL);
			 	admins.setRole(role);
			 	
			 	adminsRepository.save(admins);
			 }
		        return "redirect:/table-admin";
		    }
		 
		 // END
		 
		 
		 @RequestMapping("/modify-admin/{id}")
		    public String edit(@PathVariable String id, Model model) {
		        model.addAttribute("admins", adminsRepository.findById(id).get());
		        return "/modify-admin";
		        
		    }
		    
		    @RequestMapping("/update")
		    public String update(@RequestParam String id, @RequestParam String name, @RequestParam String username, @RequestParam String email, @RequestParam String password , @RequestParam String profil_pic_URL ,@RequestParam String role ) {
		      
		    	Optional<Admins> admins = adminsRepository.findById(id);
		      
		        admins.get().setName(name);
		        admins.get().setUsername(username);
		        admins.get().setEmail(email);
		        admins.get().setPassword(password);
		        admins.get().setProfil_pic_URL(profil_pic_URL);
		        admins.get().setRole(role);
		        
		        adminsRepository.save(admins.get());

		        return "redirect:/table-admin" ;
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
