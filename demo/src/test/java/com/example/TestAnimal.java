package com.example;
import com.example.Repositorios.RepoAnimales;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestAnimal {
    private RepoAnimales repoAnimales;

    @Before
    public void setUp() {
        repoAnimales = RepoAnimales.getInstance();
    }

    @After
    public void tearDown(){
        RepoAnimales.getInstance().getAnimales().clear();
    }

    @Test
    public void testRegistrarAnimal() {
        // Arrange
        String nombre = "Max";
        int edad = 3;
        double altura = 0.5;
        double peso = 5.2;
        double condicion = 8.5;
        tipoAnimal tipo = tipoAnimal.DOMESTICO;

        // Act
        Animal animal = new Animal(nombre, edad, altura, peso, condicion, tipo);
        repoAnimales.agregarAnimal(animal);

        // Assert
        List<Animal> animalesRegistrados = repoAnimales.getAnimales();
        assertEquals(1, animalesRegistrados.size());
        assertEquals(animal, animalesRegistrados.get(0));
    }

    @Test
    public void testEliminarAnimal() {
        // Arrange
        Animal animal1 = new Animal("Max", 3, 0.5, 5.2, 8.5, tipoAnimal.DOMESTICO);
        Animal animal2 = new Animal("Luna", 2, 0.4, 3.8, 7.0, tipoAnimal.DOMESTICO);
        repoAnimales.agregarAnimal(animal1);
        repoAnimales.agregarAnimal(animal2);

        // Act
        repoAnimales.eliminarAnimal(animal1);

        // Assert
        List<Animal> animalesActuales = repoAnimales.getAnimales();
        assertEquals(1, animalesActuales.size());
        assertFalse(animalesActuales.contains(animal1));
        assertTrue(animalesActuales.contains(animal2));
    }
}
