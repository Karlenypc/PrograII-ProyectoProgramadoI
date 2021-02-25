package com.company;

// En esta clase hay metodos que tienen funciones que ayudan a en funciones de todo el sistema

import javax.swing.*;
import java.util.Scanner;

public class Funcionalidades {
    Scanner input = new Scanner(System.in);
    String opcion;
    String mensaje_a_medico;
    int califi;

    public void auto_email() {
        while(true) {
            System.out.println("Desea enviar un correo al Medico?");
            opcion = input.nextLine();
            if (opcion.equals("si")) {
                System.out.println("Digite su correo");
                mensaje_a_medico = input.nextLine();
                calificacion();

            } else if (opcion.equals("no")) {
                System.out.println("No se ha enviado ningun mensaje al Medico");
                calificacion();
            } else {
                JOptionPane.showMessageDialog(null, "Error, por favor escriba si o no");

            }
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
        System.out.println(" ____________________________________________");
        System.out.println("Agradeceriamos nos brindara su calificacion");

        for (int i = 0; i < calificacion.length; i++)
            System.out.println( calificacion[i] + " Estrellas");
        califi = input.nextInt();
        switch (califi){
            case 1: JOptionPane.showMessageDialog(null,"Se enviado una calificacion de 1 estrella al medico");
            break;
            case 2: JOptionPane.showMessageDialog(null,"Se enviado una calificacion de 2 estrella al medico");
            break;
            case 3: JOptionPane.showMessageDialog(null,"Se enviado una calificacion de 3 estrella al medico");
            break;
            case 4: JOptionPane.showMessageDialog(null,"Se enviado una calificacion de 4 estrella al medico");
            break;
            case 5: JOptionPane.showMessageDialog(null,"Se enviado una calificacion de 5 estrella al medico");
            break;
        }


    }

}
