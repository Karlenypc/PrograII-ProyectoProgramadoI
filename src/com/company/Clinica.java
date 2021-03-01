package com.company;

import java.util.ArrayList;
// CLASE DE REGISTRO DE CLINICAS, NO ESTA EN USO
public class Clinica {

    private String nombre;
    private String direccion;
    private String canton;
    private String distrito;
    private String provincia;
    private int number;


    public Clinica(String nombre, String direccion, int number, String canton, String distrito, String provincia) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.number = number;
        this.canton = canton;
        this.distrito = distrito;
        this.provincia = provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}