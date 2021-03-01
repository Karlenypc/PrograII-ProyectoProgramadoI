/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.AbstractListModel;

/**
 *
 * @author pimie
 */
public class AgendaListModel extends AbstractListModel {

    private final ArrayList<Cita> citas = new ArrayList<>();

    public void Limpiar() {
        citas.clear();
    }

    public void addcita(Cita nueva) {
        citas.add(nueva);
    }

    @Override
    public int getSize() {
        return citas.size();
    }

    @Override
    public Object getElementAt(int index) {
        return citas.get(index);
    }
    
    
    }
   


