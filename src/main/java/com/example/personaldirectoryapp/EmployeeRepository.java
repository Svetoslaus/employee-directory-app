package com.example.personaldirectoryapp;

import org.springframework.data.repository.CrudRepository;


//Verbindung mit dem DB
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
}
