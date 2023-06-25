package com.example;

public class RecordatorioEmail implements Recordatorio{
    @Override
    public void recordar( Cliente c, int dias) {
        // Lógica para enviar un recordatorio por correo electrónico
        System.out.println("Enviando recordatorio por correo electrónico...");
    }
}