package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;


//Por motivos de prueba, se cambia la cadencia de días a segundos.
public class TestSeguimientoScheduler {
    @Test
    public void testRecordarPartesScheduler() throws InterruptedException {
        // Crea un seguimiento con un recordatorio de correo electrónico
        Visitador visitador = new Visitador("Dr. Juan Perez", "juan.perez@example.com","11");
        Recordatorio recordatorio = new RecordatorioEmail();
        final Seguimiento seguimiento = new Seguimiento(visitador, 3, recordatorio,null);

        // Crea un cliente de prueba
        final Cliente cliente = new Cliente("Juan", "Pérez", "Casado", "juan@example.com",
        "123456789", "Empleado", "Tiene otras mascotas", null);

        // Crea un executor de un solo hilo para el scheduler
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        // Variable para contar las veces que se activa el recordatorio
        final AtomicInteger contadorRecordatorio = new AtomicInteger(0);

        // Programa la tarea del scheduler
        executor.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                seguimiento.recordarPartes(cliente,3);
                contadorRecordatorio.incrementAndGet();
            }
        }, 0, 1, TimeUnit.SECONDS);

        // Espera un tiempo suficiente para que se active el recordatorio varias veces
        TimeUnit.SECONDS.sleep(4);

        // Detiene el scheduler y espera a que se completen las tareas pendientes
        executor.shutdown();

        // Verifica que el recordatorio se haya activado al menos 3 veces (según la cadencia establecida)
        Assert.assertTrue(contadorRecordatorio.get() >= 3);
    }
}
