/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.controller;
import com.sistemaApp.web.entidad.PlanEstudios;
import com.sistemaApp.web.service.PlanEstudiosService;
import com.sistemaApp.web.service.CarrerasService;
import com.sistemaApp.web.service.ReglaPlanEstudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class PlanEstudiosController {
     @Autowired
    private PlanEstudiosService service;
    @Autowired
    private ReglaPlanEstudioService ReglaplanEstudiosService;
    @Autowired
    private CarrerasService CarrerasService;
    
     @GetMapping({"/planEstudios"})
    public String listPlanEstudios(Model modl) {
        modl.addAttribute("allReglaPlanEstudio", ReglaplanEstudiosService.getReglaPlanEstudioall());
        modl.addAttribute("allCarreras", CarrerasService.getCarrerasall());
        modl.addAttribute("allPlanEstudios", service.getPlanEstudiosall());
        return "allPlanEstudios";
    }
    
    @GetMapping("/planEstudios/newplanEstudios")
    public String crearPlanEstudiosForm(Model modl) {
        PlanEstudios PEstudios = new PlanEstudios();
        modl.addAttribute("allReglaPlanEstudio", ReglaplanEstudiosService.getReglaPlanEstudioall());
        modl.addAttribute("allCarreras", CarrerasService.getCarrerasall());
        modl.addAttribute("nuevoPlanEstudio", PEstudios);
        return "crear_PlanEstudios";
    }
    
      @PostMapping("/planEstudioSave")
    public String savePlanEstudio(@ModelAttribute("planEstudio") PlanEstudios planEstudios) {
        service.createPlanEstudio(planEstudios);
        return "redirect:/planEstudios";
    }
    
    @GetMapping("/planEstudio/edit/{id}")
    public String updatePlanEstudioForm(@PathVariable Long id, Model modl) {
        modl.addAttribute("planEstudio", service.getPlanEstudiosById(id));
        return "edit_planEstudioForm";
    }
@PostMapping("/planEstudio/{id}")
    public String updatePlanEstudio(@PathVariable Long id, @ModelAttribute("planEstudio") PlanEstudios planEstudio) {
        PlanEstudios PlanEtActual = service.getPlanEstudiosById(id);
        PlanEtActual.setId(id);
         PlanEtActual.setNombre(planEstudio.getNombre());
        PlanEtActual.setId_carrera(planEstudio.getId_carrera());
        PlanEtActual.setId_regla_plan_estudio(planEstudio.getId_regla_plan_estudio());
      
        service.updatePlanEstudio(PlanEtActual);
        return "redirect:/planEstudios";
    }
    @GetMapping("/planEstudio/{id}")
    public String deletePlanEstudios(@PathVariable Long id) {
        service.deletePlanEstudios(id);
        return "redirect:/planEstudios";
    }
}
