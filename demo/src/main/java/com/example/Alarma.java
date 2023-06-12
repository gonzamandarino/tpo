package com.example;

import java.util.Date;


public class Alarma {
    private Integer periodicidad;
    private Date fecha_creacion;
    private TipoTratamiento tipo;
    private Notificador notif;
    //para testeos
    private Integer contadorNotificaciones = 0;

    // Constructor
    public Alarma(Integer periodicidad, Date fecha_creacion, TipoTratamiento tipo, Notificador notif) {
        this.periodicidad = periodicidad;
        this.fecha_creacion = fecha_creacion;
        this.tipo = tipo;
        this.notif = notif;
    }

    // Método para notificar la alarma
    public void notificar() {
        contadorNotificaciones++;
        //notif.notificar();
    }

    // Método para realizar las acciones asociadas a la alarma
    public void realizarAcciones() {
        for (Accion accion : tipo.getControles()) {
            accion.realizarAccion();
        }
    }
    
    // Método para actualizar la alarma con nuevos valores
    public void actualizarAlarma(Integer periodicidad, Date fecha_creacion, TipoTratamiento tipo, Notificador notif) {
        setPeriodicidad(periodicidad);
        setFecha_creacion(fecha_creacion);
        setTipo(tipo);
        setNotif(notif);
    }

    // Métodos getter y setter para acceder a los atributos privados
    public Integer getContador(){
        return contadorNotificaciones;
    }
    
    public Integer getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(Integer periodicidad) {
        this.periodicidad = periodicidad;
    }


    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public TipoTratamiento getTipo() {
        return tipo;
    }

    public void setTipo(TipoTratamiento tipo) {
        this.tipo = tipo;
    }

    public Notificador getNotif() {
        return notif;
    }

    public void setNotif(Notificador notif) {
        this.notif = notif;
    }
}

