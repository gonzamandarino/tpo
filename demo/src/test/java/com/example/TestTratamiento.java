package com.example;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

public class TestTratamiento {
    @Test
    public void testRealizarAcciones() {
        Accion control = new Accion("Control de temperatura", "Realizar medición y ajuste de la temperatura");
        Veterinario vet = new Veterinario("Dr. Juan Perez", "juan.perez@example.com");
        String registro = "Registro de temperatura diario";
        Date fechaInicio = new Date();
        String comentario = "Tratamiento exitoso";

        Tratamiento tratamiento = new Tratamiento(control, vet, registro, fechaInicio, comentario);

        tratamiento.realizarAcciones();

        // Verificar que las acciones se hayan realizado correctamente
        for (Accion accion : tratamiento.getControles()) {
            Assert.assertTrue(accion.isCompleto());
        }
    }

    @Test
    public void testFinalizarTratamiento() {
        Accion control = new Accion("Control de temperatura", "Realizar medición y ajuste de la temperatura");
        Veterinario vet = new Veterinario("Dr. Juan Perez", "juan.perez@example.com");
        String registro = "Registro de temperatura diario";
        Date fechaInicio = new Date();
        String comentario = "Tratamiento exitoso";

        Tratamiento tratamiento = new Tratamiento(control, vet, registro, fechaInicio, comentario);

        tratamiento.finalizarTratamiento();

        // Verificar que el tratamiento esté finalizado
        Assert.assertTrue(tratamiento.isFinalizado());
    }
}
