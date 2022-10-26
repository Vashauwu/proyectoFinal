/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.service;

import com.sistemaApp.web.entidad.Turno;
import com.sistemaApp.web.repository.TurnoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sergio Merino
 */

@Service
public class TurnoServiceImpl implements TurnoService{
    @Autowired
    private TurnoRepository repository;

    @Override
    public List<Turno> getTurnoAll() {
        return repository.findAll();
    }

    @Override
    public Turno SaveTurno(Turno turnoNuevo) {
        return repository.saveAndFlush(turnoNuevo);
    }

    @Override
    public Turno getTurnoById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Turno updateTurno(Turno turno) {
        return repository.save(turno);
    }

    @Override
    public void deleteTurno(Long id) {
        repository.deleteById(id);
    }
    
}
