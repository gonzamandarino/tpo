package com.example.Repositorios;
import java.util.ArrayList;
import java.util.List;

import com.example.Animal;


public class RepoAnimales {
    private static RepoAnimales instance;
    private List<Animal> animales;

    private RepoAnimales() {
        animales = new ArrayList<>();
    }

    public static RepoAnimales getInstance() {
        if (instance == null) {
            instance = new RepoAnimales();
        }
        return instance;
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

    public void eliminarAnimal(Animal animal) {
        animales.remove(animal);
    }
}

