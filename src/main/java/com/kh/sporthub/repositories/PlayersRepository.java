package com.kh.sporthub.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.kh.sporthub.models.Players;







@Repository
public interface PlayersRepository extends CrudRepository<Players, String> {
	
	    @Override
	    public void delete(Players players);
	
	    List<Players> findAll();
	
	
	
	
}
