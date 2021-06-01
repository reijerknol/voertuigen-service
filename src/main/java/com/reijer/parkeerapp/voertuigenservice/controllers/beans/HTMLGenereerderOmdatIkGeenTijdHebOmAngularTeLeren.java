package com.reijer.parkeerapp.voertuigenservice.controllers.beans;

import java.util.List;

public class HTMLGenereerderOmdatIkGeenTijdHebOmAngularTeLeren {

	public static String begin="<html lang='en'>\r\n"
			+ "<head>\r\n"
			+ "</head>"
	+ "<body>";
	
	public static String end= "<body>"
			+ "<html>";
	
	public static String insertVoertuigen(List<Voertuig> voertuigen) {
		String voertuigenHTML= "";
		for(Voertuig voertuig : voertuigen) {
			voertuigenHTML = voertuigenHTML + 
					"<h3>" + voertuig.getNaam() 
					+ "<h3>"
					+ "<img alt="
					+ voertuig.getNaam()
					+ " src=" 
					+ voertuig.getFoto()
					+ " \" width=\"300\" height=\"225\">"
					+ " <h2>Beschikbaar? </h2>" 
					+ voertuig.isBeschikbaar();
		}
		
		return HTMLGenereerderOmdatIkGeenTijdHebOmAngularTeLeren.begin 
				+ voertuigenHTML
				+ HTMLGenereerderOmdatIkGeenTijdHebOmAngularTeLeren.end;
	}
	
}
