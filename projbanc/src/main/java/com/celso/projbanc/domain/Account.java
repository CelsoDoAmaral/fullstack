package com.celso.projbanc.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.celso.projbanc.domain.enuns.AccountType;
import com.celso.projbanc.domain.enuns.StatusAccount;
import com.celso.projbanc.domain.enuns.TransactionType;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String accountNumber;
	private Integer accountType;
	@JsonFormat(pattern = "dd/MM/yyy HH:mm")
	private LocalDateTime accountOpen;
	@JsonFormat(pattern = "dd/MM/yyy HH:mm")
	private LocalDateTime accountClose;
	private Double balance;
	private Integer statusAccount;
	
	@OneToMany(mappedBy="account")
	private List<Transaction> list = new ArrayList<>();
	
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
	
	

	public Account(Integer id, String accountNumber, AccountType accountType,/* LocalDateTime accountOpen,*/
			/*LocalDateTime accountClose,*/ Double balance, StatusAccount statusAccount/*, List<Transaction> list*/) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.accountType = (accountType == null) ? 0 : accountType.getCod();
		//this.setAccountOpen(LocalDateTime.now());
		//this.accountClose = accountClose;
		this.balance = balance;
		this.statusAccount = (statusAccount == null) ? 0 : statusAccount.getCod();
		//this.list = list;
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

	public AccountType getAccountType() {
		return AccountType.toEnum(this.accountType);
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType.getCod();
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

