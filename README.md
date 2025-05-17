# Expense Tracker API

RESTful API для учёта расходов. Реализовано на Java с использованием Spring Boot.

## 🚀 Возможности

- Регистрация и аутентификация пользователей (JWT)
- Добавление, обновление и удаление расходов
- Получение списка расходов по пользователю
- Swagger UI для тестирования и документации

## 🔐 Аутентификация

Используется JWT.  
Для авторизованных запросов необходимо передавать токен в заголовке:

Authorization: Bearer <your_token>

В Swagger UI также доступна кнопка **Authorize**, куда можно вставить токен.


## 📄 Документация

Интерактивная документация доступна по адресу:  
👉 [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## 📦 Технологии

- Java 17
- Spring Boot
- Spring Security + JWT
- Spring Data JPA + PostgreSQL
- Springdoc OpenAPI (Swagger UI)

## 🛠️ Сборка и запуск

```bash
./mvnw spring-boot:run
