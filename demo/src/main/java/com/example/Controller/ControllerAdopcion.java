package com.example.Controller;

import com.example.Adopcion;
import com.example.Animal;
import com.example.Cliente;
import com.example.tipoAnimal;

public class ControllerAdopcion {
    
    public void solicitarAdopcion(Cliente cliente, Animal animal, String motivoAdopcion, String tipoInteresado) {

        if (cliente.cantAnimalesAdoptados() >= 2) {

            System.out.println("No se puede adoptar otro animal. Ya tienes dos.");
            return;
        }

        if (animal.isEnTratamiento()){

            System.out.println("No se puede adoptar, está en tratamiento.");
            return;    
        }

        if (animal.getTipo().equals(tipoAnimal.SALVAJE)){
            System.out.println("No se puede adoptar, es salvaje.");
            return;
        }

        // Crear una instancia de Adopcion y realizar las operaciones necesarias
        Adopcion adopcion = new Adopcion(cliente, animal, motivoAdopcion, tipoInteresado);

        System.out.println("Solicitud de adopción realizada con éxito.");
    }
}
