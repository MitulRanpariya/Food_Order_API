# 🍽️ Food Order API

A **Spring Boot**-based **REST API** for an online food ordering system with authentication and authorization using **Spring Security**.

---

## 🚀 Features

✅ User authentication using **JWT**\
✅ Role-based access control (**Admin, Restaurant Owner, Customer**)\
✅ Manage **restaurants, menus, and orders**\
✅ Secure **endpoints with Spring Security**\
✅ Database integration with **MySQL**

---

## 🛠️ Tech Stack

- **Java 17+**
- **Spring Boot 3+**
- **Spring Security & JWT**
- **Hibernate & JPA**
- **MySQL**
- **Maven**

---

## 📌 API Endpoints

### Authentication (Public)

| Method | Endpoint         | Description                         |
| ------ | ---------------- | ----------------------------------- |
| `POST` | `/auth/register` | Register a new user                 |
| `POST` | `/auth/login`    | Authenticate user and get JWT token |

### Restaurant Management (Admin & Restaurant Owner)

| Method   | Endpoint                     | Description          |
| -------- | ---------------------------- | -------------------- |
| `POST`   | `/api/admin/restaurant`      | Add new restaurant   |
| `GET`    | `/api/admin/restaurant/{id}` | Get restaurant by ID |
| `PUT`    | `/api/admin/restaurant/{id}` | Update restaurant    |
| `DELETE` | `/api/admin/restaurant/{id}` | Delete restaurant    |

### Menu Management (Restaurant Owner)

| Method   | Endpoint               | Description         |
| -------- | ---------------------- | ------------------- |
| `POST`   | `/api/admin/menu`      | Add menu item       |
| `GET`    | `/api/menu/{id}`       | Get menu item by ID |
| `PUT`    | `/api/admin/menu/{id}` | Update menu item    |
| `DELETE` | `/api/admin/menu/{id}` | Delete menu item    |

### Order Management (Customer)

| Method | Endpoint                   | Description              |
| ------ | -------------------------- | ------------------------ |
| `POST` | `/api/order`               | Place an order           |
| `GET`  | `/api/order/{id}`          | Get order details        |
| `GET`  | `/api/order/user/{userId}` | Get all orders of a user |

---

## 🔐 Security & Authentication

This API uses **Spring Security with JWT** for authentication.

### How to Authenticate:

1️⃣ Register/Login to get a **JWT token**\
2️⃣ Include the token in **Authorization header**:

```
Authorization: Bearer <your-token>
```

3️⃣ Access protected endpoints

---

## 🏢 Installation & Setup

### 1️⃣ Clone the Repository

```sh
git clone https://github.com/MitulRanpariya/Food_Order_API.git
cd Food_Order_API
```

### 2️⃣ Configure Database

Update `application.properties` (for MySQL):

```properties
spring.datasource.url=jdbc:mysql://{database-name}
spring.datasource.username=root
spring.datasource.password={password}
spring.jpa.hibernate.ddl-auto=update
```

### 3️⃣ Build & Run

```sh
mvn clean install
mvn spring-boot:run
```

🚀 **API runs at** `http://localhost:8080/`

---

## 📌 Contributing

Contributions are welcome! Feel free to **fork**, create a **pull request**, or open an **issue**.

---

## 🐝 License

This project is licensed under **MIT License**.

