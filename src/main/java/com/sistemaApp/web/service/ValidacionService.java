/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sistemaApp.web.service;

import com.sistemaApp.web.entidad.Validacion;
import java.util.List;

/**
 *
 * @author pc
 */
public interface ValidacionService {
    public List<Validacion> getValidacionAll();
    
    public Validacion saveValidacion(Validacion validacionNueva);
    
    public Validacion getValidacionById(Long id);
    
    public Validacion updateValidacion(Validacion validacion);
    
    public void deleteValidacion(Long id);
}
