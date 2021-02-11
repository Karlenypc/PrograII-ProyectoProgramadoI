package com.company;

public class Padecimiento {
    String tipo;
    String gravedad;
    String descripcion;
    String comentariosPaciente;

    public Padecimiento(String tipo, String gravedad, String descripcion, String comentariosPaciente) {
        this.tipo = tipo;
        this.gravedad = gravedad;
        this.descripcion = descripcion;
        this.comentariosPaciente = comentariosPaciente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getComentariosPaciente() {
        return comentariosPaciente;
    }

    public void setComentariosPaciente(String comentariosPaciente) {
        this.comentariosPaciente = comentariosPaciente;
    }
}
