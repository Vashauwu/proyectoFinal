/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.controller;

import com.sistemaApp.web.entidad.Semestre;
import com.sistemaApp.web.entidad.Student;
import com.sistemaApp.web.service.GruposService;
import com.sistemaApp.web.service.SemestreService;
import com.sistemaApp.web.service.SemestreServiceImpl;
import com.sistemaApp.web.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author pc
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService service;
    @Autowired
    private SemestreService serviceSemestre;
    @Autowired
    private GruposService gruposService;

    @GetMapping("/")
    public String showDashboard() {

        return "dashboardAlumno";

    }

    @GetMapping({"/student"})
    public String listStudent(Model modl) {
        modl.addAttribute("allStudeents", service.getstudents());
        return "allStudents";

    }

    @GetMapping("/student/new")
    public String crearStudentForm(Model modl) {

//        SemestreServiceImpl servicioSemestre = new SemestreServiceImpl();
//
//        List<Semestre> semestreListado = servicioSemestre.getSemestresall();

        Student estudiante = new Student();
        modl.addAttribute("nuevoStudiante", estudiante);
        
        modl.addAttribute("gruposListado", gruposService.getGruposall());
        return "crear_Student";
    }

    @PostMapping("/student")
    public String saveStudent(@ModelAttribute("student") Student student) {
        service.saveStudent(student);
        return "redirect:/student";
    }

    @GetMapping("/student/edit/{id}")
    public String updateStudentForm(@PathVariable Long id, Model modl) {
        modl.addAttribute("student", service.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/student/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student) {
        Student studentActual = service.getStudentById(id);
        studentActual.setId(id);
        studentActual.setNombre(student.getNombre());
        studentActual.setApellido_paterno(student.getApellido_paterno());
        studentActual.setApellido_materno(student.getApellido_materno());
        studentActual.setMatricula(student.getMatricula());
        studentActual.setEmail(student.getEmail());
//        studentActual.setId_grupo(id);
//        studentActual.setId_semestre(id);

        service.updateStudent(studentActual);
        return "redirect:/student";
    }

    @GetMapping("/student/{id}")
    public String deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
        return "redirect:/student";
    }
}
