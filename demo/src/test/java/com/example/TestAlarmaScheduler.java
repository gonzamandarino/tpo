package com.example;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class TestAlarmaScheduler {
    @Test
    public void testIniciarScheduler() {
        // Crear una instancia de Accion
        Accion accion = new Accion("Realizar acción", "Descripción de la acción");
    
        // Crear una lista de acciones y agregar la instancia de Accion
        List<Accion> acciones = new ArrayList<>();
        acciones.add(accion);
    
        // Crear una instancia de Alarma con la lista de acciones
        Alarma alarma = new Alarma(1, acciones, null, null, null);
    
        // Crear una instancia de AlarmaScheduler
        AlarmaScheduler alarmaScheduler = new AlarmaScheduler(alarma);
    
        // Iniciar el scheduler
        alarmaScheduler.iniciarScheduler();
    
        // Esperar un tiempo suficiente para que se ejecute la notificación
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    
        // Verificar que se haya realizado al menos una notificación
        Assert.assertEquals(Integer.valueOf(5), alarma.getContador());

        alarmaScheduler.detenerScheduler();
    }
    
}
