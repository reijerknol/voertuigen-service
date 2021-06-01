package com.reijer.parkeerapp.voertuigenservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reijer.parkeerapp.voertuigenservice.controllers.beans.HTMLGenereerderOmdatIkGeenTijdHebOmAngularTeLeren;
import com.reijer.parkeerapp.voertuigenservice.controllers.beans.Voertuig;

@RestController
public class VoertuigenController {
	
	@Autowired
	private VoertuigenRepository repository;
	
	@GetMapping("/voertuigen")
	public List<Voertuig> retrieveVoertuigen(){
		return repository.findAll();
	}
	
	@GetMapping("/")
	public String index(){
		return HTMLGenereerderOmdatIkGeenTijdHebOmAngularTeLeren.insertVoertuigen(this.retrieveVoertuigen());
	}
	
	@PostMapping("/voertuigen")
	public Voertuig postVoertuig(@RequestBody Voertuig voertuig ) {
		return repository.save(voertuig);
	}
}
