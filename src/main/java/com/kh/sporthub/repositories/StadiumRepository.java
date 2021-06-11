package com.kh.sporthub.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.kh.sporthub.models.Stadium;





@Repository
public interface StadiumRepository  extends MongoRepository<Stadium, String> {
	
	
	@Override
	  List<Stadium> findAll();
	  

}


