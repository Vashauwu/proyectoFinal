/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.controller;
import com.sistemaApp.web.entidad.Carrera;
import com.sistemaApp.web.service.CarrerasService;
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
public class CarreraController {
    @Autowired
    private CarrerasService service;
    

    @GetMapping({"/Carreras"})
    public String listCarrera(Model modl) {

        modl.addAttribute("allCarrera", service.getCarrerasall());
        return "allCarrera";
    }

    @GetMapping("/Carreras/new")
    public String crearCarreras(Model modl) {
        Carrera NCarreras = new Carrera();
        modl.addAttribute("nuevaCarrera", NCarreras);
        return "crear_Carrera";
    }

    @PostMapping("/Carreras")
    public String saveCarreras(@ModelAttribute("Carreras") Carrera Carreras) {
        service.createCarrera(Carreras);
        return "redirect:/Carreras";
    }

    @GetMapping("/Carreras/edit/{id}")
    public String updateCarrerasForm(@PathVariable Long id, Model modl) {
        modl.addAttribute("Carreras", service.getCarreraById(id));
        return "edit_Carreras";
    }

    @PostMapping("/Carreras/{id}")
    public String updateCarrera(@PathVariable Long id, @ModelAttribute("Carreras") Carrera Carreras) {
        Carrera CarreraEActual = service.getCarreraById(id);
        CarreraEActual.setId(id);
        CarreraEActual.setNombre(Carreras.getNombre());
       

        service.updateEvent(CarreraEActual);
        return "redirect:/Carreras";
    }

    @GetMapping("/Carreras/{id}")
    public String deleteReglaPlanEActual(@PathVariable Long id) {
        service.deleteCarrera(id);
        return "redirect:/Carreras";
    }
}
