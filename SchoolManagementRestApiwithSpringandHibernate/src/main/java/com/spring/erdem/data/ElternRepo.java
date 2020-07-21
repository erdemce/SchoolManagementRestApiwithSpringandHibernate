package com.spring.erdem.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.spring.erdem.person.Elternteil;

@RepositoryRestResource(collectionResourceRel="eltern",path="eltern")
public interface ElternRepo extends JpaRepository<Elternteil, Integer>{
	
	
}
	