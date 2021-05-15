package com.kh.sporthub.repositories;


import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.kh.sporthub.models.Supporters;








@Repository
public interface SupportersRepository  extends CrudRepository<Supporters, String> {

	
		
	 List<Supporters> findAll();
	

}
