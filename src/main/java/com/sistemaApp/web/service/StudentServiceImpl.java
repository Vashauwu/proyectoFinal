/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.service;

import com.sistemaApp.web.entidad.Student;
import com.sistemaApp.web.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pc
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public List<Student> getstudents() {
        return repository.findAll();
    }

	@Override
	public Student saveStudent(Student estudianteNuevo) {
		
		return repository.saveAndFlush(estudianteNuevo);
	}

	@Override
	public Student getStudentById(Long id) {
	
		return repository.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return repository.save(student);
	}

	@Override
	public void deleteStudent(Long id) {
		repository.deleteById(id);
		
	}

}
