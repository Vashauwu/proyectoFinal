/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.controller;

import com.sistemaApp.web.entidad.Validacion;
import com.sistemaApp.web.service.ValidacionService;
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
public class ValidacionController {
    @Autowired
    private ValidacionService service;
    
    @GetMapping({"/validacion"})
    public String listValidacion(Model modl) {       
        modl.addAttribute("allValidacion", service.getValidacionAll());
        return "allValidacion";
    }
    
    @GetMapping("/validacion/new")
    public String crearValidacion(Model modl) {
        Validacion validacion = new Validacion();
        modl.addAttribute("nuevaValidacion", validacion);
        return "crear_Validacion";
    }

    @PostMapping("/validacion")
    public String saveValidacion(@ModelAttribute("validacion") Validacion validacion) {
        service.saveValidacion(validacion);
        return "redirect:/validacion";
    }

    @GetMapping("/validacion/edit/{id}")
    public String updateValidacionForm(@PathVariable Long id, Model modl) {
        modl.addAttribute("validacion", service.getValidacionById(id));
        return "edit_Validacion";
    }

    @PostMapping("/validacion/{id}")
    public String updateValidacion(@PathVariable Long id, @ModelAttribute("validacion") Validacion validacion) {
        Validacion validacionActual = service.getValidacionById(id);
        validacionActual.setId(id);
        validacionActual.setName(validacion.getName());
        service.updateValidacion(validacion);
        return "redirect:/validacion";
    }

    @GetMapping("/validacion/{id}")
    public String deleteValidacion(@PathVariable Long id) {
        service.deleteValidacion(id);
        return "redirect:/validacion";
    }
    
}
