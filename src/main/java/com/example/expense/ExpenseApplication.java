package com.example.expense;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.expense.model")
public class ExpenseApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExpenseApplication.class, args);
    }
}

