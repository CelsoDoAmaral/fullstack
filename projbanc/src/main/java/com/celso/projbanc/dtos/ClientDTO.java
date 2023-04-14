package com.celso.projbanc.dtos;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.validator.constraints.br.CPF;

import com.celso.projbanc.domain.Client;
import com.fasterxml.jackson.annotation.JsonFormat;

public class ClientDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;

	@CPF
	private String cpf;

	@JsonFormat(pattern = "dd/MM/yyy HH:mm")
	private LocalDateTime birthDate;

	public ClientDTO() {
		super();
	}

	public ClientDTO(Client obj) {
		super();
		this.id = obj.getId();
		this.name = obj.getName();
		this.cpf = obj.getCpf();
		this.birthDate = obj.getBirthDate();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDateTime getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDateTime birthDate) {
		this.birthDate = birthDate;
	}

}
