package com.finance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finance.entity.Budget;
import com.finance.service.impl.BudgetServiceImpl;

@RestController
@RequestMapping("/budgets")
public class BudgetController {
	
	@Autowired
	private BudgetServiceImpl budgetService;

	@PostMapping
	public Budget createBudget(@RequestBody Budget budget) {
		return budgetService.createBudget(budget);
	}

	@GetMapping("/user/{userId}")
	public List<Budget> getBudgetsByUser(@PathVariable Long userId) {
		return budgetService.getBudgetsByUser(userId);
	}
}
