package com.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tratamiento {
    private List<Accion> controles;
    private List<Veterinario> veterinarios;
    private String registro;
    private boolean finalizado;
    private Date fechaInicio;
    private Date fechaFin;

    // Constructor
    public Tratamiento(String registro, Date fechaInicio) {
        this.controles = new ArrayList<>();
        this.veterinarios = new ArrayList<>();
        this.registro = registro;
        this.finalizado = false;
        this.fechaInicio = fechaInicio;
        this.fechaFin = null;
    }

    // Método para agregar un control al tratamiento
    public void agregarControl(Accion control) {
        controles.add(control);
    }

    // Método para agregar un veterinario al tratamiento
    public void agregarVeterinario(Veterinario veterinario) {
        veterinarios.add(veterinario);
    }

    // Método para finalizar el tratamiento
    public void finalizarTratamiento() {
        finalizado = true;
        fechaFin = new Date();
    }

    // Métodos getter y setter para acceder a los atributos privados
    public List<Accion> getControles() {
        return controles;
    }

    public List<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public String getRegistro() {
        return registro;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }
}
