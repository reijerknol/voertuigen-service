package com.reijer.parkeerapp.voertuigenservice;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.reijer.parkeerapp.voertuigenservice.controllers.VoertuigenController;
import com.reijer.parkeerapp.voertuigenservice.controllers.VoertuigenRepository;
import com.reijer.parkeerapp.voertuigenservice.controllers.beans.Voertuig;

@ExtendWith(MockitoExtension.class)
@DataJpaTest
class VoertuigenControllerTest {

	@InjectMocks
	VoertuigenController voertuigenController;
	
	@Mock
	VoertuigenRepository repository;
	
	@Test
	void testFindAll() {
		//given
		List<Voertuig> voertuigen = new ArrayList<Voertuig>(); 
		voertuigen.add(new Voertuig(1, "tank1",true,"foto1"));
		voertuigen.add(new Voertuig(2, "tank2",true,"foto2"));

		when(repository.findAll()).thenReturn(voertuigen);
		
		//when
		List<Voertuig> resultaat = voertuigenController.retrieveVoertuigen();
		
		//then
		 assertThat(resultaat.size()).isEqualTo(2);
         
	        assertThat(resultaat.get(0).getNaam())
	                        .isEqualTo("tank1");
	         
	        assertThat(resultaat.get(1).getFoto())
            .isEqualTo("foto2");
	}
}
