/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.service;

import com.sistemaApp.web.entidad.Validacion;
import com.sistemaApp.web.repository.ValidacionesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pc
 */

@Service
public class ValidacionServiceImpl implements ValidacionService{

    @Autowired
    private ValidacionesRepository repository;
    
    @Override
    public List<Validacion> getValidacionAll() {
        return repository.findAll();
    }

    @Override
    public Validacion saveValidacion(Validacion validacionNueva) {
       return repository.saveAndFlush(validacionNueva);
    }

    @Override
    public Validacion getValidacionById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Validacion updateValidacion(Validacion validacion) {
        return repository.save(validacion);
    }

    @Override
    public void deleteValidacion(Long id) {
       repository.deleteById(id);
    }
    
}
