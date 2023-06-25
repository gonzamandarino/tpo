package com.example;

public class Animal {
    private String nombre;
    private int edad;
    private double altura;
    private double peso;
    private double condicion;
    private tipoAnimal tipo;
    private boolean enTratamiento = false;

    // Constructor
    public Animal(String nombre, int edad, double altura, double peso, double condicion, tipoAnimal tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.condicion = condicion;
        this.tipo = tipo;
    }

    public void cambiarEnTratamiento() {
        enTratamiento = !enTratamiento;
    }
    
    // Métodos getter y setter para acceder a los atributos privados
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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

    public tipoAnimal getTipo() {
        return tipo;
    }

    public void setTipo(tipoAnimal tipo) {
        this.tipo = tipo;
    }

    public boolean isEnTratamiento() {
        return enTratamiento;
    }

    public void setEnTratamiento(boolean enTratamiento) {
        this.enTratamiento = enTratamiento;
    }
}


