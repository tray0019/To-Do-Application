# To-Do-Application

A simple task manager that allows users to add, toggle, and delete tasks.

![Java](https://img.shields.io/badge/Java-21-blue)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.2.4-brightgreen)
![MySQL](https://img.shields.io/badge/Database-MySQL-orange)
![Lombok](https://img.shields.io/badge/Lombok-Enabled-yellow)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-Template_Engine-lightgreen)
![Bootstrap](https://img.shields.io/badge/Bootstrap-5-blueviolet)
![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ_IDEA-purple)
![GitHub](https://img.shields.io/badge/Version_Control-GitHub-black)

## Technologies and Tools
- Spring Boot
- JPA(Hibernate) + MySQL
- LOMBOK
- IntelliJ
- Thymeleaf + Bootstrap CSS

## Steps Taken
1. Created a Spring Boot project using start.spring.io with necessary dependencies.
2. Created a todo-app schema in MySQL Workbench.
3. Configured database connection in application.properties (Spring datasource, username, password, etc.).
4. Created TaskRepository interface extending JpaRepository.
5. Created TaskService with @Service annotation. Implemented getAllTasks() method.
6. Created TaskController with @Controller annotation.
7. Added methods using @GetMapping to retrieve tasks and pass them to the view.
8. Created tasks.html using Thymeleaf. Added a th:each loop to display tasks from the database.
9. Added createTask() method in TaskController with @PostMapping and corresponding TaskService method.
10. Implemented deleteTask() and toggleTask() methods in both controller and service.
11. Used Bootstrap CSS for a responsive and clean UI.

