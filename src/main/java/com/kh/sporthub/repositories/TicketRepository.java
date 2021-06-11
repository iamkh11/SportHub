package com.kh.sporthub.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kh.sporthub.models.Stadium;
import com.kh.sporthub.models.Ticket;




@Repository
public interface TicketRepository  extends CrudRepository<Ticket, String>{

	
	@Override
	List<Ticket> findAll();
	 
	
	
	
	
	
	
	
	
	
	
	
	
}
