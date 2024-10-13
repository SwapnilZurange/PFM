package com.finance.service.external;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.finance.entity.Budget;

@FeignClient(name = "budget-service")
public interface BudgetServiceFeignClient {
	@GetMapping("/budgets/user/{userId}")
	List<Budget> getBudgetsByUser(@PathVariable Long userId);
}
