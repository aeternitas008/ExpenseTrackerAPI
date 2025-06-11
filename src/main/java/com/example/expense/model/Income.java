package com.example.expense.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "income")
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(nullable = false)
    private String category;

    @Column(name = "income_date", nullable = false)
    private LocalDate incomeDate;
    
    @PrePersist
    public void prePersist() {
        if (incomeDate == null) {
            incomeDate = LocalDate.now();
        }
        if (createdAt == null) {
            createdAt = LocalDateTime.now();
        }
    }

    @ManyToOne
    private User user;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
}