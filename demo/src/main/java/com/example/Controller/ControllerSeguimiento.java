package com.example.Controller;

import com.example.Cliente;
import com.example.Recordatorio;
import com.example.Seguimiento;
import com.example.SeguimientoScheduler;

public class ControllerSeguimiento {

    private SeguimientoScheduler seguimientoScheduler;

    public ControllerSeguimiento(Seguimiento seguimiento, Cliente cliente, int dias) {

        this.seguimientoScheduler = new SeguimientoScheduler(seguimiento, cliente, dias);
    }

    public void iniciarRecordatorio() {
        seguimientoScheduler.iniciarRecordatorio();
    }

    public void detenerRecordatorioDiario() {
        seguimientoScheduler.detenerRecordatorioDiario();
    }

    public void cambiarRecordatorio(Recordatorio nuevoRecordatorio) {
        seguimientoScheduler.getSeguimiento().cambiarRecordatorio(nuevoRecordatorio);
    }
}
