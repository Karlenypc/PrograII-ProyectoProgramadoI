package com.company;

import java.util.ArrayList;

public class Main {
    //static ArrayList<Padecimiento> registroPadecimiento = new ArrayList<>();


    public static void main(String[] args) {
        // Inicio de registro de clinicas
        Registros p1 = new Registros();
        p1.agregar();
        p1.mostraNombrePadecimiento();

        // Inicio de registro de medicos
        p1.agregarMedicos();
        p1.mostrarNombreMedicos();


























        //  Se agregan en memoria 4 objetos tipo padecimientos y son agregados al ArrayList
//        Padecimiento padecimiento1 = new Padecimiento("Obesidad", "Nutricionista");
//        Padecimiento padecimiento2 = new Padecimiento("Cancer", " Medicina General");
//        Padecimiento padecimiento3 = new Padecimiento("Caries", " Odontologia");
//        Padecimiento padecimiento4 = new Padecimiento(" Gripe", " Respiratorio");
//        registroPadecimiento.add(padecimiento1);
//        registroPadecimiento.add(padecimiento2);
//        registroPadecimiento.add(padecimiento3);
//        registroPadecimiento.add(padecimiento4);
//
//
//        mostraNombrePadecimiento();


    } //fin del metodo Main

    //Metodo para mostrar nombre de los padecimientos dentro del ArrayList
//    public static void mostraNombrePadecimiento() {
//        for (int i = 0 ; i<registroPadecimiento.size(); i++) {
//            System.out.println(registroPadecimiento.get(i).getNombrePadecimiento());
//
//        }
//
//    }
}
