package com.celso.projbanc.domain;

import java.time.LocalDate;

import java.io.Serializable;

public class Client extends People implements Serializable {
	private static final long serialVersionUID = 1L;

	public Client() {
		super();
	}

	public Client(Integer id, String name, String cpf, LocalDate birthDate) {
		super(id, name, cpf, birthDate);
	}

}
