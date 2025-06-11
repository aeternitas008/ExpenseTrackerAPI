package com.example.expense.service;

import com.example.expense.dto.ExpenseRequest;
import com.example.expense.dto.IncomeRequest;
import com.example.expense.model.Expense;
import com.example.expense.model.Income;
import com.example.expense.model.User;

import java.util.List;

public interface IncomeService {
    Income createIncome(IncomeRequest request, User user);

    List<Income> getAllIncome(User user);

    Income getIncome(Long id, User user);

    Income updateIncome(Long id, IncomeRequest request, User user);

    void deleteIncome(Long id, User user);
}