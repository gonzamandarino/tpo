package com.example;

public class Animal {
    private int edad;
    private double altura;
    private double peso;
    private double condicion;
    private boolean salvaje;

    // Constructor
    public Animal(int edad, double altura, double peso, double condicion, boolean salvaje) {
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.condicion = condicion;
        this.salvaje = salvaje;
    }

    // Métodos getter y setter para acceder a los atributos privados
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCondicion() {
        return condicion;
    }

    public void setCondicion(double condicion) {
        this.condicion = condicion;
    }

    public boolean isSalvaje() {
        return salvaje;
    }

    public void setSalvaje(boolean salvaje) {
        this.salvaje = salvaje;
    }
}
