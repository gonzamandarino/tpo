package com.example;

import java.util.Date;
import java.util.Calendar;


public class Tratamiento extends TipoTratamiento {

        private Date fechaInicio;
        private Date fechaFin;
        private String comentario;
    
        public Tratamiento(Accion control, Veterinario vet, String registro, Date fechaInicio, String comentario) {
            super(control, vet, registro);
            this.fechaInicio = fechaInicio;
            this.fechaFin = null;
            this.comentario = comentario;
        }


    @Override
    public void finalizarTratamiento() {
        super.finalizarTratamiento();  
        Calendar calendar = Calendar.getInstance();
        this.fechaFin = calendar.getTime();
        System.out.println("Tratamiento finalizado.");
    }
    
}