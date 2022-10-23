/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.entidad;

import java.util.Date;
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
@Table(name = "semestre_actual")
public class SemestreActual {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Column(name = "fecha_inicio", nullable = false, length = 50)
    private Date fecha_inicio;
    @Column(name = "fecha_fin", nullable = false, length = 50)
    private Date fecha_fin;
    @Column(name = "activo", nullable = false, length = 50)
    private Boolean activo;
    @OneToMany(mappedBy = "semestre_actual_id")
    private List<Semestre> id_semestre;
    @OneToMany(mappedBy = "semestre_actual_id")
    private List<Events> id_events;

    public SemestreActual() {

    }

    public SemestreActual(Long id, String nombre, Date fecha_inicio, Date fecha_fin, Boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.activo = activo;
    }

    public SemestreActual(String nombre, Date fecha_inicio, Date fecha_fin, Boolean activo) {
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.activo = activo;
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

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public List<Semestre> getId_semestre() {
        return id_semestre;
    }

    public void setId_semestre(List<Semestre> id_semestre) {
        this.id_semestre = id_semestre;
    }

    public List<Events> getId_events() {
        return id_events;
    }

    public void setId_events(List<Events> id_events) {
        this.id_events = id_events;
    }
    
    

}
