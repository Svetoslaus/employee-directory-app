package com.example.personaldirectoryapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesServiceImplementation implements EmployeeService{


    private EmployeeRepository employeeRepository;


    public EmployeesServiceImplementation(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }


    @Override
    public List<Employee> searchSkills(String query) {
        return employeeRepository.searchSkills(query);
    }





    public List<Employee> listAll() {
        return employeeRepository.findAll();
    }



    public Employee get(long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployeeById(Long id){
        employeeRepository.deleteById(id);
    }




}