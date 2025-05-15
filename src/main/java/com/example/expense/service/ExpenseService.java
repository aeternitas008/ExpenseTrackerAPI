package com.example.expense.service;

import java.util.List;

import com.example.expense.dto.ExpenseRequest;
import com.example.expense.model.Expense;
import com.example.expense.model.User;

public interface ExpenseService {
    Expense createExpense(ExpenseRequest request, User user);

    List<Expense> getAllExpenses(User user);

    Expense getExpense(Long id, User user);

    Expense updateExpense(Long id, ExpenseRequest request, User user);

    void deleteExpense(Long id, User user);
}