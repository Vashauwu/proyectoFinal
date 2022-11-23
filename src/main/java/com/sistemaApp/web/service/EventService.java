/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sistemaApp.web.service;

import com.sistemaApp.web.entidad.Events;
import java.util.List;


/**
 *
 * @author pc
 */

public interface EventService {
    public List<Events> getEventsall();
    
    public Events createEvent(Events newEvent);
    
    public Events updateEvent(Events eventUpdate);
    
    public Events getEventById(Long id);
    
    public void deleteEvent(Long id);
    
    
}
