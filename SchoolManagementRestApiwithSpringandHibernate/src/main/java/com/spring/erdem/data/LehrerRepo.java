package com.spring.erdem.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.spring.erdem.person.Lehrer;

@RepositoryRestResource(collectionResourceRel="lehrer",path="lehrer")
public interface LehrerRepo extends JpaRepository<Lehrer, Integer>{
	
	
}
	