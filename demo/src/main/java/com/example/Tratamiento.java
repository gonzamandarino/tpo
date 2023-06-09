package com.example;

import java.util.Date;

public class Tratamiento extends TipoTratamiento {
    public Tratamiento(Accion control, Veterinario vet, String registro) {
        super(control, vet, registro);
        //TODO Auto-generated constructor stub
    }


    private Date fechaInicio = new Date();
    private Date fechaFin;
    private String comentario;


    @Override
    public void realizarAcciones(){
        for (Accion accion : getControles()) {
            accion.realizarAccion();
        }
    }
    
}