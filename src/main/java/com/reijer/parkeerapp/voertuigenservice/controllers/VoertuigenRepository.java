package com.reijer.parkeerapp.voertuigenservice.controllers;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reijer.parkeerapp.voertuigenservice.controllers.beans.Voertuig;


public interface VoertuigenRepository extends JpaRepository<Voertuig, Long> {

}
