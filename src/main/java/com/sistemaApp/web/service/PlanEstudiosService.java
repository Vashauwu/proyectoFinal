/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sistemaApp.web.service;

import com.sistemaApp.web.entidad.PlanEstudios;
import java.util.List;

/**
 *
 * @author pc
 */
public interface PlanEstudiosService {
    public List<PlanEstudios> getPlanEstudiosall();
    
    public PlanEstudios createEvent(PlanEstudios newPlanEstudios);
    
    public PlanEstudios updateEvent(PlanEstudios planEstudioUpdate);
    
    public PlanEstudios getPlanEstudiosById(Long id);
    
    public void deletePlanEstudios(Long id);
}
