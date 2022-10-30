/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author pc
 */

@Entity
@Table(name = "unidades_academicas")
public class UnidadAcademica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @OneToOne(mappedBy="id_unidad_academica")
    
    private JefeCarrera id_jefe_carrera;
    
    public UnidadAcademica(){
        
    }
    public UnidadAcademica(Long id,String nombre){
        this.id=id;
        this.nombre=nombre;
    }
    public UnidadAcademica(String nombre){
       
        this.nombre=nombre;
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

    public JefeCarrera getId_jefe_carrera() {
        return id_jefe_carrera;
    }

    public void setId_jefe_carrera(JefeCarrera id_jefe_carrera) {
        this.id_jefe_carrera = id_jefe_carrera;
    }
    
    
    
}
