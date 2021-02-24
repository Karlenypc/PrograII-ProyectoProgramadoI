package com.company;

import java.util.ArrayList;

public class Registros {

    // REGISTRO DE PADECIMIENTOS
    ArrayList<Padecimiento> registroPadecimiento = new ArrayList<>();

    Padecimiento padecimiento1 = new Padecimiento("Obesidad", "Nutricionista");
    Padecimiento padecimiento2 = new Padecimiento("Cancer", " Medicina General");
    Padecimiento padecimiento3 = new Padecimiento("Caries", " Odontologia");
    Padecimiento padecimiento4 = new Padecimiento("Gripe", " Respiratorio");

    //Metodo para agregar registros en la memoria de Padecimientos
    public void agregar() {
        registroPadecimiento.add(padecimiento1);
        registroPadecimiento.add(padecimiento2);
        registroPadecimiento.add(padecimiento3);
        registroPadecimiento.add(padecimiento4);
    }

    // Metodo muestra en consola los nombres de los padecimientos
    public void mostraNombrePadecimiento() {
        for (int i = 0; i < registroPadecimiento.size(); i++) {
            System.out.println(registroPadecimiento.get(i).getNombrePadecimiento());
        }
    }

    //Metodo muestra en consola el tipo de padecimiento
    public void mostrarTipoPadecimiento() {
        for (int i = 0; i < registroPadecimiento.size(); i++) {
            System.out.println(registroPadecimiento.get(i).getTipoPadecimiento());
        }
    }

    public void agregarClinicaRegistro() {

    }

    public void borrarRegistroPadecimiento(int x) {
        registroPadecimiento.remove(x);
    }

    // REGISTRO DE MEDICOS
    ArrayList<Medico> registroMedicos = new ArrayList<Medico>();
    Medico medico1 = new Medico("Alejandro", "Meneses", "224355", "ale_meneses@gmaillcom", 27, "Cardiologo", " g", "G", "g", "g", "g", "g", "g");
    Medico medico2 = new Medico("Catalina", "Retana", "567432", "retana.cat@gmaillcom", 26, "Odontologia", " g", "G", "g", "g", "g", "g", "g");
    Medico medico3 = new Medico("Francisca", "Gonzalez", "65678", "Francisca.gonzalesz@gmaillcom", 35, "Medicina General", " g", "G", "g", "g", "g", "g", "g");

    public void agregarMedicos() {
        registroMedicos.add(medico1);
        registroMedicos.add(medico2);
        registroMedicos.add(medico3);
    }

    public void mostrarNombreMedicos() {
        for (int j = 0; j < registroMedicos.size(); j++)
            System.out.println(registroMedicos.get(j).getName() + " " + registroMedicos.get(j).getApellido());
    }

    public void agregarDatoMedico() {
    }

    public void borrarRegistroMedico(int x) {
        registroMedicos.remove(x);
    }

    //REGISTRO CLINICAS!
    ArrayList<Clinica> registroClinica = new ArrayList<Clinica>();
    Clinica clinica1 = new Clinica("Clinica San Jose", " Avenida 1234", 2234 - 4567, " San Jose", "San Jose", "San Jose");
    Clinica clinica2 = new Clinica("Clinica Granadilla", " 25 mts Norte, 50 Sur de la iglesia Catolica", 2254 - 8899, " Curridabat", "Granadilla Norte", "San Jose");
    Clinica clinica3 = new Clinica("Clinica Desamparados", " 100 mts del McDonalds", 2234 - 4563, "Desamparados", "San Antonio", "San Jose");
    Clinica clinica4 = new Clinica("Clinica Costa", "Calle 12, 100 mts de la iglesa", 2244 - 6789, " Guanacaste", "Guanacaste", "Liberia");

    public void agregarClinica() {
        registroClinica.add(clinica1);
        registroClinica.add(clinica2);
        registroClinica.add(clinica3);
        registroClinica.add(clinica4);
    }

    public void mostrarRegistroClinica() {
        for (int k = 0; k < registroClinica.size(); k++) {
            System.out.println(registroClinica.get(k).getNombre() + " " + registroClinica.get(k).getDireccion() + " " + registroClinica.get(k).getNumber());
        }
    }

    public void agregarDatoClinica(){
    }

    public void borrarRegistroClinica(int x) {
        registroClinica.remove(x);
    }


}
