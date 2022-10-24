/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistemaApp.web.entidad;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "estudiantes")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;
    @Column(name = "apellido_paterno", nullable = false, length = 50)
    private String apellido_paterno;
    @Column(name = "apellido_materno", nullable = false, length = 50)
    private String apellido_materno;
    @Column(name = "matricula", nullable = false, length = 50)
    private String matricula;
    @Column(name = "correo", nullable = false, length = 50, unique = true)
    private String email;
    @ManyToOne
    @JoinColumn(name = "id_grupo")
    private Grupos id_grupo;
    
    @ManyToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="lista")
    private Set<Events> eventos = new HashSet<>();

    public Student() {

    }

    public Student(Long id, String nombre, String apellido_paterno, String apellido_materno, String matricula, String email, Grupos id_grupo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.matricula = matricula;
        this.email = email;
        this.id_grupo = id_grupo;

    }

    public Student(String nombre, String apellido_paterno, String apellido_materno, String matricula, String email, Grupos id_grupo) {

        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.matricula = matricula;
        this.email = email;
        this.id_grupo = id_grupo;

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

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Grupos getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(Grupos id_grupo) {
        this.id_grupo = id_grupo;
    }

    public Set<Events> getEventos() {
        return eventos;
    }

    public void setEventos(Set<Events> eventos) {
        this.eventos = eventos;
    }

   

   

    

    
    
}
