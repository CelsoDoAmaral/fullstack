package com.celso.projbanc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.celso.projbanc.domain.Account;
import com.celso.projbanc.repositories.AccountRepository;
import com.celso.projbanc.services.exceptions.ObjectNotFoundException;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository repository;
	
	public Account findByID(Integer id) {
		Optional<Account> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException( 
				"Objeto não encotrado! id: " + id + ", Tipo: " + Account.class.getName()));
	}
}
