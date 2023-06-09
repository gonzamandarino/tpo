package com.example;

import java.util.Date;
import java.util.List;


public class Alarma {
    private Integer periodicidad;
    private List<Accion> acciones;
    private Date fecha_creacion;
    private TipoAlarma tipo;
    private Notificador notif;

    // Constructor
    public Alarma(Integer periodicidad, List<Accion> acciones, Date fecha_creacion, TipoAlarma tipo, Notificador notif) {
        this.periodicidad = periodicidad;
        this.acciones = acciones;
        this.fecha_creacion = fecha_creacion;
        this.tipo = tipo;
        this.notif = notif;
    }

    // Método para notificar la alarma
    public void notificar() {
        notif.notificar();
    }

    // Método para realizar las acciones asociadas a la alarma
    public void realizarAcciones() {
        for (Accion accion : acciones) {
            accion.realizarAccion();
        }
    }
    
    // Método para actualizar la alarma con nuevos valores
    public void actualizarAlarma(Integer periodicidad, List<Accion> acciones, Date fecha_creacion, TipoAlarma tipo, Notificador notif) {
        setPeriodicidad(periodicidad);
        setAcciones(acciones);
        setFecha_creacion(fecha_creacion);
        setTipo(tipo);
        setNotif(notif);
    }

    // Métodos getter y setter para acceder a los atributos privados
    public Integer getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(Integer periodicidad) {
        this.periodicidad = periodicidad;
    }

    public List<Accion> getAcciones() {
        return acciones;
    }

    public void setAcciones(List<Accion> acciones) {
        this.acciones = acciones;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public TipoAlarma getTipo() {
        return tipo;
    }

    public void setTipo(TipoAlarma tipo) {
        this.tipo = tipo;
    }

    public Notificador getNotif() {
        return notif;
    }

    public void setNotif(Notificador notif) {
        this.notif = notif;
    }
}

