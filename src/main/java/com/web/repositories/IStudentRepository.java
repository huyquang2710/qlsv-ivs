package com.web.repositories;

import java.util.List;
import java.util.Optional;

import model.Student;

public interface IStudentRepository {
	List<Student> findAll();
	Optional<Student> findById(Integer id);
	Student create(Student student);
	Student update(Student student);
	Student delete(Student student);
}
