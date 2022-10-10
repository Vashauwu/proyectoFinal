/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.service;

import com.sistemaApp.web.entidad.Credito;
import com.sistemaApp.web.repository.CreditosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pc
 */
@Service
public class CreditosServiceImpl implements CreditosService {

    @Autowired
    private CreditosRepository repository;
    
    @Override
    public List<Credito> getCreditosall() {
        return repository.findAll();
    }

    @Override
    public Credito createCredito(Credito newCredito) {
        return repository.saveAndFlush(newCredito);
    }

    @Override
    public Credito updateCredito(Credito eventCredito) {
       return repository.save(eventCredito);
    }

    @Override
    public Credito getCreditoById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void deleteCredito(Long id) {
       repository.deleteById(id);
    }
    
}
