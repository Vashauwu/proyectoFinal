/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.service;

import com.sistemaApp.web.entidad.Grupos;
import com.sistemaApp.web.repository.GruposRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pc
 */
@Service
public class GruposServiceImpl implements GruposService{

    @Autowired
    private GruposRepository gruposRepository;
    
    @Override
    public List<Grupos> getGruposall() {
        return gruposRepository.findAll();
    }

    @Override
    public Grupos createEvent(Grupos newGrupo) {
        return gruposRepository.saveAndFlush(newGrupo);
    }

    @Override
    public Grupos updateEvent(Grupos grupoUpdate) {
       return gruposRepository.save(grupoUpdate);
    }

    @Override
    public Grupos getEventById(Long id) {
        return gruposRepository.findById(id).get();
    }

    @Override
    public void deleteGrupo(Long id) {
       gruposRepository.deleteById(id);
    }
    
}
