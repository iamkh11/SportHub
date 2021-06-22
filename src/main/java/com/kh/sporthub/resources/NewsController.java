package com.kh.sporthub.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.sporthub.models.News;

import com.kh.sporthub.repositories.NewsRepository;










@Controller
public class NewsController {

	
	@Autowired
	private NewsRepository newsRepository;
	
	
		// show 
	  @RequestMapping("/news")
	    public String news(Model model) {
		  
		  
	        model.addAttribute("news", newsRepository.findAll());
	        
	       
	        return "news";
	    }
	
	  @RequestMapping("/deletepost")
	    public String delete(@RequestParam String id) {
	        Optional<News> news = newsRepository.findById(id);
	        newsRepository.delete(news.get());

	        return "redirect:/news";
	    }
	
	  // Modify 
	  
	  
	  @RequestMapping("/updatepost/{id}")
	    public String edit(@PathVariable String id, Model model) {
	    	
	        model.addAttribute("news", newsRepository.findById(id).get());
	       
	        
	        return "/updatepost";
	        
	    }
	    
	    @RequestMapping("/updatenews")
	    public String updates(@RequestParam String id, @RequestParam String title, 
	    		  @RequestParam String date, @RequestParam Boolean status, @RequestParam String image, 
	    		     @RequestParam String content  ) {
	    		
	    		
	      
	    	Optional<News> news = newsRepository.findById(id);
	    	
	 	       
	    	
	    	news.get().setTitle(title);
	    	
	    	news.get().setDate(date);
	    	
	    	news.get().setStatus(status);
	    	
	    	news.get().setImage(image);
	    	
	    	news.get().setContent(content);
	    
	    	
	    	
	    	
	    	newsRepository.save(news.get());

	        return "redirect:/news" ;
	    }
	
	    
	    // CREATE  
	    @RequestMapping("/addpost")
	    public String create(Model model) {
	    	
	    	  model.addAttribute("news", newsRepository.findAll());
	    	  
	        return "addpost";
	    }
	    
		 
		 @RequestMapping("/savepost")
		    public String save(@RequestParam String title, 
		    		  @RequestParam String date,  @RequestParam Boolean status, @RequestParam String image, 
		    		  @RequestParam String descipline ,  @RequestParam String content
		    		) {
		    		
		    		
		    	
			 
			 News news = new News();
			 	
			
			 	news.setTitle(title);
		    	news.setDate(date);
		    	news.setStatus(status);
		    	
		    	news.setImage(image);
		    	news.setDescipline(descipline);
		    	news.setContent(content);
			 
			
			 	
		    	newsRepository.save(news);
			
		        return "redirect:/news";
		    }
		 
		 // END
	
	
	
	
	
	
	
	
}
