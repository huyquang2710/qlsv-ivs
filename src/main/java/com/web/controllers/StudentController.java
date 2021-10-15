package com.web.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.services.IStudentService;

import model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private IStudentService studentService;

	// findAll
	@GetMapping
	public String getAll(Student student, Model model) {
		List<Student> studentList = studentService.findAll();

		model.addAttribute("student", studentList);

		return "student";
	}

	// get add student
	@GetMapping("/add")
	public String create() {

		return "add-student";
	}

	// post add student
	@PostMapping("/add")
	public String create(@ModelAttribute("student") Student student) {

		student = studentService.create(student);

		return "redirect:/student";
	}

	// get update student
	@GetMapping("/update/{id}")
	public String update(@PathVariable("id") Integer id, Model model) {
		Optional<Student> optionals = studentService.findById(id);
		Student student = optionals.get();

		model.addAttribute("student", student);

		return "update-student";
	}

	// post update student
	@PostMapping("/update")
	public String update(@ModelAttribute("student") Student student) {

		student = studentService.update(student);

		return "redirect:/student";
	}

	// get delete
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id) {

		studentService.delete(id);

		return "redirect:/student";
	}
	
}
