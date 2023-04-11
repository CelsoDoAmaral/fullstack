package com.celso.projbanc.services;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.celso.projbanc.domain.Account;
import com.celso.projbanc.domain.Client;
import com.celso.projbanc.domain.Transaction;
import com.celso.projbanc.domain.enuns.AccountType;
import com.celso.projbanc.domain.enuns.StatusAccount;
import com.celso.projbanc.domain.enuns.TransactionType;
import com.celso.projbanc.repositories.AccountRepository;
import com.celso.projbanc.repositories.ClientRepository;
import com.celso.projbanc.repositories.TransactionRepository;

@Service
public class DBService {

	@Autowired
	private ClientRepository clientReposiroty;
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private TransactionRepository transactionReposiroty;

	public void instanciaDB() {
		Client cl1 = new Client(null, "Celso do Amaral", "14701879819", LocalDateTime.of(1975, 5, 10, 0, 0));
		Account ac1 = new Account(null, "123", AccountType.CORRENTE, 0.0, StatusAccount.ABERTA);
		Transaction ts1 = new Transaction(null, 1, TransactionType.DEPOSITO, 10.1, cl1, ac1);

		cl1.getList().add(ts1);
		clientReposiroty.saveAll(Arrays.asList(cl1));
		accountRepository.saveAll(Arrays.asList(ac1));
		transactionReposiroty.saveAll(Arrays.asList(ts1));
	}
}
