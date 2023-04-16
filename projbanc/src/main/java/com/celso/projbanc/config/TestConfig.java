package com.celso.projbanc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.celso.projbanc.services.DBService;

@Configuration
@Profile("dev")
public class TestConfig {

	@Autowired
	private DBService dbService;
	
	@Bean
	public void InstanciaDb() {
		this.dbService.instanciaDB();

	}
}
