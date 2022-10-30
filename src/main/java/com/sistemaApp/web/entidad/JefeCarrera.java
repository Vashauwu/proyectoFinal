/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.entidad;

import javax.persistence.CascadeType;
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
@Table(name = "jefes_carrera")
public class JefeCarrera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Column(name = "apellido", nullable = false, length = 50)
    private String apellido;
    @Column(name = "RFC", nullable = false, length = 50)
    private String RFC;
    @Column(name = "correo", nullable = false, length = 50)
    private String correo;
    @Column(name = "telefono", nullable = false, length = 10)
    private int telefono;
    @OneToOne
    @JoinColumn(name = "id_unidad_academica")
    private UnidadAcademica id_unidad_academica;

    public JefeCarrera() {
    }

    public JefeCarrera(Long id, String nombre, String apellido, String RFC, String correo, int telefono, UnidadAcademica id_unidad_academica) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.RFC = RFC;
        this.correo = correo;
        this.telefono = telefono;
        this.id_unidad_academica = id_unidad_academica;

    }

    public JefeCarrera(String nombre, String apellido, String RFC, String correo, int telefono, UnidadAcademica id_unidad_academica) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.RFC = RFC;
        this.correo = correo;
        this.telefono = telefono;
        this.id_unidad_academica = id_unidad_academica;

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public UnidadAcademica getId_unidad_academica() {
        return id_unidad_academica;
    }

    public void setId_unidad_academica(UnidadAcademica id_unidad_academica) {
        this.id_unidad_academica = id_unidad_academica;
    }

}
