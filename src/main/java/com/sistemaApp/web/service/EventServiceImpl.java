/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.service;

import com.sistemaApp.web.entidad.Events;
import com.sistemaApp.web.repository.EventsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pc
 */
@Service
public class EventServiceImpl implements EventService{
        
    @Autowired
    private EventsRepository eventRepository;
    
    @Override
    public List<Events> getEventsall() {
        return eventRepository.findAll();
    }

    @Override
    public Events createEvent(Events newEvent) {
       return eventRepository.saveAndFlush(newEvent);
    }

    @Override
    public Events updateEvent(Events eventUpdate) {
       return eventRepository.save(eventUpdate);
    }

    @Override
    public Events getEventById(Long id) {
       return eventRepository.findById(id).get();
    }

    @Override
    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }
    
}
