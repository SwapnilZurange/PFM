package com.finance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.entity.Budget;
import com.finance.repo.BudgetRepository;
import com.finance.service.BudgetService;

@Service
public class BudgetServiceImpl implements BudgetService {

	@Autowired
	private BudgetRepository budgetRepository;

	@Override
	public Budget createBudget(Budget budget) {
		return budgetRepository.save(budget);
	}

	@Override
	public List<Budget> getBudgetsByUser(Long userId) {
		return budgetRepository.findByUserId(userId);
	}

}
