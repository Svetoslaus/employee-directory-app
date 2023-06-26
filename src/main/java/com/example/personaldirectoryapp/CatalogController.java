package com.example.personaldirectoryapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class CatalogController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping("/catalog")
    public List<Catalog> findAll(){
        return catalogService.findAll();
    }

    @GetMapping("/catalog/{id}")
    public Optional<Catalog> findById(@PathVariable("id") Integer id){
        return catalogService.findById(id);
    }

    @GetMapping("/catalog/{id}/employees")
    public List<Employee> getEmployeesByCatalog(@PathVariable("id") Integer id){
        return catalogService.getEmployeesByCatalog(id);

    }

}
