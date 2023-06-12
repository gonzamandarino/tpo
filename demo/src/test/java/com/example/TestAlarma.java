package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.Date;

public class TestAlarma {

    @Test
    public void testNotificar() {
        // Crear una instancia de Alarma
        Alarma alarma = new Alarma(1, new Date(), null, null);

        // Verificar que el contador de notificaciones comienza en 0
        Assert.assertEquals(Integer.valueOf(0), alarma.getContador());

        // Llamar al método notificar
        alarma.notificar();

        // Verificar que el contador de notificaciones se incrementó a 1
        Assert.assertEquals(Integer.valueOf(1), alarma.getContador());
    }

        @Test
        public void testRealizarAcciones() {
            Accion control = new Accion("Control de temperatura", "Realizar medición y ajuste de la temperatura");
            Veterinario vet = new Veterinario("Dr. Juan Perez", "juan.perez@example.com","11");
            String registro = "Registro de temperatura diario";
            Date fechaInicio = new Date();
    
    
            Tratamiento tratamiento = new Tratamiento(control, vet, registro, fechaInicio);
    
            // Crear una instancia de Alarma con las acciones
            Alarma alarma = new Alarma(1, new Date(), tratamiento, null);
    
            // Realizar las acciones asociadas a la alarma
            alarma.realizarAcciones();
    
            // Verificar que se realizaron todas las acciones
            for (Accion accion : tratamiento.getControles()) {
                // Verificar que la acción se realizó
                Assert.assertTrue(accion.isCompleto());
            }
        }
    }
    