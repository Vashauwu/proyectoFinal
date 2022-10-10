/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.service;

import com.sistemaApp.web.entidad.Grupos;
import java.util.List;

/**
 *
 * @author pc
 */
public interface GruposService {
    public List<Grupos> getGruposall();
    
    public Grupos createEvent(Grupos newGrupo);
    
    public Grupos updateEvent(Grupos grupoUpdate);
    
    public Grupos getEventById(Long id);
    
    public void deleteGrupo(Long id);
}
