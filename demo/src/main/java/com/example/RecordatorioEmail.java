package com.example;

public class RecordatorioEmail implements Recordatorio{
    @Override
    public void recordar(Visitador v, Cliente c, int dias) {
        // Lógica para enviar un recordatorio por correo electrónico
        System.out.println("Enviando recordatorio por correo electrónico...");
    }
}