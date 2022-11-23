/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sistemaApp.web.service;

import com.sistemaApp.web.entidad.Turno;
import java.util.List;

/**
 *
 * @author Sergio Merino
 */
public interface TurnoService {
    public  List<Turno> getTurnoAll();
    
    public Turno SaveTurno(Turno turnoNuevo);
    
    public Turno getTurnoById(Long id);
    
    public Turno updateTurno(Turno turno);
    
    public void deleteTurno(Long id);
}
