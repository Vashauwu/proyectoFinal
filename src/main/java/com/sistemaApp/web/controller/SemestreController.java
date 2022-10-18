/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.controller;

import com.sistemaApp.web.entidad.Semestre;
import com.sistemaApp.web.service.SemestreService;
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
public class SemestreController {

    @Autowired
    private SemestreService service;

    @GetMapping({"/semestre"})
    public String listReglaPlanEstudio(Model modl) {

        modl.addAttribute("allSemestres", service.getSemestresall());
        return "allSemestre";
    }

    @GetMapping("/semestre/new")
    public String crearSemestreActualForm(Model modl) {
        Semestre semestreCrear = new Semestre();
        modl.addAttribute("nuevoSemestre", semestreCrear);
        return "crear_Semestre";
    }

    @PostMapping("/semestre")
    public String saveSemestre(@ModelAttribute("semestreSave") Semestre semestre) {
        service.createSemestre(semestre);
        return "redirect:/semestre";
    }

    @GetMapping("/semestre/edit/{id}")
    public String updateSemestreActualForm(@PathVariable Long id, Model modl) {
        modl.addAttribute("semestreActual", service.getSemestreById(id));
        return "edit_Semestre";
    }

    @PostMapping("/semestre/{id}")
    public String updateSemestre(@PathVariable Long id, @ModelAttribute("semestre") Semestre semestre) {

        semestre.setId(id);
        semestre.setNombre(semestre.getNombre());
        semestre.setId_semestreActual(semestre.getId_semestreActual());
        semestre.setId_grupos(semestre.getId_grupos());

        service.updateSemestre(semestre);
        return "redirect:/semestre";
    }

    @GetMapping("/semestre/{id}")
    public String deleteSemestre(@PathVariable Long id) {
        service.deleteSemestre(id);
        return "redirect:/semestre";
    }
}
