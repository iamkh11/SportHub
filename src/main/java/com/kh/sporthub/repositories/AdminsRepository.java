package com.kh.sporthub.repositories;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kh.sporthub.models.Admins;









@Repository
public interface AdminsRepository extends CrudRepository<Admins, String> {


	 @Override
	    public void delete(Admins admins);
	
	    List<Admins> findAll();
	
	
	
	

}
