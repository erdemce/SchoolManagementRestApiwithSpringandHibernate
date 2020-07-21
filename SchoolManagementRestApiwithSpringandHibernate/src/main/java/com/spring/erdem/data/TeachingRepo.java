package com.spring.erdem.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.spring.erdem.model.Teaching;

@RepositoryRestResource(collectionResourceRel="teaching",path="teaching")
public interface TeachingRepo extends JpaRepository<Teaching, Integer>{
	
	
}
	