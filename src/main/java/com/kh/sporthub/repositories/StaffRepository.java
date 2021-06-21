package com.kh.sporthub.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;


import com.kh.sporthub.models.Staff;








@Repository
public interface StaffRepository extends MongoRepository<Staff, String> {

	 @Override
	    public void delete(Staff players);
	
	    List<Staff> findAll();
	
	
	
	
	
	
	
	
	
	
	
	
}
