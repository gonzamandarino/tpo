package com.example;

import java.util.List;

public class Seguimiento {
    private Integer cadencia;
    private Recordatorio recordatorio;
    private List<Encuesta> encuestas;
    private Boolean finalizado = false;

    // Constructor
    public Seguimiento(Integer cadencia, Recordatorio recordatorio, List<Encuesta> encuestas) {

        this.cadencia = cadencia;
        this.recordatorio = recordatorio;
        this.encuestas = encuestas;
    }
    
    // Método para recordar partes
    public void recordarPartes(Cliente c) {
        recordatorio.recordar(c);
    }

    // Método para cambiar el recordatorio
    public void cambiarRecordatorio(Recordatorio r) {
        setRecordatorio(r);
    }

    public void agregarEncuesta(Encuesta e,Respuesta estado, Respuesta limpieza, Respuesta ambiente){
        e.responderEncuesta(estado, limpieza, ambiente);
        this.encuestas.add(e);
    }

    public void terminarSeguimiento(){
        this.finalizado = true;
    }

    // Métodos getter y setter para acceder a los atributos privados
    public Integer getCadencia() {
        return cadencia;
    }

    public void setCadencia(Integer c) {
        this.cadencia = c;
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

    public Boolean isFinalizado(){
        return finalizado;
    }

}
