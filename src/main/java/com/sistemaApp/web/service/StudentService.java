/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.service;

import com.sistemaApp.web.entidad.Student;
import java.util.List;

/**
 *
 * @author pc
 */


public interface StudentService {
    public List<Student> getstudents();
    
    public Student saveStudent(Student estudianteNuevo);
    
    public Student getStudentById(Long id);
    
    public Student updateStudent(Student student);
    
    public void deleteStudent(Long id);
    
}
