package com.company;

//clase se utiliza como superclase de la sub clase Medico y Paciente
public class Persona {
    public String name;
    public String apellido;
    private String id;
    private String email;
    public int edad;

    public Persona(String name, String apellido, String id, String email, int edad) {
        this.name = name;
        this.apellido = apellido;
        this.id = id;
        this.email = email;
        this.edad = edad;
    }

    public Persona() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
