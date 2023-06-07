package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

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
    public void testAdoptar_AnimalSalvaje_NoSePuedeAdoptar() {
        // Arrange
        Cliente cliente = new Cliente("Juan", "Pérez", "Casado", "juan@example.com",
                "123456789", "Empleado", "Tiene otras mascotas", null);
        Animal animal = new Animal("León", 5, 1.2, 150.0, 8.5, true);
        String motivoAdopcion = "Quiero un compañero para mi perro";
        String tipoInteresado = "Perros";
        Adopcion adopcion = new Adopcion(cliente, animal, motivoAdopcion, tipoInteresado);
        
        // Act
        adopcion.adoptar();
        
        // Assert
        String expectedOutput = "No se pueden realizar adopciones de animales salvajes.";
        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }
    
    @Test
    public void testAdoptar_MaximoAnimalesAdoptados_NoSePuedeAdoptar() {
        // Arrange
        Animal animal = new Animal("Perro", 5, 1.2, 150.0, 8.5, false);
        Animal animal2 = new Animal("Gato", 5, 1.2, 150.0, 8.5, false);
        List<Animal> listaAnimales = new ArrayList<>();
        listaAnimales.add(animal);
        listaAnimales.add(animal2);
        Cliente cliente = new Cliente("Juan", "Pérez", "Casado", "juan@example.com",
                "123456789", "Empleado", "Tiene otras mascotas", listaAnimales);
        cliente.getAnimalesAdoptados().add(new Animal("Perro", 3, 0.8, 15.0, 9.0, false));
        cliente.getAnimalesAdoptados().add(new Animal("Gato", 2, 0.5, 5.0, 8.0, false));
        Animal animal3 = new Animal("Conejo", 1, 0.3, 2.0, 7.5, false);
        String motivoAdopcion = "Me encantan los conejos";
        String tipoInteresado = "Conejos";
        Adopcion adopcion = new Adopcion(cliente, animal3, motivoAdopcion, tipoInteresado);
        
        // Act
        adopcion.adoptar();
        
        // Assert
        String expectedOutput = "No se pueden realizar mas adopciones.";
        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }
    
    @Test
    public void testAdoptar_AdopcionExitosa() {
        // Arrange
        List<Animal> listaAnimales = new ArrayList<>();
        Cliente cliente = new Cliente("Juan", "Pérez", "Casado", "juan@example.com",
                "123456789", "Empleado", "Tiene otras mascotas", listaAnimales);
        Animal animal = new Animal("Perro", 2, 0.6, 10.0, 9.0, false);
        String motivoAdopcion = "Quiero un compañero para mi perro";
        String tipoInteresado = "Perros";
        Adopcion adopcion = new Adopcion(cliente, animal, motivoAdopcion, tipoInteresado);
        
        // Act
        adopcion.adoptar();
        
        // Assert
        String expectedOutput = "Animal Perro adoptado por Juan Pérez";
        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }
}

