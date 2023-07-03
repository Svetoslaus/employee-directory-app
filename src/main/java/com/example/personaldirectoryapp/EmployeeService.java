package com.example.personaldirectoryapp;

import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();



    List<Employee> searchSkills(String query);



    Employee saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    Employee updateEmployee(Employee employee);

    void deleteEmployeeById(Long id);


}
