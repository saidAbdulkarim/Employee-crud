package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentsRepository;

@SpringBootApplication
public class Demo3Application /*implements CommandLineRunner*/ {
	
	@Autowired
	StudentsRepository studentsRepository;

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		Student student1 = new Student("said", "said", "said378157@gmail.com");
//		studentsRepository.save(student1);
//		Student student2 = new Student("said", "said", "saidsaid27021997@gmail.com");
//		studentsRepository.save(student2);
//		Student student3 = new Student("said", "said", "said21997@outlook.com");
//		studentsRepository.save(student3);
//	}

}
