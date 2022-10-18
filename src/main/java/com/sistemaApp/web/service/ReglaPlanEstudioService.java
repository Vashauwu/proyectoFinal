/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sistemaApp.web.service;

import com.sistemaApp.web.entidad.ReglaPlanEstudio;
import java.util.List;

/**
 *
 * @author hp
 */
public interface ReglaPlanEstudioService {
    
    public List<ReglaPlanEstudio> getReglaPlanEstudioall();
    
    public ReglaPlanEstudio createReglaPlanEstudio(ReglaPlanEstudio newReglaPlanEstudio);
    
    public ReglaPlanEstudio updateReglaPlanEstudio(ReglaPlanEstudio planEstudioUpdate);
    
    public ReglaPlanEstudio getReglaPlanEstudioById(Long id);
    
    public void deleteReglaPlanEstudio(Long id);
}
