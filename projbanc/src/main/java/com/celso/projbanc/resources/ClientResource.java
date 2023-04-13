package com.celso.projbanc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.celso.projbanc.domain.Client;
import com.celso.projbanc.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource{
	
	@Autowired
	private ClientService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Client> findById(@PathVariable Integer id){
		Client obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
