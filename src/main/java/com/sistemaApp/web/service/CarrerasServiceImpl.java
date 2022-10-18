/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.service;

import com.sistemaApp.web.entidad.Carrera;
import com.sistemaApp.web.repository.CarrerasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pc
 */
@Service
public class CarrerasServiceImpl implements CarrerasService{

    @Autowired
    private CarrerasRepository repository;

    @Override
    public List<Carrera> getCarrerasall() {
        return repository.findAll();
    }

    @Override
    public Carrera createCarrera(Carrera newCarrera) {
        return repository.saveAndFlush(newCarrera);
    }

    @Override
    public Carrera updateEvent(Carrera carreraUpdate) {
        return repository.save(carreraUpdate);
    }

    @Override
    public Carrera getCarreraById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void deleteCarrera(Long id) {
       repository.deleteById(id);
    }
}
