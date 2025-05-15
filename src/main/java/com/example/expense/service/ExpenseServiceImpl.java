package com.example.expense.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.expense.dto.ExpenseRequest;
import com.example.expense.model.Expense;
import com.example.expense.model.User;
import com.example.expense.repository.ExpenseRepository;

@Service
@Transactional
public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseRepository expenseRepository;

    public ExpenseServiceImpl(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public Expense createExpense(ExpenseRequest request, User user) {
        Expense expense = new Expense();
        expense.setDescription(request.getDescription());
        expense.setAmount(request.getAmount());
        expense.setCategory(request.getCategory());
        expense.setExpenseDate(request.getExpenseDate());
        expense.setUser(user);
        return expenseRepository.save(expense);
    }

    @Override
    public List<Expense> getAllExpenses(User user) {
        return expenseRepository.findByUser(user);
    }

    @Override
    public Expense getExpense(Long id, User user) {
        return expenseRepository.findByIdAndUser(id, user)
                .orElseThrow(() -> new RuntimeException("Expense not found"));
    }

    @Override
    public Expense updateExpense(Long id, ExpenseRequest request, User user) {
        Expense expense = getExpense(id, user);
        expense.setDescription(request.getDescription());
        expense.setAmount(request.getAmount());
        expense.setCategory(request.getCategory());
        expense.setExpenseDate(request.getExpenseDate());
        return expenseRepository.save(expense);
    }

    @Override
    public void deleteExpense(Long id, User user) {
        Expense expense = getExpense(id, user);
        expenseRepository.delete(expense);
    }
}