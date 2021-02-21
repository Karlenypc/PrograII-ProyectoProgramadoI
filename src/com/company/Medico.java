package com.company;

import java.util.ArrayList;

class Medico extends Persona{


    private String especialidad;
    private String slogan;
    private Clinica centroTrabaja;
    private String titulo;
    private String Universidad;
    private String paisUniversidad;
    private String fechaGraduacion;
    private String colegioProfesional;
    private ArrayList<Medico> registroMedico = new ArrayList<>();

    public Medico(String name, String apellido, String id, String email, int edad, String especialidad, String slogan, Clinica centroTrabaja, String titulo, String universidad, String paisUniversidad, String fechaGraduacion, String colegioProfesional) {
        super(name, apellido, id, email, edad);
        this.especialidad = especialidad;
        this.slogan = slogan;
        this.centroTrabaja = centroTrabaja;
        this.titulo = titulo;
        Universidad = universidad;
        this.paisUniversidad = paisUniversidad;
        this.fechaGraduacion = fechaGraduacion;
        this.colegioProfesional = colegioProfesional;
    }

    public Medico(String name, String apellido, String id, String email, int edad, String especialidad, String slogan, String s, String titulo, String universidad, String paisUniversidad, String fechaGraduacion) {
    }

    public void listaMedicos(){
        registroMedico.add(new Medico( " Adolfo", " Gomez", " AD1234", " adolfo.gomez@gmail.com", 27, " Cardialogo", "", "", " "," "," ", " "));
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

    public Clinica getCentroTrabaja() {
        return centroTrabaja;
    }

    public void setCentroTrabaja(Clinica centroTrabaja) {
        this.centroTrabaja = centroTrabaja;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUniversidad() {
        return Universidad;
    }

    public void setUniversidad(String universidad) {
        Universidad = universidad;
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




