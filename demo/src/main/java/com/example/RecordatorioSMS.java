package com.example;

public class RecordatorioSMS implements Recordatorio{
    @Override
    public void recordar(Visitador v, Cliente c, int dias) {
        // Lógica para enviar un recordatorio por SMS
        System.out.println("Enviando recordatorio por SMS...");
    }
}