package com.finance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finance.entity.Transaction;
import com.finance.service.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
	@Autowired
	private TransactionService transactionService;

	@PostMapping
	public Transaction createTransaction(@RequestBody Transaction transaction) {
		return transactionService.createTransaction(transaction);
	}

	@GetMapping("/user/{userId}")
	public List<Transaction> getTransactionsByUser(@PathVariable Long userId) {
		return transactionService.getTransactionsByUser(userId);
	}
}
