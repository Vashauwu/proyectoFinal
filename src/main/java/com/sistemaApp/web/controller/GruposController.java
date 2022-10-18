/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.controller;

import com.sistemaApp.web.entidad.Grupos;
import com.sistemaApp.web.entidad.Semestre;
import com.sistemaApp.web.service.GruposService;
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
public class GruposController {

    @Autowired
    private GruposService service;

    @GetMapping({"/grupos"})
    public String listReglaPlanEstudio(Model modl) {

        modl.addAttribute("allGrupo", service.getGruposall());
        return "allGrupos";
    }

    @GetMapping("/grupos/new")
    public String crearSemestreActualForm(Model modl) {
        Grupos gruposCrear = new Grupos();
        modl.addAttribute("nuevoSemestre", gruposCrear);
        return "crear_Grupo";
    }

    @PostMapping("/grupos")
    public String saveSemestre(@ModelAttribute("grupoSave") Grupos grupo) {
        service.createGrupo(grupo);
        return "redirect:/grupos";
    }

    @GetMapping("/grupos/edit/{id}")
    public String updateSemestreActualForm(@PathVariable Long id, Model modl) {
        modl.addAttribute("grupoUpdate", service.getGrupoById(id));
        return "edit_Grupo";
    }

    @PostMapping("/grupos/{id}")
    public String updateSemestre(@PathVariable Long id, @ModelAttribute("grupos") Grupos grupo) {

        grupo.setId(id);
        grupo.setNombre(grupo.getNombre());
        grupo.setId_plan_estudios(grupo.getId_plan_estudios());

        service.updateGrupo(grupo);
        return "redirect:/grupos";
    }

    @GetMapping("/grupos/{id}")
    public String deleteSemestre(@PathVariable Long id) {
        service.deleteGrupo(id);
        return "redirect:/grupos";
    }
}
