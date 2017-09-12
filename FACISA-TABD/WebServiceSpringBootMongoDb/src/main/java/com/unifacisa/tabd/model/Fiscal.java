package com.unifacisa.tabd.model;

import org.springframework.data.annotation.Id;

public class Fiscal {
	
	@Id
	private String id;
	
	private String name;
	
	private String nomeObraResponsavel;
	
	private String email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNomeObraResponsavel() {
		return nomeObraResponsavel;
	}

	public void setNomeObraResponsavel(String nomeObraResponsavel) {
		this.nomeObraResponsavel = nomeObraResponsavel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
