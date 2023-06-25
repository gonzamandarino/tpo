package com.example;


public class Adopcion {
    private Cliente cliente;
    private Animal animal;
    private String motivoAdopcion;
    private String tipoInteresado;

    // Constructor
    public Adopcion(Cliente cliente, Animal animal, String motivoAdopcion, String tipoInteresado) {
        this.cliente = cliente;
        this.animal = animal;
        this.motivoAdopcion = motivoAdopcion;
        this.tipoInteresado = tipoInteresado;
    }

    // Métodos getter y setter para acceder a los atributos privados
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getMotivoAdopcion() {
        return motivoAdopcion;
    }

    public void setMotivoAdopcion(String motivoAdopcion) {
        this.motivoAdopcion = motivoAdopcion;
    }

    public String getTipoInteresado() {
        return tipoInteresado;
    }

    public void setTipoInteresado(String tipoInteresado) {
        this.tipoInteresado = tipoInteresado;
    }
}
