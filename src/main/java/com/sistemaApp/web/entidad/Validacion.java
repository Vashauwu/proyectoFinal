/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.entidad;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "validaciones")

public class Validacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nombre", nullable=false,length=50)
    private String name;
    @OneToMany(mappedBy="id_validacion")
    private List<Events> id_event;
    
    public Validacion(){
    }
    
    public Validacion(Long id, String name) {
        this.id = id;
        this.name = name;
        
    }
    public Validacion( String name) {   
      
        this.name = name;
       
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Events> getId_event() {
        return id_event;
    }

    public void setId_event(List<Events> id_event) {
        this.id_event = id_event;
    }
    
    
}
