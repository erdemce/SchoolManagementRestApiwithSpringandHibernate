package com.spring.erdem.person;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.spring.erdem.model.Fach;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Lehrer-Class ist ein Sub-Class von Person-Class.
 * 
 * @author Erdem
 *
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="lehrer")
public class Lehrer{
	
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
	
	@Enumerated(EnumType.STRING)
	@Column(name="fach")
	private Fach fach;

	@Override
	public String toString() {
		return "" + id + " " + vorname + " " + nachname + " " + email + " " + handynummer;
	}
}
