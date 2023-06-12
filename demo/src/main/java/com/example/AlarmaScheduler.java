package com.example;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AlarmaScheduler {
    private Alarma alarma;
    private ScheduledExecutorService executor;

    public AlarmaScheduler(Alarma alarma) {
        this.alarma = alarma;
        this.executor = Executors.newSingleThreadScheduledExecutor();
    }
    
    public void iniciarScheduler() {

        // Programar la tarea de notificación con la periodicidad especificada
        executor.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                alarma.notificar();
            }
        }, 0, alarma.getPeriodicidad(), TimeUnit.SECONDS);
    }

    public void detenerScheduler() {
        // Detener la ejecución del scheduler
        executor.shutdown();
    }
}