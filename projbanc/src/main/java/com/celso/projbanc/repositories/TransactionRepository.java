package com.celso.projbanc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.celso.projbanc.domain.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

}
