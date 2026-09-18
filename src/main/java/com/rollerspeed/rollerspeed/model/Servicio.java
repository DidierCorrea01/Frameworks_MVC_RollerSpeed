package com.rollerspeed.rollerspeed.model;

public class Servicio {

    private String titulo;
    private String descripcion;

    public Servicio(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}