package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.navbarmodels;
import com.example.demo.repository.navbarrepo;

@Service
public class navbarserviceimplementation implements navbarservices {
	@Autowired
	navbarrepo repo;

	@Override
	public String insert(navbarmodels n) {
		this.repo.save(n);
		return "successfully inserted";
	}

	@Override
	public String update(navbarmodels n, Integer id) {
		return "successfully updated";
	}

	@Override
	public List<navbarmodels> getall() {
		return (List<navbarmodels>) repo.findAll();
	}

	@Override 
	public String deleteby(Integer id) {
		this.repo.deleteById(id);
		return "successfully deleted";
	}

}
