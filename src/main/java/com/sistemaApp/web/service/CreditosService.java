/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sistemaApp.web.service;

import com.sistemaApp.web.entidad.Credito;
import java.util.List;

/**
 *
 * @author pc
 */
public interface CreditosService {
    public List<Credito> getCreditosall();
    
    public Credito createCredito(Credito newCredito);
    
    public Credito updateCredito(Credito eventCredito);
    
    public Credito getCreditoById(Long id);
    
    public void deleteCredito(Long id);
}
