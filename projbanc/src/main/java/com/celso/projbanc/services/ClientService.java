package com.celso.projbanc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.celso.projbanc.domain.Client;
import com.celso.projbanc.dtos.ClientDTO;
import com.celso.projbanc.repositories.ClientRepository;
import com.celso.projbanc.services.exceptions.DataIntegratyViolationException;
import com.celso.projbanc.services.exceptions.ObjectNotFoundException;

import jakarta.validation.Valid;

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
	
	public Client create(ClientDTO objDTO) {
		//forma tradicional
		/*
		Client newObj = ;
		return repository.save(newObj);
		*/
		//forma reduzida
		if(findByCPF(objDTO) != null) {
			throw new DataIntegratyViolationException("CPF já cadastrado na base de dados");
		}
		return repository.save(new Client(null, objDTO.getName(), objDTO.getCpf(), objDTO.getBirthDate()));
	}
	
	public Client update(Integer id, @Valid ClientDTO objDTO) {
		Client oldObj = findById(id);
		
		if(findByCPF(objDTO) != null && findByCPF(objDTO).getId() != id) {
			throw new DataIntegratyViolationException("CPF já cadastrado na base de dados");
		}
		
		oldObj.setName(objDTO.getName());
		oldObj.setCpf(objDTO.getCpf());
		oldObj.setBirthDate(objDTO.getBirthDate());
		
		return repository.save(oldObj);
	}
	
	public void delete(Integer id) {
		Client obj = findById(id);
		
		if(obj.getList().size() > 0) {
			throw new DataIntegratyViolationException("Client possui transações cadastradas, não pode ser deletado");
		}
		repository.deleteById(id);
	}
	
	private Client findByCPF(ClientDTO objDTO) {
		 Client obj = repository.findByCPF(objDTO.getCpf());
		 if(obj != null) {
			 return obj;
		 }
		 return null;
	}


}
