package com.demo.crudop.repositories;

import org.springframework.data.repository.CrudRepository;

import com.demo.crudop.entities.Student1;


public interface StudentRepository extends CrudRepository<Student1, Long> {

}
