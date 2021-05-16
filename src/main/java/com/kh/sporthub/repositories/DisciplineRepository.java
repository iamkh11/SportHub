package com.kh.sporthub.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kh.sporthub.models.Discipline;







@Repository
public interface DisciplineRepository extends CrudRepository<Discipline, String>{

	List<Discipline> findAll();
	
	
	
	
	
}
