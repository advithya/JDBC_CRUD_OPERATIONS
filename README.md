
# JDBC CRUD Operations - Database Foundation Project

A comprehensive Java application demonstrating core **JDBC (Java Database Connectivity)** operations, implementing complete CRUD functionality using MySQL. This project showcases essential database programming skills that form the foundation for enterprise Java development.

## 🏗️ Project Overview

This console application implements fundamental database operations using raw JDBC API, providing a solid understanding of how Java applications interact with relational databases at the most basic level.

### Key Features
- **Database Table Management**: Dynamic table creation
- **Complete CRUD Operations**: Create, Read, Update functionality
- **Secure Database Access**: Parameterized queries using PreparedStatement
- **Resource Management**: Proper connection handling and cleanup
- **Exception Handling**: Robust error management for database operations

## 🛠️ Technical Stack

- **Java 8+**
- **JDBC API** (java.sql.*)
- **MySQL Database**
- **Maven** (Build Management)
- **Eclipse IDE**

## 📂 Project Architecture

```
src/main/java/com/vc/
├── CreateTable.java      # Database schema creation
├── InsertData.java       # Data creation operations
├── ReadAllData.java      # Bulk data retrieval
├── ReadOneRecord.java    # Single record retrieval
└── UpdateClass.java      # Data modification operations
```

## 🚀 Quick Start

### Prerequisites
- Java 8 or higher
- MySQL Server
- Maven

### Installation & Execution

1. **Clone the repository**
   ```bash
   git clone https://github.com/advithya/JDBC_CRUD_OPERATIONS.git
   ```

2. **Database Setup**
   ```sql
   CREATE DATABASE dboct25;
   ```

3. **Configure Database Connection**
   Update connection parameters in each Java class:
   ```java
   Connection con = DriverManager.getConnection(
       "jdbc:mysql://localhost:3306/dboct25", "your_username", "your_password");
   ```

4. **Run Operations (Execute in order)**
   - `CreateTable.java` - Creates the student table
   - `InsertData.java` - Inserts sample records
   - `ReadAllData.java` - Retrieves all records
   - `ReadOneRecord.java` - Fetches specific record
   - `UpdateClass.java` - Updates existing records

## 💻 Core Implementation

### Database Connection & Table Creation
```java
// Simplified connection establishment
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
Statement st = con.createStatement();
st.executeUpdate("CREATE TABLE student(id INT, name VARCHAR(50), course VARCHAR(50))");
```

### Secure Data Insertion with PreparedStatement
```java
PreparedStatement st = con.prepareStatement("INSERT INTO student VALUES(?, ?, ?)");
st.setInt(1, 101);
st.setString(2, "james");
st.setString(3, "java");
int affectedRows = st.executeUpdate();
```

### Parameterized Data Retrieval
```java
PreparedStatement st = con.prepareStatement("SELECT * FROM student WHERE id = ?");
st.setInt(1, 101);
ResultSet rs = st.executeQuery();
while(rs.next()) {
    System.out.println(rs.getInt(1) + "-" + rs.getString(2) + "-" + rs.getString(3));
}
```

## 🔧 Technical Highlights

### JDBC Concepts Demonstrated
- **Driver Management**: MySQL JDBC driver integration
- **Connection Lifecycle**: Proper connection establishment and cleanup
- **Statement Types**: Both Statement and PreparedStatement usage
- **ResultSet Handling**: Efficient data retrieval and processing
- **Exception Handling**: Comprehensive SQL exception management

### Security Implementation
- **Parameterized Queries**: Prevention of SQL injection attacks
- **Resource Cleanup**: Proper closure of database resources
- **Connection Security**: Secure credential management

## 🎯 Learning Objectives Achieved

- Understanding of JDBC architecture and components
- Hands-on experience with database connection management
- Implementation of secure database operations
- Mastery of CRUD operations using core Java
- Experience with Maven project structure and build processes

## 🌟 Why This Project Matters

This project demonstrates essential **database programming fundamentals** that form the critical foundation for:

- **Spring Framework** and **Spring Boot** applications
- **Hibernate ORM** and **JPA** implementations
- **Enterprise Java** development
- **Microservices** with database interactions

Understanding raw JDBC is crucial for debugging complex database issues, optimizing performance, and working with legacy systems in enterprise environments.

## 📈 Project Significance

While modern frameworks abstract database interactions, JDBC knowledge remains vital for:
- Performance tuning and understanding ORM framework behavior
- Legacy system maintenance and migration
- Custom database operations requiring low-level control
- Technical interviews focusing on fundamentals

---

**This project serves as a fundamental building block for enterprise Java development, demonstrating core database interaction skills essential for advanced framework mastery.**
```
