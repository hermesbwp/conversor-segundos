package com.hp.conversor_data.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import domain.DataModel;

@RestController
public class DataController {
	
	@GetMapping(value="/tempo")
	ResponseEntity<String> teste(@RequestParam int tempo) {
		DataModel data=new DataModel(tempo);
		System.out.println(data.toString());
		return ResponseEntity.ok(data.toString()); 
	}
	
}
