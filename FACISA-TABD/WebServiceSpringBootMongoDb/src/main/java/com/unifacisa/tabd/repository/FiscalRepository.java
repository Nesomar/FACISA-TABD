package com.unifacisa.tabd.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.unifacisa.tabd.model.Fiscal;

public interface FiscalRepository extends MongoRepository<Fiscal, String>{

	public Fiscal findOneByName (String name);
	
}
