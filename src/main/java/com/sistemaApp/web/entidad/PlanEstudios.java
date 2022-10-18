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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "plan_estudios")
public class PlanEstudios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @OneToMany(mappedBy = "id_plan_estudios")
    private List<Grupos> id_grupo;
    @ManyToOne(targetEntity = Carrera.class)
    @JoinColumn(name = "carrera_id")
    private Carrera carrera_id;
    @ManyToOne(targetEntity = ReglaPlanEstudio.class)
    @JoinColumn(name = "id_regla_plan_estudio")
    private ReglaPlanEstudio id_regla_plan_estudio;

    public PlanEstudios() {
    }

    public PlanEstudios(Long id, String nombre, ReglaPlanEstudio id_regla_plan_estudio, Carrera carrera_id) {
        this.id = id;
        this.nombre = nombre;
        this.id_regla_plan_estudio = id_regla_plan_estudio;
        this.carrera_id = carrera_id;

    }

    public PlanEstudios(String nombre, ReglaPlanEstudio id_regla_plan_estudio, Carrera carrera_id) {
        this.nombre = nombre;
        this.id_regla_plan_estudio = id_regla_plan_estudio;
        this.carrera_id = carrera_id;
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

    public ReglaPlanEstudio getId_regla_plan_estudio() {
        return id_regla_plan_estudio;
    }

    public void setId_regla_plan_estudio(ReglaPlanEstudio id_regla_plan_estudio) {
        this.id_regla_plan_estudio = id_regla_plan_estudio;
    }

    public List<Grupos> getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(List<Grupos> id_grupo) {
        this.id_grupo = id_grupo;
    }

    public Carrera getId_carrera() {
        return carrera_id;
    }

    public void setId_carrera(Carrera carrera_id) {
        this.carrera_id = carrera_id;
    }

}
