package com.spring.erdem.person;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * ElternteildesSchueler-Class ist ein Sub-Class von Person-Class.
 * (
 * @author Erdem
 *
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="elternteil")
public class Elternteil{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="vorname")
	private String vorname;
	
	@Column(name="nachname")
	private String nachname;

	@Column(name="email")
	private String email;
	
	@Column(name="handynummer")
	private String handynummer;
	
	
	@ManyToMany(mappedBy = "eltern")
	private Set<Schueler> schueler;
		
	@Override
	public String toString() {
		return id + " " + vorname + " " + nachname + " "
				+ email + " " + handynummer;
	}	
}