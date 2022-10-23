/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.controller;

import com.sistemaApp.web.entidad.SemestreActual;
import com.sistemaApp.web.service.SemestreActualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author hp
 */
@Controller
public class SemestreActualController {
    @Autowired
    private SemestreActualService service;
    
     @GetMapping({"/semestreActual"})
    public String listSemestreActual(Model modl) {
       
        modl.addAttribute("allSemestreActual", service.getSemestreActualAll());
        return "allSemestreActual";
    }
    
    @GetMapping("/semestreActual/new")
    public String crearSemestreActualForm(Model modl) {
        SemestreActual semestreCrear = new SemestreActual();
        modl.addAttribute("nuevoSemestreActual", semestreCrear);
        return "crear_SemestreActual";
    }
    @PostMapping("/semestreActual")
    public String saveSemestreActual(@ModelAttribute("reglaPlanEstudio") SemestreActual semestreActual) {
        service.createSemestreActual(semestreActual);
        return "redirect:/semestreActual";
    }
    @GetMapping("/semestreActual/edit/{id}")
    public String updateSemestreActualForm(@PathVariable Long id, Model modl) {
        modl.addAttribute("semestreActual", service.getSemestreActualById(id));
        return "edit_SemestreActual";
    }

    @PostMapping("/semestreActual/{id}")
    public String updateSemestreActual(@PathVariable Long id, @ModelAttribute("semestreActual") SemestreActual semestreActual) {
        
        semestreActual.setId(id);
        semestreActual.setNombre(semestreActual.getNombre());
        semestreActual.setActivo(semestreActual.getActivo());
        semestreActual.setFecha_inicio(semestreActual.getFecha_inicio());
        semestreActual.setFecha_fin(semestreActual.getFecha_fin());
        
        

        service.updateSemestreActual(semestreActual);
        return "redirect:/semestreActual";
    }

    @GetMapping("/semestreActual/{id}")
    public String deleteReglaPlanEActual(@PathVariable Long id) {
        service.deleteSemestreActual(id);
        return "redirect:/semestreActual";
    }
}
