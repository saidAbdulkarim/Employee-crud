package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Student;
import com.example.demo.serviceImpl.StudentServiceImpl;

@Controller
public class StudentController {
	
	@GetMapping("/stud")
    public String index( ){
        
        return "index";
    }

	@Autowired
	StudentServiceImpl studentServiceImpl;

	@GetMapping("/students")
	public String listStudents(Model model) {

		model.addAttribute("studentsList", studentServiceImpl.getAllStudents());

		return "student";
	}

	@GetMapping("/students/new")
	public String createStudentsForm(Model model) {
        
		Student student = new Student();
		model.addAttribute("student", student);

		return "create-student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
       
		studentServiceImpl.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentsForm(@PathVariable Long id, Model model) {
        
		model.addAttribute("student", studentServiceImpl.getStudentById(id));

		return "edit-student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@ModelAttribute("student") Student student, @PathVariable Long id) {
       // get student from database by id
		Student existingStudent = studentServiceImpl.getStudentById(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		studentServiceImpl.updateStudent(existingStudent);
		return "redirect:/students";
	}
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
       
		studentServiceImpl.deleteStudentById(id);
		return "redirect:/students";
	}
}
