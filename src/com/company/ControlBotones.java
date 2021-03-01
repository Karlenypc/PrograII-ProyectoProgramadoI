package com.company;

import View.MainWindow;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlBotones {

    private static MainWindow formulario;
    private static Persona persona[];
   // private static Persona usuario[];
    private static int contador;
//    private static int contador2;

    public static void almacenarDatos() {
        formulario = new MainWindow();
        persona = new Persona[10]; // AREGLO ALMACENARA LA INFORMACION DE LOS USUARIOS QUE SE REGISTREN

        for (int i = 0; i < 10; i++) {
            persona[i] = new Persona();

        }
        contador = 0;
        
    }
    //METODO PARA GUARDAR NOMBRES DE USSARIO Y PASSWORD APLICADO EN PANEL LOGIN
//    public static void guardarLogin(String usuario, String contrasena){
//        persona
//    }
    
    public static void guardar(String nombre,String apellido,String cedula,String correo){
        persona[contador].setName(nombre);
        persona[contador].setApellido(apellido);
        persona[contador].setId(cedula);
        persona[contador].setEmail(correo);
       
        
        contador++;
                }
    
    //METODO PARA BUSCAR APLICAR EN EL REGISTRO DE PACIENTE
    public static void buscar(){
        
    }
}
