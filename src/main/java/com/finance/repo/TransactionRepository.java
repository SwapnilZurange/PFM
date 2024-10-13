package com.finance.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByUserId(Long userId);
}
