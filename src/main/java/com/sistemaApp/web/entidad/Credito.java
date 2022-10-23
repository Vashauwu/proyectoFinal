/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.entidad;

import java.util.Date;
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
@Table(name = "tipo_evento")
public class Credito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre_evento;
    
    @OneToMany(mappedBy="id_credito")
    private List<Events> id_eventos;

    public Credito() {

    }

    public Credito(Long id, String nombre_evento) {
        this.id = id;
        this.nombre_evento = nombre_evento;

    }

    public Credito(String nombre_evento) {

        this.nombre_evento = nombre_evento;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_evento() {
        return nombre_evento;
    }

    public void setNombre_evento(String nombre_evento) {
        this.nombre_evento = nombre_evento;
    }

    public List<Events> getEventos_id() {
        return id_eventos;
    }

    public void setEventos_id(List<Events> id_eventos) {
        this.id_eventos = id_eventos;
    }

}
