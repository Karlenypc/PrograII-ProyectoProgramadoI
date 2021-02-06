package com.company;

public class RegistroMedico {

    public String nombre;
    public String cedula;
    public String email;
    public String especialidad;
    // foto del medico?
    // eslogan del medico
    public String[] centrosMedicos;
    //procedimientos que realiza?
    public String[] idiomas;
    public String[] educacion;
    public String nombreAfiliacion;

    public RegistroMedico() { }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String[] getCentrosMedicos() {
        return centrosMedicos;
    }

    public void setCentrosMedicos(String[] centrosMedicos) {
        this.centrosMedicos = centrosMedicos;
    }

    public String[] getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String[] idiomas) {
        this.idiomas = idiomas;
    }

    public String[] getEducacion() {
        return educacion;
    }

    public void setEducacion(String[] educacion) {
        this.educacion = educacion;
    }

    public String getNombreAfiliacion() {
        return nombreAfiliacion;
    }

    public void setNombreAfiliacion(String nombreAfiliacion) {
        this.nombreAfiliacion = nombreAfiliacion;
    }
}
