package com.kh.sporthub.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

import com.kh.sporthub.models.Users;







@Repository
public interface UsersRepository extends MongoRepository<Users, String> {
	
	
	

}
