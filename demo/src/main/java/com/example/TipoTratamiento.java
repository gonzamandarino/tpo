package com.example;

import java.util.Date;

public class TipoTratamiento implements TipoAlarma {
    private Date fechaInicio;
    private Date fechaFin;
    private String comentario;

    public TipoTratamiento(Date fechaInicio, Date fechaFin, String comentario) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.comentario = comentario;
    }

    @Override
    public void realizarAccion() {
        System.out.println("Realizando acción de Tratamiento");
        System.out.println("Fecha de inicio: " + fechaInicio);
        System.out.println("Fecha de fin: " + fechaFin);
        System.out.println("Comentario: " + comentario);
        // Aquí se puede implementar la lógica específica para la acción de Tratamiento
    }
}