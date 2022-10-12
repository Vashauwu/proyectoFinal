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
    @JoinColumn(name = "id_semestreActual")
    @ManyToOne(targetEntity = SemestreActual.class)
    private SemestreActual id_semestreActual;
    @JoinColumn(name = "id_grupos")
    @ManyToOne(targetEntity = Grupos.class)
    private Grupos id_grupos;

    public Semestre() {

    }

    public Semestre(Long id, String nombre, SemestreActual id_semestreActual, Grupos id_grupos) {
        this.id = id;
        this.nombre = nombre;
        this.id_semestreActual = id_semestreActual;
        this.id_grupos = id_grupos;
    }

    public Semestre( String nombre, SemestreActual id_semestreActual, Grupos id_grupos) {
        
        this.nombre = nombre;
        this.id_semestreActual = id_semestreActual;
        this.id_grupos = id_grupos;
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

    public SemestreActual getId_semestreActual() {
        return id_semestreActual;
    }

    public void setId_semestreActual(SemestreActual id_semestreActual) {
        this.id_semestreActual = id_semestreActual;
    }

    public Grupos getId_grupos() {
        return id_grupos;
    }

    public void setId_grupos(Grupos id_grupos) {
        this.id_grupos = id_grupos;
    }
    
    

}
