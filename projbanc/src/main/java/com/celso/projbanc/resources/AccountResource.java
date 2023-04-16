package com.celso.projbanc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.celso.projbanc.dtos.AccountDTO;
import com.celso.projbanc.services.AccountService;

@RestController
@RequestMapping(value="/account")
public class AccountResource {
	
	@Autowired
	private AccountService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<AccountDTO> findById(@PathVariable Integer id){
		AccountDTO obj = new AccountDTO(service.findByID(id));
		return ResponseEntity.ok().body(obj);
	}

}
