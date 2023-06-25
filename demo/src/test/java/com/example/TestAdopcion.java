package com.example;


import com.example.Controller.ControllerAdopcion;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestAdopcion {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream originalOutput = System.out;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @After
    public void tearDown() {
        System.setOut(originalOutput);
    }

    @Test
    public void testSolicitarAdopcion_MaximoAnimalesAdoptados_NoSePuedeAdoptar() {

        Animal animal = new Animal("Perro", 5, 1.2, 150.0, 8.5, tipoAnimal.DOMESTICO);
        Animal animal2 = new Animal("Gato", 5, 1.2, 150.0, 8.5, tipoAnimal.DOMESTICO);
        List<Animal> listaAnimales = new ArrayList<>();
        listaAnimales.add(animal);
        listaAnimales.add(animal2);
        Cliente cliente = new Cliente("Juan", "Pérez", "Casado", "juan@example.com",
                "123456789", "Empleado", "Tiene otras mascotas", listaAnimales);
        Animal animal3 = new Animal("Conejo", 1, 0.3, 2.0, 7.5, tipoAnimal.DOMESTICO);
        String motivoAdopcion = "Me encantan los conejos";
        String tipoInteresado = "Conejos";
        ControllerAdopcion controller = new ControllerAdopcion();


        controller.solicitarAdopcion(cliente, animal3, motivoAdopcion, tipoInteresado);


        String expectedOutput = "No se puede adoptar otro animal. Ya tienes dos.";
        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testSolicitarAdopcion_AnimalEnTratamiento_NoSePuedeAdoptar() {

        List<Animal> listaAnimales = new ArrayList<>();
        Cliente cliente = new Cliente("Juan", "Pérez", "Casado", "juan@example.com",
                "123456789", "Empleado", "Tiene otras mascotas", listaAnimales);
        Animal animal = new Animal("León", 5, 1.2, 150.0, 8.5, tipoAnimal.DOMESTICO);
        animal.setEnTratamiento(true);
        String motivoAdopcion = "Quiero un compañero para mi perro";
        String tipoInteresado = "Perros";
        ControllerAdopcion controller = new ControllerAdopcion();


        controller.solicitarAdopcion(cliente, animal, motivoAdopcion, tipoInteresado);


        String expectedOutput = "No se puede adoptar, está en tratamiento.";
        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testSolicitarAdopcion_AnimalSalvaje_NoSePuedeAdoptar() {
 
        List<Animal> listaAnimales = new ArrayList<>();
        Cliente cliente = new Cliente("Juan", "Pérez", "Casado", "juan@example.com",
                "123456789", "Empleado", "Tiene otras mascotas", listaAnimales);
        Animal animal = new Animal("León", 5, 1.2, 150.0, 8.5, tipoAnimal.SALVAJE);
        String motivoAdopcion = "Quiero un compañero para mi perro";
        String tipoInteresado = "Leones";
        ControllerAdopcion controller = new ControllerAdopcion();

        controller.solicitarAdopcion(cliente, animal, motivoAdopcion, tipoInteresado);

  
        String expectedOutput = "No se puede adoptar, es salvaje.";
        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }

    @Test
    public void testSolicitarAdopcion_AdopcionExitosa() {

        List<Animal> listaAnimales = new ArrayList<>();
        Cliente cliente = new Cliente("Juan", "Pérez", "Casado", "juan@example.com",
                "123456789", "Empleado", "Tiene otras mascotas", listaAnimales);
        Animal animal = new Animal("Perro", 2, 0.6, 10.0, 9.0, tipoAnimal.DOMESTICO);
        String motivoAdopcion = "Quiero un compañero para mi perro";
        String tipoInteresado = "Perros";
        ControllerAdopcion controller = new ControllerAdopcion();

        controller.solicitarAdopcion(cliente, animal, motivoAdopcion, tipoInteresado);


        String expectedOutput = "Solicitud de adopción realizada con éxito.";
        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }
}
