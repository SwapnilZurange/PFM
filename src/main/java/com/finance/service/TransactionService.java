package com.finance.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.finance.entity.Transaction;

@Service
public interface TransactionService {

	public Transaction createTransaction(Transaction transaction);

	public List<Transaction> getTransactionsByUser(Long userId);

}
