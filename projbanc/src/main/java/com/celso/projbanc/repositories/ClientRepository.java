package com.celso.projbanc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.celso.projbanc.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{

}
