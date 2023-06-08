package com.example;

public class Salvaje implements Estado {

    @Override
    public void adoptar(Cliente cliente, Animal animal) {
        System.out.println("No se pueden realizar adopciones de animales salvajes.");
    }
    
}
