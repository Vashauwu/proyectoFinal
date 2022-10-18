/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sistemaApp.web.service;

import com.sistemaApp.web.entidad.SemestreActual;
import java.util.List;

/**
 *
 * @author hp
 */
public interface SemestreActualService {
    public List<SemestreActual> getSemestreActualAll();
    
    public SemestreActual createSemestreActual(SemestreActual newSemestreActual);
    
    public SemestreActual updateSemestreActual(SemestreActual semestreActualUpdate);
    
    public SemestreActual getSemestreActualById(Long id);
    
    public void deleteSemestreActual(Long id);
}
