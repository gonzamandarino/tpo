package com.example;

import java.util.Date;

public class Tratamiento implements TipoTratamiento {
    private Date fechaInicio;
    private Date fechaFin;
    private String comentario;

    public Tratamiento(Date fechaInicio, Date fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    @Override
    public void realizarAcciones(){
        controles.realizarAccion();
    }
    
}