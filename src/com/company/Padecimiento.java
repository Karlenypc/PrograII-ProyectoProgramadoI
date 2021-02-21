package com.company;

import java.util.ArrayList;

public class Padecimiento {
    private String nombrePadecimiento;
    private String tipoPadecimiento;
    ArrayList<Padecimiento> tipo = new ArrayList<>();

    public Padecimiento(String nombrePadecimiento, String tipoPadecimiento) {
        this.nombrePadecimiento = nombrePadecimiento;
        this.tipoPadecimiento = tipoPadecimiento;
    }

    public void registroPadecimientos() {
        tipo.add(new Padecimiento("Electrocardiograma", " Cardiologia"));
        tipo.add(new Padecimiento(" ", " "));
        tipo.add(new Padecimiento(" ", " "));
        tipo.add(new Padecimiento(" ", " "));
        tipo.add(new Padecimiento(" ", " "));


    }
}
