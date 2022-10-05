/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.controller;

/**
 *
 * @author pc
 */
import com.sistemaApp.web.entidad.Events;
import com.sistemaApp.web.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EventoController {

    @Autowired
    private EventService service;

    @GetMapping({"/events"})
    public String listEvents(Model modl) {
        modl.addAttribute("allEvents", service.getEventsall());
        return "allEvents";
    }

    @GetMapping("/events/newEvent")
    public String crearEventForm(Model modl) {
        Events evento = new Events();
        modl.addAttribute("nuevoEvento", evento);
        return "crear_Evento";
    }

    @PostMapping("/eventSave")
    public String saveEvent(@ModelAttribute("event") Events events) {
        service.createEvent(events);
        return "redirect:/events";
    }

    @GetMapping("/event/edit/{id}")
    public String updateEventForm(@PathVariable Long id, Model modl) {
        modl.addAttribute("event", service.getEventById(id));
        return "edit_EventForm";
    }

    @PostMapping("/event/{id}")
    public String updateEvent(@PathVariable Long id, @ModelAttribute("event") Events event) {
        Events eventActual = service.getEventById(id);
        eventActual.setId(id);
        eventActual.setName(event.getName());
        eventActual.setDate(event.getDate());
        eventActual.setHoras(event.getHoras());
        eventActual.setId_plan_estudios(event.getId_plan_estudios());
        event.setId_validacion(event.getId_validacion());
        
        
        service.updateEvent(eventActual);
        return "redirect:/events";
    }

    @GetMapping("/event/{id}")
    public String deleteEvent(@PathVariable Long id) {
        service.deleteEvent(id);
        return "redirect:/events";
    }
}
