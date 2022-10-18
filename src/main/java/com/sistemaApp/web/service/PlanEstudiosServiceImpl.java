/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.service;

import com.sistemaApp.web.entidad.PlanEstudios;
import com.sistemaApp.web.repository.PlanEstudiosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pc
 */

@Service
public class PlanEstudiosServiceImpl implements PlanEstudiosService{

    @Autowired
    private PlanEstudiosRepository repository;
    
    @Override
    public List<PlanEstudios> getPlanEstudiosall() {
       return repository.findAll();
    }

    @Override
    public PlanEstudios createPlanEstudio(PlanEstudios newPlanEstudios) {
        return repository.saveAndFlush(newPlanEstudios);
    }

    @Override
    public PlanEstudios updatePlanEstudio(PlanEstudios planEstudioUpdate) {
        return repository.save(planEstudioUpdate);
    }

    @Override
    public PlanEstudios getPlanEstudiosById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void deletePlanEstudios(Long id) {
        repository.deleteById(id);
    }
    
}
