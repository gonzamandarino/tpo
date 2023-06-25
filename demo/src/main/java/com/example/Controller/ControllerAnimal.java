package com.example.Controller;

import com.example.Animal;

public class ControllerAnimal {
    public void cambiarEstadoTratamiento(Animal animal) {

        animal.setEnTratamiento(!animal.isEnTratamiento());

        System.out.println("Estado de tratamiento del animal cambiado exitosamente.");
    }

}

