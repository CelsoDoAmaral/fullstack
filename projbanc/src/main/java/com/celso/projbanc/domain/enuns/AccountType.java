package com.celso.projbanc.domain.enuns;

public enum AccountType {
	CORRENTE(0, "CORRENTE"), POUPANCA(1, "POUPANCA"), INVESTIMENTO(2, "INVESTIMENTO");

	private Integer cod;
	private String description;

	private AccountType(Integer cod, String description) {
		this.cod = cod;
		this.description = description;
	}

	public Integer getCod() {
		return cod;
	}

	public String getDescription() {
		return description;
	}

	public static AccountType toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}

		for (AccountType x : AccountType.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}

		throw new IllegalArgumentException("Tipo de conta inválido");
	}

}
