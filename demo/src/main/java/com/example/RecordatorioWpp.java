package com.example;

public class RecordatorioWpp implements Recordatorio {
    @Override
    public void recordar(Visitador v, Cliente c, int dias) {
        // Lógica para enviar un recordatorio por WhatsApp
        System.out.println("Enviando recordatorio por WhatsApp...");
    }
}
