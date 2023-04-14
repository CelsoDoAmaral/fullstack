package com.celso.projbanc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.celso.projbanc.domain.Client;
import com.celso.projbanc.repositories.ClientRepository;
import com.celso.projbanc.services.exceptions.ObjectNotFoundException;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public Client findById(Integer id) {
		Optional<Client> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + Client.class.getName()));
	}

	public List<Client> findAll() {
		return repository.findAll();
	}
}
