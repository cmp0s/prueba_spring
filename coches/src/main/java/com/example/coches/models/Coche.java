package com.example.coches.models;

public class Coche {
    private String marca;
    private int precio;

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }

    public Coche(String marca, int precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public int getPrecio() {
        return precio;
    }
}
