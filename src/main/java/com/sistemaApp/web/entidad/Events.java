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
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "eventos")
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "fecha", nullable = false, length = 50)
    private Date date;

    @JoinColumn(name = "id_validacion")
    @ManyToOne(targetEntity = Validacion.class)
    private Validacion id_validacion;

    @JoinColumn(name = "id_plan_estudios")
    @ManyToOne(targetEntity = PlanEstudios.class)
    private PlanEstudios id_plan_estudios;

    @JoinColumn(name = "semestre_actual_id")
    @ManyToOne(targetEntity = SemestreActual.class)
    private SemestreActual semestre_actual_id;

    @JoinColumn(name = "tipo_evento_id")
    @ManyToOne(targetEntity = Credito.class)
    private Credito id_credito;

    @ManyToMany(mappedBy = "eventos", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Student> listaAsistenciaEstudiantes;

    @Column(name = "horas", nullable = false, length = 50)
    private int horas;

    public Events() {

    }

    public Events(Long id, String name, Date date, Validacion id_validacion, PlanEstudios id_plan_estudios, int horas, SemestreActual semestre_actual_id, Credito id_credito) {

        this.id = id;
        this.name = name;
        this.date = date;
        this.id_validacion = id_validacion;
        this.id_plan_estudios = id_plan_estudios;
        this.horas = horas;
        this.semestre_actual_id = semestre_actual_id;
        this.id_credito = id_credito;

    }

    public Events(String name, Date date, Validacion id_validacion, PlanEstudios id_plan_estudios, int horas, SemestreActual semestre_actual_id, Credito id_credito) {
        this.name = name;
        this.date = date;
        this.id_validacion = id_validacion;
        this.id_plan_estudios = id_plan_estudios;
        this.horas = horas;
        this.semestre_actual_id = semestre_actual_id;
        this.id_credito = id_credito;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Validacion getId_validacion() {
        return id_validacion;
    }

    public void setId_validacion(Validacion id_validacion) {
        this.id_validacion = id_validacion;
    }

    public PlanEstudios getId_plan_estudios() {
        return id_plan_estudios;
    }

    public void setId_plan_estudios(PlanEstudios id_plan_estudios) {
        this.id_plan_estudios = id_plan_estudios;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public Credito getId_credito() {
        return id_credito;
    }

    public void setId_credito(Credito id_credito) {
        this.id_credito = id_credito;
    }


    public SemestreActual getSemestre_actual_id() {
        return semestre_actual_id;
    }

    public void setSemestre_actual_id(SemestreActual semestre_actual_id) {
        this.semestre_actual_id = semestre_actual_id;
    }

    public List<Student> getListaAsistenciaEstudiantes() {
        return listaAsistenciaEstudiantes;
    }

    public void setListaAsistenciaEstudiantes(List<Student> listaAsistenciaEstudiantes) {
        this.listaAsistenciaEstudiantes = listaAsistenciaEstudiantes;
    }
    
    

}
