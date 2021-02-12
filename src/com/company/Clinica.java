package com.company;

import java.util.ArrayList;

public class Clinica {

    private String name;
    private ArrayList<String> direccion = new ArrayList<String>();
    private int number;

    public Clinica(String name, ArrayList<String> direccion, int number) {
        this.name = name;
        this.direccion = direccion;
        this.number = number;
    }

    public Clinica() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

