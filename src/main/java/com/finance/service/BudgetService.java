package com.finance.service;

import java.util.List;

import com.finance.entity.Budget;

public interface BudgetService {

	public Budget createBudget(Budget budget);

	public List<Budget> getBudgetsByUser(Long userId);
}
