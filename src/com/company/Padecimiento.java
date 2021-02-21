package com.company;

import java.util.ArrayList;

public class Padecimiento {
    private String nombrePadecimiento;
    private String tipoPadecimiento;
    ArrayList<String> tipo = new ArrayList<>();
    ArrayList<String> descripcion = new ArrayList<>();

    public Padecimiento(String nombrePadecimiento, String tipoPadecimiento) {
        this.nombrePadecimiento = nombrePadecimiento;
        this.tipoPadecimiento = tipoPadecimiento;
    }

    public String getNombrePadecimiento() {
        return nombrePadecimiento;
    }

    public void setNombrePadecimiento(String nombrePadecimiento) {
        this.nombrePadecimiento = nombrePadecimiento;
    }

    public String getTipoPadecimiento() {
        return tipoPadecimiento;
    }

    public void setTipoPadecimiento(String tipoPadecimiento) {
        this.tipoPadecimiento = tipoPadecimiento;
    }
}
