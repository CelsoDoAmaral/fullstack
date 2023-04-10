package com.celso.projbanc.domain.enuns;

public enum StatusAccount {

	ABERTA (0, "ABERTA"), FECHADA(1, "FECHADA"), ATIVA(2, "ATIVA"), 
	INATIVA(3, "INATIVA"), BLOQUEADA(4, "BLOQUEADA");

	private Integer cod;
	private String description;

	private StatusAccount(Integer cod, String description) {
		this.cod = cod;
		this.description = description;
	}

	public Integer getCod() {
		return cod;
	}

	public String getDescription() {
		return description;
	}

	public static StatusAccount toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}

		for (StatusAccount x : StatusAccount.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}

		throw new IllegalArgumentException("Tipo de status de conta inválido");
	}

}
