package com.celso.projbanc.dtos;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.celso.projbanc.domain.Account;

public class AccountDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String accountNumber;
	private Integer accountType;
	private LocalDateTime accountOpen;
	private LocalDateTime accountClose;
	private Double balance;
	private Integer statusAccount;
	
	public AccountDTO() {
		super();
	}

	public AccountDTO(Account obj) {
		super();
		this.id = obj.getId();
		this.accountNumber = obj.getAccountNumber();
		this.accountType = obj.getAccountType().getCod();
		this.accountOpen = obj.getAccountOpen();
		this.accountClose = obj.getAccountClose();
		this.balance = obj.getBalance();
		this.statusAccount = obj.getStatusAccount().getCod();
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

	public Integer getAccountType() {
		return accountType;
	}

	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
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

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Integer getStatusAccount() {
		return statusAccount;
	}

	public void setStatusAccount(Integer statusAccount) {
		this.statusAccount = statusAccount;
	}
	
	
	
	
	
	

}
