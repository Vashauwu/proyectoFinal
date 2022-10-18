/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sistemaApp.web.service;

import com.sistemaApp.web.entidad.Carrera;
import java.util.List;

/**
 *
 * @author pc
 */
public interface CarrerasService {
     public List<Carrera> getCarrerasall();
     
     public Carrera createCarrera(Carrera newCarrera);
     
     public Carrera updateEvent(Carrera carreraUpdate);
     
     public Carrera getCarreraById(Long id);
     
     public void deleteCarrera(Long id);
     
}
