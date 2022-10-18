/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sistemaApp.web.service;

import com.sistemaApp.web.entidad.Semestre;
import java.util.List;

/**
 *
 * @author pc
 */
public interface SemestreService {

    public List<Semestre> getSemestresall();

    public Semestre createSemestre(Semestre newSemestre);

    public Semestre updateSemestre(Semestre semestreUpdate);

    public Semestre getSemestreById(Long id);

    public void deleteSemestre(Long id);
}
