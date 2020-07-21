package com.spring.erdem.model;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.spring.erdem.person.Lehrer;
import com.spring.erdem.person.Schueler;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="teaching")
public class Teaching {
	
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Schueler schueler;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Lehrer lehrer;
	
	@Enumerated(EnumType.STRING)
	@Column(name="fach")
	private Fach fach;
	
	@OneToMany(mappedBy = "teaching", cascade = CascadeType.ALL)
	private List<Leistungen> ergebnisse;
	
}
