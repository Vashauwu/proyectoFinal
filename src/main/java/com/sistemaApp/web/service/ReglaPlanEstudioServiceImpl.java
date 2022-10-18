/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.service;
import com.sistemaApp.web.entidad.ReglaPlanEstudio;
import com.sistemaApp.web.repository.ReglaPlanEstudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author hp
 */
@Service
public class ReglaPlanEstudioServiceImpl implements ReglaPlanEstudioService {
     @Autowired
    private ReglaPlanEstudioRepository repository;
    
    @Override
    public List<ReglaPlanEstudio> getReglaPlanEstudioall() {
       return repository.findAll();
    }
    @Override
    public ReglaPlanEstudio createReglaPlanEstudio(ReglaPlanEstudio newReglaPlanEstudio) {
        return repository.saveAndFlush(newReglaPlanEstudio);
    }

    @Override
    public ReglaPlanEstudio updateReglaPlanEstudio(ReglaPlanEstudio ReglaPlanEstudioUpdate) {
        return repository.save(ReglaPlanEstudioUpdate);
    }
    @Override
    public ReglaPlanEstudio getReglaPlanEstudioById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void deleteReglaPlanEstudio(Long id) {
        repository.deleteById(id);
    }
}
