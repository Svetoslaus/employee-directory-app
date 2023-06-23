package com.example.personaldirectoryapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//Anfragen bekommen
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;


    @GetMapping("/employee")
    public ResponseEntity<Employee> get(@RequestParam(value = "id") int id){

        Employee newEmployee = new Employee();
        newEmployee.setId(10);
        newEmployee.setDescription("Web-designer");
        newEmployee.setIsDone(true);

        return new ResponseEntity<Employee>(newEmployee, HttpStatus.OK);
    }


    @PostMapping("/employee")
    public ResponseEntity<Employee> create(@RequestBody Employee newEmployee){
        //save employee in db
        employeeRepository.save(newEmployee);
        return new ResponseEntity<Employee>(newEmployee, HttpStatus.OK);
    }
}
