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

1. **Создайте базу данных и пользователя в PostgreSQL**, затем укажите свои данные подключения в файле `src/main/resources/application.properties`:

    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/expense_db
    spring.datasource.username=ваш_пользователь
    spring.datasource.password=ваш_пароль

    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    spring.jpa.properties.hibernate.format_sql=true
    ```

2. **Соберите проект:**

    ```bash
    ./mvnw clean package -DskipTests
    ```

3. **Запустите приложение:**

    ```bash
    java -jar target/expense-0.0.1-SNAPSHOT.jar
    ```

    > 💡 *Альтернатива для запуска напрямую из исходников во время разработки:*

    ```bash
    ./mvnw spring-boot:run
    ```

---
