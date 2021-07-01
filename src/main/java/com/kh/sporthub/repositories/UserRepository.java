/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kh.sporthub.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.kh.sporthub.models.User;

/**
 *
 * @author didin
 */
public interface UserRepository extends MongoRepository<User, String> {
    
	
	
	 @Override
	    public void delete(User admins);
	 
    User findByEmail(String email);
    
}
