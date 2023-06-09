package com.example;

import java.util.List;

public class FichaMedica {
    private List<TipoTratamiento> tratamientos;
    private Animal animal;
    private Seguimiento seguimiento;
    private Exportador exp;

    // Constructor
    public FichaMedica(List<TipoTratamiento> tratamientos, Animal animal, Seguimiento seguimiento, Exportador exp) {
        this.tratamientos = tratamientos;
        this.animal = animal;
        this.seguimiento = seguimiento;
        this.exp = exp;
    }


    // Métodos getter y setter para acceder a los atributos privados
    public List<TipoTratamiento> getTratamientos() {
        return tratamientos;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Seguimiento getSeguimiento() {
        return seguimiento;
    }

    public void setSeguimiento(Seguimiento seguimiento) {
        this.seguimiento = seguimiento;
    }

    public Exportador getExp() {
        return exp;
    }

    public void setExp(Exportador exp) {
        this.exp = exp;
    }

    // Método para exportar la ficha médica
    public void exportar() {
        // Lógica de exportación de la ficha médica
        if (exp != null) {
            exp.exportar();
        } else {
            System.out.println("No se puede exportar la ficha médica. No se ha especificado un exportador.");
        }
    }

    // Método para cambiar el exportador
    public void cambiarExportador(Exportador e) {
        setExp(e);
    }


    public void guardarTratamiento(TipoTratamiento t){
        this.tratamientos.add(t);
    }
}

