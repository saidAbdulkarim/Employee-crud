package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentsRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentsRepository studentsRepository;

	@Override
	public List<Student> getAllStudents() {
		
		return studentsRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		
		return studentsRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentsRepository.save(student);
	}

	@Override
	public Student getStudentById(Long Id) {

		return studentsRepository.findById(Id).get();
	}

	@Override
	public void deleteStudentById(Long Id) {
		
		 studentsRepository.deleteById(Id);
	}

}
