package com.finance.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finance.entity.Budget;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
	List<Budget> findByUserId(Long userId);
}
