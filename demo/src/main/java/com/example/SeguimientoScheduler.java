package com.example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SeguimientoScheduler {
    private ScheduledExecutorService executor;
    private Seguimiento seguimiento;
    private Cliente cliente;
    private int dias;

    public SeguimientoScheduler(Seguimiento seguimiento, Cliente cliente, int dias) {
        this.seguimiento = seguimiento;
        this.cliente = cliente;
        this.dias = dias;
        this.executor = Executors.newSingleThreadScheduledExecutor();
    }

    public void iniciarRecordatorioDiario() {
        executor.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                seguimiento.recordarPartes(cliente, dias);
            }
        }, 0, 1, TimeUnit.DAYS);
        
    }

    public void detenerRecordatorioDiario() {
        executor.shutdown();
    }
}
