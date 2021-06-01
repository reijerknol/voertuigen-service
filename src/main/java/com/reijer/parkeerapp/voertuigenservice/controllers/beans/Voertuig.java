package com.reijer.parkeerapp.voertuigenservice.controllers.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Voertuig {
	
	@Id
	@NotNull
	private int id;
	
	@Size(min=2, message="Naam moet tenminste 2 characters hebben")
	@NotNull
	private String naam;

	@NotNull
	private boolean beschikbaar;
	private String foto;
	
	public Voertuig() {
		
	}
	
	public Voertuig(int id, String naam,
			boolean beschikbaar, String foto) {
		super();
		this.id = id;
		this.naam = naam;
		this.beschikbaar = beschikbaar;
		this.foto = foto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public boolean isBeschikbaar() {
		return beschikbaar;
	}

	public void setBeschikbaar(boolean beschikbaar) {
		this.beschikbaar = beschikbaar;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
	
}
