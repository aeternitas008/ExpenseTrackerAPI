package com.example.expense.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ExpenseRequest {
    private String description;
    private BigDecimal amount;
    private String category;
    private LocalDateTime expenseDate;
}