package com.spring.erdem.person;


import java.time.LocalDate;
import java.util.Set;

import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * Schueler-Class ist ein Sub-Class von Person-Class.
 * 
 * @author Erdem
 *
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="schueler")
public class Schueler {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="vorname")
	private String vorname;
	
	@Column(name="nachname")
	private String nachname;


	@Column(name="stufe")
	private int stufe;
	
	@Column(name="klassenzimmer")
	private String klassenzimmer;
	
	@Column(name="geburtsdatum")
	private LocalDate geburtsdatum;
	
	@ManyToMany(cascade = {
	        CascadeType.PERSIST,
	        CascadeType.MERGE
	    })
	    @JoinTable(name = "schueler_elternteil",
	        joinColumns = @JoinColumn(name = "schueler_id"),
	        inverseJoinColumns = @JoinColumn(name = "elternteil_id")
	    )
	private Set<Elternteil> eltern;

	@Override
	public String toString() {
		return  id + " " + vorname + " " + nachname + " " + stufe
				+ "-" + klassenzimmer + " " + geburtsdatum;
	}
	
	
}