package com.web.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.repositories.IStudentRepository;
import com.web.services.IStudentService;

import model.Student;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentRepository studentRepository;

	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	public Student create(Student student) {
		return studentRepository.create(student);
	}

	public Student update(Student student) {
		return studentRepository.update(student);
	}

	public Optional<Student> findById(Integer id) {
		return studentRepository.findById(id);
	}

	public void delete(Integer id) {

		Optional<Student> studentOpt = studentRepository.findById(id);
		Student student = studentOpt.get();
		if (student != null) {
			studentRepository.delete(student);
		}
	}
}
