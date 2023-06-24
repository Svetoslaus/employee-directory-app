package com.example.personaldirectoryapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

//Requests
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;


    @GetMapping("/employee")
    public ResponseEntity<Employee> get(@RequestParam(value = "id") int id){

        //get emlpoyee from db by id
        Optional<Employee>employeeInDB = employeeRepository.findById(id);

        if(employeeInDB.isPresent()){
            return new ResponseEntity<Employee>(employeeInDB.get(), HttpStatus.OK);
        }

        return new ResponseEntity("No Employee found by id " + id, HttpStatus.NOT_FOUND);
    }


    @GetMapping("/employee/all")
    public ResponseEntity<Iterable<Employee>> getAll(){
        Iterable<Employee> allEmployeeInDB = employeeRepository.findAll();
        return new ResponseEntity<Iterable<Employee>>(allEmployeeInDB, HttpStatus.OK);
    }

    @PostMapping("/employee")
    public ResponseEntity<Employee> create(@RequestBody Employee newEmployee){
        //save employee in db
        employeeRepository.save(newEmployee);
        return new ResponseEntity<Employee>(newEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/employee")
    public ResponseEntity delete(@RequestParam(value = "id") int id){

        Optional<Employee> employeeInDB = employeeRepository.findById(id);
        if(employeeInDB.isPresent()){
            employeeRepository.deleteById(id);
            return new ResponseEntity("Employee deleted", HttpStatus.OK);
        }
        return new ResponseEntity("No Employee found by Id " + id, HttpStatus.NOT_FOUND);
    }

    @PutMapping("/employee")
    public ResponseEntity<Employee> edit(@RequestBody Employee editedEmployee){

        Optional<Employee> employeeInDB = employeeRepository.findById(editedEmployee.getId());

        if(employeeInDB.isPresent()){
            //update employee
            Employee saveEmployee = employeeRepository.save(editedEmployee);
            return new ResponseEntity<Employee>(saveEmployee, HttpStatus.OK);
        }

        return new ResponseEntity("No employee to update found by id " + editedEmployee.getId(), HttpStatus.NOT_FOUND);
    }


    @PatchMapping("/employee/setDone")
    public ResponseEntity<Employee> setDone(@RequestParam(value = "isDone") boolean isDone,
                                            @RequestParam(value = "id") int id){

        //find id in DB
        Optional<Employee> employeeInDB = employeeRepository.findById(id);

        if(employeeInDB.isPresent()){
            //update employee isDone
            employeeInDB.get().setIsDone(isDone);
            Employee saveEmployee = employeeRepository.save(employeeInDB.get());
            return new ResponseEntity<Employee>(saveEmployee, HttpStatus.OK);
        }
        return new ResponseEntity("No employee to update found by id " + id, HttpStatus.NOT_FOUND);
    }
}
