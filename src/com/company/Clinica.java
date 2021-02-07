package com.company;

public class Clinica {

    String name;
    String address[][] = new String[4][4];
    // posicion 1 0 = direccion general
    // posicion 2 0 = distrito
    // posicion 3 0 = canton
    // posicion 4 0 = provincia


    public Clinica(String name, String[][] address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[][] getAddress() {
        return address;
    }

    public void setAddress(String[][] address) {
        this.address = address;
    }
}
