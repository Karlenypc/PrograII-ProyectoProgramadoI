/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.util.GregorianCalendar;

/**
 *
 * @author pimie
 */
public class Cita {

    private GregorianCalendar calendar;
    private String texto;

    public Cita(GregorianCalendar calendar, String texto) {
        this.calendar = calendar;
        this.texto = texto;

    }

    public GregorianCalendar getCalendar() {
        return calendar;
    }

    public void setCalendar(GregorianCalendar calendar) {
        this.calendar = calendar;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        int hora = calendar.get(GregorianCalendar.HOUR);
        return hora + ":00" + " - " + texto;
    }

}
