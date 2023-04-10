package com.celso.projbanc.domain.enuns;

public enum TransactionType {
	
	DEPOSITO(0, "DEPOSITO"),
	SAQUE(1, "SAQUE"),
	PAGAMENTO_CONTA(2, "PAGAMENTO_CONTA"),
	PAGAMENTO_CARTAO_CREDITO(3, "PAGAMENTO_CARTAO_CREDITO"),
	TRANSFERENCIA_TED(4, "TRANSFERENCIA_TED"),
	TRANSFERENCIA_DOC(5, "TRANSFERENCIA_DOC"),
	PIX(6, "PIX");
	
	private Integer cod;
	private String description;
	private TransactionType(Integer cod, String description) {
		this.cod = cod;
		this.description = description;
	}
	public Integer getCod() {
		return cod;
	}
	public String getDescription() {
		return description;
	}
	
	public static TransactionType toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for (TransactionType x : TransactionType.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Tipo de Transação inválido");
	}
	

}
