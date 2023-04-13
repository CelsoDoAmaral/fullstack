package com.celso.projbanc.domain;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Client extends People implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonIgnore
	@OneToMany(mappedBy="client")
	private List<Transaction> list = new ArrayList<>();

	public List<Transaction> getList() {
		return list;
	}

	public void setList(List<Transaction> list) {
		this.list = list;
	}

	public Client() {
		super();
	}

	public Client(Integer id, String name, String cpf, LocalDateTime birthDate) {
		super(id, name, cpf, birthDate);
	}

}

