package com.example;

import org.junit.Assert;
import org.junit.Test;

public class TestControl {
    @Test
    public void testRealizarAcciones() {
        Accion control = new Accion("Control de alimentación", "Realizar seguimiento y ajuste de la alimentación");
        Veterinario vet = new Veterinario("Dra. Maria Lopez", "maria.lopez@example.com");
        String registro = "Registro de consumo de alimentos";

        Control controlTratamiento = new Control(control, vet, registro);

        controlTratamiento.realizarAcciones();

        // Verificar que la acción se haya realizado correctamente
        for (Accion accion : controlTratamiento.getControles()) {
            Assert.assertTrue(accion.isCompleto());
        }
    }

    @Test
    public void testFinalizarTratamiento() {
        Accion control = new Accion("Control de alimentación", "Realizar seguimiento y ajuste de la alimentación");
        Veterinario vet = new Veterinario("Dra. Maria Lopez", "maria.lopez@example.com");
        String registro = "Registro de consumo de alimentos";

        Control controlTratamiento = new Control(control, vet, registro);

        controlTratamiento.finalizarTratamiento();

        // Verificar que el tratamiento esté finalizado
        Assert.assertTrue(controlTratamiento.isFinalizado());
    }
}
