package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.navbarmodels;
import com.example.demo.services.navbarservices;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http:localhost:4200")
public class navbarcontroller {

	@Autowired
	navbarservices ser;
	@PostMapping("/navbar")
	public ResponseEntity<String> insert(navbarmodels n) {
		return ResponseEntity.ok(ser.insert(n));
	}
	@GetMapping("/navbar")
	public ResponseEntity<List<navbarmodels>> getall(){ 
		return ResponseEntity.ok(ser.getall()); 
	}
    
}
