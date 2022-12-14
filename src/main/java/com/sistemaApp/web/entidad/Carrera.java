/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.entidad;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javax.persistence.Table;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "carrera")
public class Carrera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @OneToMany(mappedBy = "carrera_id")
    private List<PlanEstudios> id_plan_estudios;
    
    

    public Carrera() {

    }

    public Carrera(Long id, String nombre ) {
        this.id = id;
        this.nombre = nombre;
         
    }

    public Carrera(String nombre ) {
        
        this.nombre = nombre;
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<PlanEstudios> getId_plan_estudios() {
        return id_plan_estudios;
    }

    public void setId_plan_estudios(List<PlanEstudios> id_plan_estudios) {
        this.id_plan_estudios = id_plan_estudios;
    }

    
    
}
