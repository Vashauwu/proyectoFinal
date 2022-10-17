/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.controller;

import com.sistemaApp.web.entidad.ReglaPlanEstudio;
import com.sistemaApp.web.service.ReglaPlanEstudioService;
import com.sistemaApp.web.service.PlanEstudiosService;
import com.sistemaApp.web.service.ValidacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author hp
 */
@Controller
public class ReglaPlanEstudioController {

    @Autowired
    private ReglaPlanEstudioService service;
    @Autowired
    private ValidacionService validacionService;
    @Autowired
    private PlanEstudiosService planEstudiosService;

    @GetMapping({"/reglaPlanEstudio"})
    public String listReglaPlanEstudio(Model modl) {

        modl.addAttribute("allReglaaPlanEstudio", service.getReglaPlanEstudioall());
        return "allReglaPlanEstudio";
    }

    @GetMapping("/reglaPlanEstudio/new")
    public String crearReglaPlanEstudioForm(Model modl) {
        ReglaPlanEstudio RPlanEstudio = new ReglaPlanEstudio();
        modl.addAttribute("nuevoRPlanEstudio", RPlanEstudio);
        return "crear_ReglaPlanEstudio";
    }

    @PostMapping("/reglaPlanEstudio")
    public String saveEvent(@ModelAttribute("reglaPlanEstudio") ReglaPlanEstudio reglaPlanEstudio) {
        service.createReglaPlanEstudio(reglaPlanEstudio);
        return "redirect:/reglaPlanEstudio";
    }

    @GetMapping("/reglaPlanEstudio/edit/{id}")
    public String updatereglaplanEstudioForm(@PathVariable Long id, Model modl) {
        modl.addAttribute("reglaPlanEstudio", service.getReglaPlanEstudioById(id));
        return "edit_ReglaPlanEstudio";
    }

    @PostMapping("/reglaPlanEstudio/{id}")
    public String updateEventreglaplanEstudio(@PathVariable Long id, @ModelAttribute("reglaPlanEstudio") ReglaPlanEstudio reglaPlanEstudio) {
        ReglaPlanEstudio ReglaPlanEActual = service.getReglaPlanEstudioById(id);
        ReglaPlanEActual.setId(id);
        ReglaPlanEActual.setAcademico(reglaPlanEstudio.getAcademico());
        ReglaPlanEActual.setCultural(reglaPlanEstudio.getCultural());
        ReglaPlanEActual.setDeportivo(reglaPlanEstudio.getDeportivo());

        service.updateReglaPlanEstudio(ReglaPlanEActual);
        return "redirect:/reglaPlanEstudio";
    }

    @GetMapping("/reglaPlanEstudio/{id}")
    public String deleteReglaPlanEActual(@PathVariable Long id) {
        service.deleteReglaPlanEstudio(id);
        return "redirect:/reglaPlanEstudio";
    }

}
