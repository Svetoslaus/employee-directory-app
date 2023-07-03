package com.example.personaldirectoryapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    @Query("SELECT p FROM Employee p WHERE " +
            "p.skill LIKE CONCAT('%',:query, '%')")
    List<Employee> searchSkills(String query);

}
