package com.kh.sporthub.repositories;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.kh.sporthub.models.Staff;








@Repository
public interface StaffRepository extends CrudRepository<Staff, String> {

	 @Override
	    public void delete(Staff players);
	
	    List<Staff> findAll();
	
	
	
	
	
	
	
	
	
	
	
	
}
