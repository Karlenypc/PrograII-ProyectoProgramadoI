package com.company;

// En esta clase hay metodos que tienen funciones que ayudan a en funciones de todo el sistema

import java.util.Scanner;

public class Funcionalidades {
    Scanner input = new Scanner(System.in);
    int opcion;
    String mensaje_a_medico;

    public void auto_email() {
        System.out.println("Desea enviar un correo al Medico?");
        if (opcion == 1) {
            System.out.println("Digite su correo");
            mensaje_a_medico = input.nextLine();
            calificacion();
        } else {
            System.out.println("No se ha enviado ningun mensaje al Medico");
            calificacion();
        }

    }

    //Metodo para calificar al medico (Esto se puede hacer por la interfaz)
    public void calificacion() {
        int calificacion[] = new int[5];
        calificacion[0] = 1;
        calificacion[1] = 2;
        calificacion[2] = 3;
        calificacion[3] = 4;
        calificacion[4] = 5;
        System.out.println("Agradeceriamos nos brindara su calificacion");
        for (int i = 0; i < calificacion.length; i++)
            System.out.println("1.- " + calificacion[i] + "estrellas");


    }

}
