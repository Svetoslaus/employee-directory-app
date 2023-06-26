package com.example.personaldirectoryapp;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CatalogRepository extends CrudRepository<Catalog,Integer> {

    @Query("select employees from Catalog c where c.id = ?1")
    List<Employee> getEmployeesByCatalog(Integer id);
}
