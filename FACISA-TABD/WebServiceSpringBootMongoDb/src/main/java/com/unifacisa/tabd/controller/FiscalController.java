package com.unifacisa.tabd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.unifacisa.tabd.model.Fiscal;
import com.unifacisa.tabd.repository.FiscalRepository;

@RestController
@RequestMapping("/fiscal")
public class FiscalController {
	
	@Autowired
	FiscalRepository fiscalRepository;
	
	//create
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void creater (@RequestBody Fiscal fiscal)
	{
		fiscalRepository.save(fiscal);
	}
	
	
	//read
	@RequestMapping(value = "/{id}")
	public Fiscal read(@PathVariable String id) 
	{
		return fiscalRepository.findOne(id);
	}
	
	
	//update
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void update (@RequestBody Fiscal fiscal) 
	{
		fiscalRepository.save(fiscal);
	}
	
	
	//delete
	@RequestMapping(value ="/{id}", method = RequestMethod.DELETE)
	public void delete (@PathVariable String  id) 
	{
		fiscalRepository.delete(id);
	}
}
