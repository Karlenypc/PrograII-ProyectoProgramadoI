/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.util.Vector;

// CLASE USUARIO DONDE SE REGISTRAN LOS URUARIOS 
public class ListaUsuario {

    public static Vector<Usuario> datos = new Vector<Usuario>();

    public static void agregar(Usuario obj) {
        datos.addElement(obj);
    }
    public static void Eliminar(int pos) {
        datos.remove(pos);
    }
    public static Vector mostrar() {
        return datos;
    }
    

}
