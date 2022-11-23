/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sistemaApp.web.repository;

import com.sistemaApp.web.entidad.Student;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pc
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable>{
    
}
