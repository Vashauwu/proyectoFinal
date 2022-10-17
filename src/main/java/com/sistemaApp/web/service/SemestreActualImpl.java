/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.service;

import com.sistemaApp.web.entidad.SemestreActual;
import com.sistemaApp.web.repository.SemestreActualRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hp
 */
@Service
public class SemestreActualImpl implements SemestreActualService{

    @Autowired
    private SemestreActualRepository repository;
    
    @Override
    public List<SemestreActual> getSemestreActualAll() {
        return repository.findAll();
    }

    @Override
    public SemestreActual createSemestreActual(SemestreActual newSemestreActual) {
        return repository.saveAndFlush(newSemestreActual);
    }

    @Override
    public SemestreActual updateSemestreActual(SemestreActual semestreActualUpdate) {
        return repository.save(semestreActualUpdate);
    }

    @Override
    public SemestreActual getSemestreActualById(Long id) {
       return repository.findById(id).get();
    }

    @Override
    public void deleteSemestreActual(Long id) {
       repository.deleteById(id);
    }
    
}
