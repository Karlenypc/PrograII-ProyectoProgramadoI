package com.company;

import java.util.ArrayList;

public class Clinica {

    private ArrayList<String> nombreClinica = new ArrayList<>();
    private ArrayList<String> direccion = new ArrayList<>();
    private int number;


    public Clinica() {
    }

    public ArrayList<String> getNombreClinica() {
        return nombreClinica;
    }

    public void setNombreClinica(ArrayList<String> nombreClinica) {
        this.nombreClinica = nombreClinica;
    }

    public ArrayList<String> getDireccion() {
        return direccion;
    }

    public void setDireccion(ArrayList<String> direccion) {
        this.direccion = direccion;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}



