package com.finance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.entity.Transaction;
import com.finance.repo.TransactionRepository;
import com.finance.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;

	@Override
	public Transaction createTransaction(Transaction transaction) {
		Transaction savedTransaction = transactionRepository.save(transaction);

		// Notify based on transaction details
		/*
		 * notificationService.sendNotification("Transaction created: " +
		 * transaction.getDescription());
		 */

		return savedTransaction;
	}

	@Override
	public List<Transaction> getTransactionsByUser(Long userId) {
		return transactionRepository.findByUserId(userId);
	}
}