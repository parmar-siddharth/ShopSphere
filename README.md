# ShopSphere – E-Commerce Platform

ShopSphere is a full-stack e-commerce web application built using **React.js** and **Spring Boot**. It provides a shopping interface for browsing products, exploring categories, managing a cart, and placing demo orders.

## Screenshots

### Homepage
![ShopSphere Homepage](images/homepage.png)

### Product Listing
![Product Listing](images/product.png)

### Shopping Cart
![Shopping Cart](images/cart.png)

### User Registration
![User Registration](images/register.png)

## Features

- Browse products and product categories
- Search and view product details
- Add products to a shopping cart
- Checkout and place demo orders
- User registration and login
- View order information
- Admin dashboard for managing store data

*Features depend on the current application configuration.*

## Tech Stack

**Frontend**
- React.js
- React Router
- Axios
- Bootstrap
- Vite

**Backend**
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven

**Database**
- MySQL

**Tools**
- IntelliJ IDEA
- Git and GitHub
- MySQL Workbench

## Project Structure

```text
ShopSphere/
├── backend/       # Spring Boot application
├── frontend/      # React application
├── database/      # SQL schema and sample data
├── images/        # Application screenshots
├── .gitignore
└── README.md
```

## Getting Started

### Prerequisites

Install the following before running the project:

- Java JDK compatible with the backend configuration
- Maven (or use the included Maven Wrapper)
- Node.js and npm
- MySQL Server

### 1. Clone the repository

```bash
git clone https://github.com/parmar-siddharth/ShopSphere.git
cd ShopSphere
```

### 2. Set up the database

1. Start MySQL Server.
2. Open the SQL script in the `database/` directory.
3. Execute the script in MySQL Workbench or your preferred MySQL client.
4. Configure the database URL, username, and password in the backend's `application.properties`.

**Important:** Use your own local database credentials. Never commit real passwords or secrets to GitHub.

### 3. Run the backend

Open a terminal in the `backend/` directory and run:

```bash
./mvnw spring-boot:run
```

On Windows Command Prompt, use:

```bat
mvnw.cmd spring-boot:run
```

If the Maven Wrapper is unavailable, use `mvn spring-boot:run` after installing Maven.

### 4. Run the frontend

Open another terminal:

```bash
cd frontend
npm install
npm run dev
```

Open the local URL printed by Vite in your terminal.

## Notes

- This project is intended for learning and demonstration purposes.
- Checkout uses demo payment functionality; no real payment is processed.
- Make sure the database configuration and backend API URL match your local setup.

## Author

**Siddharth Parmar**

GitHub: [parmar-siddharth](https://github.com/parmar-siddharth)
