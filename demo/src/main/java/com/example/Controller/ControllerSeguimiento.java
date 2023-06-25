package com.example.Controller;

import com.example.Encuesta;
import com.example.Recordatorio;
import com.example.Respuesta;
import com.example.Seguimiento;

public class ControllerSeguimiento {
    public void agregarEncuesta(Seguimiento seguimiento, Encuesta encuesta, Respuesta estado,
                                Respuesta limpieza, Respuesta ambiente) {

        encuesta.responderEncuesta(estado, limpieza, ambiente);

        seguimiento.getEncuestas().add(encuesta);

        System.out.println("Encuesta agregada exitosamente.");
    }

    public void terminarSeguimiento(Seguimiento seguimiento) {

        seguimiento.terminarSeguimiento();

        System.out.println("Seguimiento finalizado.");
    }

    public void cambiarRecordatorio(Seguimiento seguimiento, Recordatorio nuevoRecordatorio) {
        seguimiento.setRecordatorio(nuevoRecordatorio);
        System.out.println("Recordatorio cambiado exitosamente.");
    }
}
