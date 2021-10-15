package com.web.repositories.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.web.repositories.AbstractRepository;
import com.web.repositories.IStudentRepository;

import model.Student;

@Repository
public class StudentRepositoryImpl extends AbstractRepository<Student> implements IStudentRepository {

	public List<Student> findAll() {
		return super.findAll(Student.class);
	}

	public Optional<Student> findById(Integer id) {
		return super.findById(Student.class, id);
	}

}
