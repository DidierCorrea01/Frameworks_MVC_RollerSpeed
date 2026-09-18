package com.rollerspeed.rollerspeed.model;

public class Evento {

    private String dia;
    private String mes;
    private String categoria;
    private String titulo;
    private String detalle;

    public Evento(String dia, String mes, String categoria, String titulo, String detalle) {
        this.dia = dia;
        this.mes = mes;
        this.categoria = categoria;
        this.titulo = titulo;
        this.detalle = detalle;
    }

    public String getDia() { return dia; }
    public String getMes() { return mes; }
    public String getCategoria() { return categoria; }
    public String getTitulo() { return titulo; }
    public String getDetalle() { return detalle; }
}