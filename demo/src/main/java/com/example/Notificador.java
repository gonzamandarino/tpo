package com.example;

public class Notificador {
    private IAdapterNotificador n;

    public Notificador(IAdapterNotificador n) {
        this.n = n;
    }

    // Método para notificar
    public void notificar() {
        //n.notificar();
    }

    // Método para cambiar el adaptador de notificación
    public void cambiarAdapter(IAdapterNotificador nuevoAdapter) {
        this.n = nuevoAdapter;
    }
}
