package com.example.expense.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class IncomeRequest {
    private BigDecimal amount;
    private String category;
    private LocalDate expenseDate;
}