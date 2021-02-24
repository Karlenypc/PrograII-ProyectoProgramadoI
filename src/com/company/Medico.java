package com.company;

import java.util.ArrayList;

class Medico extends Persona {


    private String especialidad;
    private String slogan;
    private String centroTrabaja;
    private String titulo;
    private String universidad;
    private String paisUniversidad;
    private String fechaGraduacion;
    private String colegioProfesional;

    public Medico(String name, String apellido, String id, String email, int edad, String especialidad, String slogan, String centroTrabaja, String titulo, String universidad, String paisUniversidad, String fechaGraduacion, String colegioProfesional) {
        super(name, apellido, id, email, edad);
        this.especialidad = especialidad;
        this.slogan = slogan;
        this.centroTrabaja = centroTrabaja;
        this.titulo = titulo;
        this.universidad = universidad;
        this.paisUniversidad = paisUniversidad;
        this.fechaGraduacion = fechaGraduacion;
        this.colegioProfesional = colegioProfesional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getCentroTrabaja() {
        return centroTrabaja;
    }

    public void setCentroTrabaja(String centroTrabaja) {
        this.centroTrabaja = centroTrabaja;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getPaisUniversidad() {
        return paisUniversidad;
    }

    public void setPaisUniversidad(String paisUniversidad) {
        this.paisUniversidad = paisUniversidad;
    }

    public String getFechaGraduacion() {
        return fechaGraduacion;
    }

    public void setFechaGraduacion(String fechaGraduacion) {
        this.fechaGraduacion = fechaGraduacion;
    }

    public String getColegioProfesional() {
        return colegioProfesional;
    }

    public void setColegioProfesional(String colegioProfesional) {
        this.colegioProfesional = colegioProfesional;
    }

}




