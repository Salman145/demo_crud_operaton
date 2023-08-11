package com.demo.crudop;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.crudop.entities.Student1;
import com.demo.crudop.repositories.StudentRepository;

@SpringBootTest
class DemoCrudOperatonApplicationTests {
  
	@Autowired
	StudentRepository studentRepo;
	
	@Test
    void insertStudentRecord() {	
		//Student student = new Student();
		//student.setSname("pankaj");
		//student.setScourse("Full Stack");
		//student.setSfee(1000);
		//studentRepo.save(student);
	}

	@Test
	public void fetchAllRecords() {
		Iterable<Student1> student = studentRepo.findAll();
		System.out.println(student);
	}
}