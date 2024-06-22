package com.expense_hound.backend.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.expense_hound.backend.model.response.IResponse;
import com.expense_hound.backend.model.response.homeresponse.HomeResponse;

@RestController
public class Controller {

	@GetMapping("/")
	public IResponse home() {
		return new HomeResponse("Welcome to ExpenseHound!");
	}

	@GetMapping("/expenses")
	public List<String> getExpenses() {
		return Arrays.asList("Expense1", "Expense2", "Expense3");
	}
}