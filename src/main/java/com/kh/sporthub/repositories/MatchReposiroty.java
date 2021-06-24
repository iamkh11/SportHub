package com.kh.sporthub.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.kh.sporthub.models.Match;





public interface MatchReposiroty extends MongoRepository<Match, String>  {

	 @Override
		public void delete(Match match);
		
		    List<Match> findAll();

		
	
	
	
	
	
	
	
	
	
	
}
