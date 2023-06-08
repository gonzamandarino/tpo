package com.example;

import java.util.List;

public class Domestico implements Estado {

    @Override
    public void adoptar(Cliente cliente, Animal animal) {
        List<Animal> nw ;
        nw = cliente.getAnimalesAdoptados();
        nw.add(animal);
        cliente.setAnimalesAdoptados(nw);
        System.out.println("Animal " + animal.getNombre() + " adoptado por " + cliente.getNombre() + " " + cliente.getApellido());
    }
    
}
