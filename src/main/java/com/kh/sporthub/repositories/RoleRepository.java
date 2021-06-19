package com.kh.sporthub.repositories;




import org.springframework.data.mongodb.repository.MongoRepository;

import com.kh.sporthub.models.Role;


public interface RoleRepository extends MongoRepository<Role, String> {
    
    Role findByRole(String role);
    
}