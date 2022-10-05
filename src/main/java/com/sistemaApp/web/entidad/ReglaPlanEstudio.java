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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "regla_plan_estudios")
public class ReglaPlanEstudio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "academico", nullable = false, length = 50)
    private int academico;
    @Column(name = "cultural", nullable = false, length = 50)
    private int cultural;
    @Column(name = "deportivo", nullable = false, length = 50)
    private int deportivo;
    @OneToMany(mappedBy = "id_regla_plan_estudio")
    private List<PlanEstudios> id_plan_estudio;

    public ReglaPlanEstudio() {

    }

    public ReglaPlanEstudio(Long id, int academico, int cultural, int deportivo) {
        this.id = id;
        this.academico = academico;
        this.cultural = cultural;
        this.deportivo = deportivo;
    }

    public ReglaPlanEstudio(int academico, int cultural, int deportivo) {

        this.academico = academico;
        this.cultural = cultural;
        this.deportivo = deportivo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAcademico() {
        return academico;
    }

    public void setAcademico(int academico) {
        this.academico = academico;
    }

    public int getCultural() {
        return cultural;
    }

    public void setCultural(int cultural) {
        this.cultural = cultural;
    }

    public int getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(int deportivo) {
        this.deportivo = deportivo;
    }

    public List<PlanEstudios> getId_plan_estudio() {
        return id_plan_estudio;
    }

    public void setId_plan_estudio(List<PlanEstudios> id_plan_estudio) {
        this.id_plan_estudio = id_plan_estudio;
    }
    
    

}
