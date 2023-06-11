package com.example;

import java.util.ArrayList;
import java.util.List;

public abstract class TipoTratamiento {
    private List<Accion> controles = new ArrayList<>();;
    private List<Veterinario> veterinarios = new ArrayList<>();;
    private List<String> registro = new ArrayList<>();;
    private boolean finalizado;
    private FichaMedica ficha;
    
    // Constructor
    public TipoTratamiento(Accion control, Veterinario vet, String registro) {
        this.controles.add(control);
        this.veterinarios.add(vet);
        this.registro.add(registro);
        this.finalizado = false;
    }

    public void agregarObserver(FichaMedica f){
        this.ficha = f;
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
        this.ficha.actualizarTratamientos();
    }
    
    public void realizarAcciones(){
        for (Accion accion : getControles()) {
            accion.realizarAccion();
        }
    }

    // Métodos getter y setter para acceder a los atributos privados
    public List<Accion> getControles() {
        return controles;
    }

    public List<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public List<String> getRegistro() {
        return registro;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public FichaMedica getObserver(){
        return ficha;
    }
}
