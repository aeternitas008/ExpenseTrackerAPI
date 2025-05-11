package com.example.expense.service;

import org.springframework.stereotype.Service;

import com.example.expense.model.User;
import com.example.expense.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User register(User user) {
        // логика регистрации (валидация, хэширование и т.д.)
        return repo.save(user);
    }
}
