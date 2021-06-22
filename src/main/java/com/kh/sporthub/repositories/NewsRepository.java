package com.kh.sporthub.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kh.sporthub.models.News;






public interface NewsRepository  extends MongoRepository<News, String>  {

	 @Override
	public void delete(News news);
	
	    List<News> findAll();
	    
	    Optional<News> findByid(String id) ;
	
	
	
}
