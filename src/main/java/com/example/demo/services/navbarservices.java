package com.example.demo.services;

import java.util.List;

import com.example.demo.models.navbarmodels;

public interface navbarservices {
	public String insert(navbarmodels n);
	public String update(navbarmodels n,Integer id);
	public List<navbarmodels> getall();
	public String deleteby(Integer id);
	

}
