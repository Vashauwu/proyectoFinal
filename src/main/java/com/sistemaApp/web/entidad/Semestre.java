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
@Table(name = "semestres")
public class Semestre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @JoinColumn(name = "semestre_actual_id")
    @ManyToOne(targetEntity = SemestreActual.class)
    private SemestreActual semestre_actual_id;
    @JoinColumn(name = "grupos_id")
    @ManyToOne(targetEntity = Grupos.class)
    private Grupos grupos_id;

    public Semestre() {

    }

    public Semestre(Long id, String nombre, SemestreActual semestre_actual_id, Grupos grupos_id) {
        this.id = id;
        this.nombre = nombre;
        this.semestre_actual_id = semestre_actual_id;
        this.grupos_id = grupos_id;
    }

    public Semestre(String nombre, SemestreActual semestre_actual_id, Grupos grupos_id) {

        this.nombre = nombre;
        this.semestre_actual_id = semestre_actual_id;
        this.grupos_id = grupos_id;
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

    public SemestreActual getSemestre_actual_id() {
        return semestre_actual_id;
    }

    public void setSemestre_actual_id(SemestreActual semestre_actual_id) {
        this.semestre_actual_id = semestre_actual_id;
    }

    public Grupos getGrupos_id() {
        return grupos_id;
    }

    public void setGrupos_id(Grupos grupos_id) {
        this.grupos_id = grupos_id;
    }

}
