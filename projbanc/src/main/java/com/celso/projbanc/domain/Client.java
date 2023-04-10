package com.celso.projbanc.domain;

import java.time.LocalDateTime;

import java.io.Serializable;

public class Client extends People implements Serializable {
	private static final long serialVersionUID = 1L;

	public Client() {
		super();
	}

	public Client(Integer id, String name, String cpf, LocalDateTime birthDate) {
		super(id, name, cpf, birthDate);
	}

}
