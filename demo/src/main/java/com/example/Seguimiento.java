package com.example;

import java.util.List;

public class Seguimiento {
    private Visitador visitador;
    private String visita;
    private Recordatorio recordatorio;
    private List<Encuesta> encuestas;

    // Constructor
    public Seguimiento(Visitador visitador, String visita, Recordatorio recordatorio, List<Encuesta> encuestas) {
        this.visitador = visitador;
        this.visita = visita;
        this.recordatorio = recordatorio;
        this.encuestas = encuestas;
    }

    // Métodos getter y setter para acceder a los atributos privados
    public Visitador getVisitador() {
        return visitador;
    }

    public void setVisitador(Visitador visitador) {
        this.visitador = visitador;
    }

    public String getVisita() {
        return visita;
    }

    public void setVisita(String visita) {
        this.visita = visita;
    }

    public Recordatorio getRecordatorio() {
        return recordatorio;
    }

    public void setRecordatorio(Recordatorio recordatorio) {
        this.recordatorio = recordatorio;
    }

    public List<Encuesta> getEncuestas() {
        return encuestas;
    }

    public void setEncuestas(List<Encuesta> encuestas) {
        this.encuestas = encuestas;
    }

    // Método para recordar partes
    public void recordarPartes(Cliente c, int dias) {
        recordatorio.recordar(visitador, c, dias);
    }

    // Método para cambiar el recordatorio
    public void cambiarRecordatorio(Recordatorio r) {
        this.recordatorio = r;
    }
}
