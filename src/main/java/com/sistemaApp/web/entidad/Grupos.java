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
@Table(name = "grupos")
public class Grupos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @ManyToOne(targetEntity=PlanEstudios.class)
    @JoinColumn(name="id_plan_estudios")
    private PlanEstudios id_plan_estudios;
    @ManyToOne(targetEntity=Turno.class)
    @JoinColumn(name="id_turno")
    private Turno turno_id;
    @OneToMany(mappedBy = "id_grupo")
    private List<Student> id_estudiante;

    public Grupos() {
    }

    public Grupos(Long id, String nombre, PlanEstudios id_plan_estudios, Turno turno_id) {
        this.id = id;
        this.nombre = nombre;
        this.id_plan_estudios = id_plan_estudios;
        this.turno_id = turno_id;
    }

    public Grupos( String nombre, PlanEstudios id_plan_estudios, Turno turno_id) {
        this.nombre = nombre;
        this.id_plan_estudios = id_plan_estudios;
        this.turno_id = turno_id;
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

    public PlanEstudios getId_plan_estudios() {
        return id_plan_estudios;
    }

    public void setId_plan_estudios(PlanEstudios id_plan_estudios) {
        this.id_plan_estudios = id_plan_estudios;
    }

    public List<Student> getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(List<Student> id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public Turno getTurno_id() {
        return turno_id;
    }

    public void setTurno_id(Turno turno_id) {
        this.turno_id = turno_id;
    }
    
    

}
