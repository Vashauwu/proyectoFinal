/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.controller;

import com.sistemaApp.web.entidad.Turno;
import com.sistemaApp.web.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Sergio Merino
 */

@Controller
public class TurnoController {
    @Autowired
    private TurnoService service;
    
    @GetMapping({"/turno"})
    public String listTurno(Model modl) {
        modl.addAttribute("allTurno", service.getTurnoAll());
        return "allTurno";
    }
    
    @GetMapping("/turno/new")
    public String crearTurno(Model modl) {
        Turno turno = new Turno();
        modl.addAttribute("nuevoTurno", turno);
        return "crear_Turno";
    }

    @PostMapping("/turno")
    public String saveTurno(@ModelAttribute("turno") Turno turno) {
        service.SaveTurno(turno);
        return "redirect:/turno";
    }

    @GetMapping("/turno/edit/{id}")
    public String updateTurnoForm(@PathVariable Long id, Model modl) {
        modl.addAttribute("turno", service.getTurnoById(id));
        return "edit_Turno";
    }

    @PostMapping("/turno/{id}")
    public String updateTurno(@PathVariable Long id, @ModelAttribute("turno") Turno turno) {
        Turno turnoActual = service.getTurnoById(id);
        turnoActual.setId(id);
        turnoActual.setNombre(turno.getNombre());
        service.updateTurno(turno);
        return "redirect:/turno";
    }

    @GetMapping("/turno/{id}")
    public String deleteTurno(@PathVariable Long id) {
        service.deleteTurno(id);
        return "redirect:/turno";
    }
}
