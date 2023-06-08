package com.example;

public class EnTratamiento implements Estado {

    @Override
    public void adoptar(Cliente cliente, Animal animal) {
        System.out.println("No se pueden realizar adopciones de animales en tratamiento.");
    }
    
}
