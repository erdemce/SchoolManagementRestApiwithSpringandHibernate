package com.spring.erdem.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.spring.erdem.person.Schueler;

@RepositoryRestResource(collectionResourceRel="schueler",path="schueler")
public interface SchuelerRepo extends JpaRepository<Schueler, Integer>{
	
	
}
	