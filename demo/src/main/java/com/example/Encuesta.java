package com.example;

public class Encuesta {
    private Respuesta estado;
    private Respuesta limpieza;
    private Respuesta ambiente;

    // Constructor
    public Encuesta(Respuesta estado, Respuesta limpieza, Respuesta ambiente) {
        this.estado = estado;
        this.limpieza = limpieza;
        this.ambiente = ambiente;
    }

    public void responderEncuesta(Respuesta respuestaEstado, Respuesta respuestaLimpieza, Respuesta respuestaAmbiente) {
        setEstado(respuestaEstado);
        setLimpieza(respuestaLimpieza);
        setAmbiente(respuestaAmbiente);
    }

    // Métodos getter y setter para acceder a los atributos privados
    public Respuesta getEstado() {
        return estado;
    }

    public void setEstado(Respuesta estado) {
        this.estado = estado;
    }

    public Respuesta getLimpieza() {
        return limpieza;
    }

    public void setLimpieza(Respuesta limpieza) {
        this.limpieza = limpieza;
    }

    public Respuesta getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Respuesta ambiente) {
        this.ambiente = ambiente;
    }
}
