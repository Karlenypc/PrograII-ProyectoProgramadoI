package com.company;

import java.util.ArrayList;

public class Clinica {

    private String nombre;
    private String direccion;
    private String canton;
    private String distrito;
    private String provincia;
    public ArrayList<Clinica> nombreClinica = new ArrayList<>();
    private int number;


    public Clinica(String nombre) {
        this.nombre = nombre;
    }

    //Registro de Clinicas
    public void datosLista() {
        nombreClinica.add(new Clinica("Clinica Paraiso", "Avenida Segunda, Nº1234", 23456532, " ", " ", ""));
        nombreClinica.add(new Clinica("Clinica 1", "Avenida 1, Nº1234", 23456532, " ", " ", ""));
        nombreClinica.add(new Clinica("Clinica 2", "Avenida 2, Nº1234", 23456532, " ", " ", ""));
        nombreClinica.add(new Clinica("Clinica 3", "Avenida 3, Nº1234", 23456532, " ", " ", ""));
        nombreClinica.add(new Clinica("Clinica 4", "Avenida 4, Nº1234", 23456532, " ", " ", ""));
        nombreClinica.add(new Clinica("Clinica 5", "Avenida 5, Nº1234", 23456532, " ", " ", ""));
    }
    //Metodo para agregar una clinica al registro
    public void agregarClinica(){

    }
    // Metodo para borrar registro
    public void borrarClinica(){

    }

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

    public ArrayList<Clinica> getNombreClinica() {
        return nombreClinica;
    }

    public void setNombreClinica(ArrayList<Clinica> nombreClinica) {
        this.nombreClinica = nombreClinica;
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