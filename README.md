# Employee-Management-Service
The point of this development was to keep up with Java Spring Boot environment 
and practice designing a microservice while developing an actual service with somewhat business logic behind.

Obviously, there's no intention to use this service for the actual business needs, but who knows...

Right now, I just want to get better understanding around Spring Boot tools and development environment.

The task generated by ChatGPT:

> Q: I want to practice my backend programming skills. I need a sample task to execute. That should include API development, database access, and some business logic implementation. Make the task realistic.

## Task: Employee Management System
**Objective:**
Develop a backend service for an Employee Management System (EMS) that allows for creating, reading, updating, and deleting (CRUD) employee records. Additionally, implement a feature to calculate the total salary expense for a department and provide a report.

### Requirements:
    
- **1. API Development Endpoints:**
   - `POST /employees`: Create a new employee record.
   - `GET /employees/{id}`: Retrieve details of an employee by their ID.
   - `PUT /employees/{id}`: Update details of an existing employee.
   - `DELETE /employees/{id}`: Delete an employee record.
   - `GET /departments/{id}/salary-expense`: Calculate the total salary expense for a department.
   - `GET /departments/{id}/report`: Generate a report listing all employees in a department with their respective salaries.

- **2. Database Schema Tables:**
  - `employees`:
    - `id`: Primary key, unique identifier for each employee.
    - `first_name`: String, first name of the employee.
    - `last_name`: String, last name of the employee.
    - `email`: String, email of the employee (unique).
    - `salary`: Decimal, employee’s salary.
    - `department_id`: Foreign key, references the departments table.
  - `departments`:
    - `id`: Primary key, unique identifier for each department.
    - `name`: String, name of the department.
    - `budget`: Decimal, the budget allocated to the department.
- **3. Business Logic:**
   - **Salary Expense Calculation:**
     - Implement logic to sum up all employee salaries within a department when accessing the /departments/{id}/salary-expense endpoint.
   - **Department Budget Check:**
     - When creating or updating an employee, check if the total salary of all employees in the department exceeds the department's budget. If it does, the operation should be rejected with an appropriate error message.
   - **Employee Report Generation:**
     - The `/departments/{id}/report` endpoint should return a list of employees within the specified department, including their id, first_name, last_name, and salary. The report should be sorted by last_name.

### Additional Considerations:
- **Authentication & Authorization:** Add basic authentication to the API. Ensure that only authorized users can create, update, or delete employee records.
- **Error Handling:** Implement robust error handling, including cases where an employee or department is not found, invalid data is provided, or operations fail due to business logic constraints.
- **Unit Tests:** Write unit tests to validate the API endpoints, database interactions, and business logic.
   
### Technology Stack:
- **Programming Language:** Java (Spring Boot)
- **Database:** PostgreSQL or MySQL
- **Tools:** Maven or Gradle for dependency management, JUnit for testing, Postman for API testing.

---
This task covers a broad range of backend skills, from API design to database interaction and business logic implementation. 
It's complex enough to simulate real-world scenarios while still being manageable within a reasonable time frame.