package com.celso.projbanc.domain;

import java.time.LocalDateTime;
import java.util.Objects;

import com.celso.projbanc.domain.enuns.TransactionType;

public class Transaction {
	
	private Integer id;
	private Integer idAccount;
	private LocalDateTime transactionDate;
	private Integer transactionType;
	private Double transactionValue;
	private Client client;
	private Account account;
	
	public Transaction() {
		super();
		this.setTransactionDate(LocalDateTime.now());
	}

	public Transaction(Integer id, Integer idAccount, TransactionType transactionType,
			Double transactionValue, Client client, Account account) {
		super();
		this.id = id;
		this.idAccount = idAccount;
		this.setTransactionDate(LocalDateTime.now());
		this.transactionType = (transactionType == null) ? 0 : transactionType.getCod();
		this.transactionValue = transactionValue;
		this.client = client;
		this.account = account;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(Integer idAccount) {
		this.idAccount = idAccount;
	}

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}

	public TransactionType getTransactionType() {
		return TransactionType.toEnum(this.transactionType);
	}

	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType.getCod();
	}

	public Double getTransactionValue() {
		return transactionValue;
	}

	public void setTransactionValue(Double transactionValue) {
		this.transactionValue = transactionValue;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	

}
