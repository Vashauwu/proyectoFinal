/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.service;

import com.sistemaApp.web.entidad.Semestre;
import com.sistemaApp.web.repository.SemestreRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pc
 */
@Service
public class SemestreServiceImpl implements SemestreService {

    @Autowired
    private SemestreRepository semestreRepository;

    @Override
    public List<Semestre> getSemestresall() {
        return semestreRepository.findAll();
    }

    @Override
    public Semestre createSemestre(Semestre newSemestre) {
        return semestreRepository.saveAndFlush(newSemestre);
    }

    @Override
    public Semestre updateSemestre(Semestre semestreUpdate) {
        return semestreRepository.save(semestreUpdate);
    }

    @Override
    public Semestre getSemestreById(Long id) {
        return semestreRepository.findById(id).get();
    }

    @Override
    public void deleteSemestre(Long id) {
        semestreRepository.deleteById(id);
    }

}
