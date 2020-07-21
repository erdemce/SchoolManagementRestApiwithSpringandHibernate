package com.spring.erdem.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.spring.erdem.model.Leistungen;

@RepositoryRestResource(collectionResourceRel="leistungen",path="leistungen")
public interface LeistungenRepo extends JpaRepository<Leistungen, Integer>{
	
	
}
	