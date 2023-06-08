package com.example;

public class Accion {
    private String nombreAccion;
    private String descripcionAccion;
    private Boolean completado = false;

    // Constructor
    public Accion(String nombreAccion, String descripcionAccion) {
        this.nombreAccion = nombreAccion;
        this.descripcionAccion = descripcionAccion;
    }

    // Método para realizar la acción
    public void realizarAccion() {
        // Lógica para llevar a cabo la acción
        System.out.println("Realizando acción: " + nombreAccion);
        System.out.println("Descripción de la acción: " + descripcionAccion);
        completar();
        System.out.println("Accion Finalizada.");
    }

    // Métodos getter y setter para acceder a los atributos privados
    public String getNombreAccion() {
        return nombreAccion;
    }

    public void setNombreAccion(String nombreAccion) {
        this.nombreAccion = nombreAccion;
    }

    public String getDescripcionAccion() {
        return descripcionAccion;
    }

    public void setDescripcionAccion(String descripcionAccion) {
        this.descripcionAccion = descripcionAccion;
    }

    public Boolean isCompleto(){
        return completado;
    }

    public void completar(){
        completado = true;
    }
}
