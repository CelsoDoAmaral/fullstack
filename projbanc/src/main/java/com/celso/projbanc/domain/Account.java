package com.celso.projbanc.domain;

import java.time.LocalDateTime;
import java.util.Objects;

import com.celso.projbanc.domain.enuns.StatusAccount;

public class Account {
	private Integer id;
	private String accountNumber;
	private String accountType;
	private LocalDateTime accountOpen;
	private LocalDateTime accountClose;
	private Double balance;
	private Integer statusAccount;
	
	public Account() {
		super();
		this.setAccountOpen(LocalDateTime.now());
		this.setStatusAccount(StatusAccount.ABERTA);
	}

	public LocalDateTime getAccountOpen() {
		return accountOpen;
	}

	public void setAccountOpen(LocalDateTime accountOpen) {
		this.accountOpen = accountOpen;
	}

	public LocalDateTime getAccountClose() {
		return accountClose;
	}

	public void setAccountClose(LocalDateTime accountClose) {
		this.accountClose = accountClose;
	}

	public Account(Integer id, String accountNumber, String accountType, 
			Double balance, StatusAccount statusAccount) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.setAccountOpen(LocalDateTime.now());
		this.balance = balance;
		this.statusAccount = (statusAccount == null) ? 0 : statusAccount.getCod();
	}

	public StatusAccount getStatusAccount() {
		return StatusAccount.toEnum(this.statusAccount);
	}

	public void setStatusAccount(StatusAccount statusAccount) {
		this.statusAccount = statusAccount.getCod();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accountNumber, other.accountNumber) && Objects.equals(id, other.id);
	}
	
	
	
	

}
