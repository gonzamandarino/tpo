package com.example;

import org.junit.Assert;
import org.junit.Test;
import com.example.Controller.ControllerSeguimiento;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;


public class TestSeguimiento {

    @Test
    public void testRecordarPartes_Email() {
        Visitador visitador = new Visitador("John Doe", "john.doe@example.com","11");
        Integer cadencia = 7;
        Recordatorio recordatorio = new RecordatorioEmail();
        List<Encuesta> encuestas = new ArrayList<>();
        Seguimiento seguimiento = new Seguimiento(visitador, cadencia, recordatorio, encuestas);
        Cliente cliente = new Cliente("Juan", "Pérez", "Casado", "juan@example.com",
                "123456789", "Empleado", "Tiene otras mascotas", null);
        int dias = 3;

        // Redirigir la salida estándar a un objeto ByteArrayOutputStream
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        seguimiento.recordarPartes(cliente, dias);

        // Capturar el texto impreso
        String output = outContent.toString().trim();

        // Verificar el comportamiento esperado del recordatorio
        Assert.assertEquals("Enviando recordatorio por correo electrónico...", output);
    
    }

    @Test
    public void testCambiarRecordatorio() {
        Visitador visitador = new Visitador("John Doe", "john.doe@example.com","11");
        Integer cadencia = 7;
        Recordatorio recordatorio = new RecordatorioEmail();
        List<Encuesta> encuestas = new ArrayList<>();
        Seguimiento seguimiento = new Seguimiento(visitador, cadencia, recordatorio, encuestas);
        Recordatorio nuevoRecordatorio = new RecordatorioSMS();
        ControllerSeguimiento controllerSeguimiento = new ControllerSeguimiento();

        seguimiento.cambiarRecordatorio(nuevoRecordatorio);

        // Verificar que el recordatorio haya sido cambiado correctamente
        Assert.assertEquals(nuevoRecordatorio, seguimiento.getRecordatorio());
        controllerSeguimiento.cambiarRecordatorio(seguimiento, nuevoRecordatorio);
        Assert.assertEquals(nuevoRecordatorio, seguimiento.getRecordatorio());
    }

    @Test
    public void testAgregarEncuesta() {
        Visitador visitador = new Visitador("John Doe", "john.doe@example.com","11");
        Integer cadencia = 7;
        Recordatorio recordatorio = new RecordatorioEmail();
        List<Encuesta> encuestas = new ArrayList<>();
        Seguimiento seguimiento = new Seguimiento(visitador, cadencia, recordatorio, encuestas);
        Encuesta encuesta = new Encuesta(null,null,null);
        ControllerSeguimiento controllerSeguimiento = new ControllerSeguimiento();

        seguimiento.agregarEncuesta(encuesta, Respuesta.MALO, Respuesta.REGULAR, Respuesta.BUENO);

        // Verificar que la encuesta se haya agregado correctamente
        Assert.assertEquals(1, seguimiento.getEncuestas().size());
        Assert.assertEquals(encuesta, seguimiento.getEncuestas().get(0));
        // Verificar que las respuestas se hayan establecido correctamente
        Assert.assertEquals(Respuesta.MALO, encuesta.getEstado());
        Assert.assertEquals(Respuesta.REGULAR, encuesta.getLimpieza());
        Assert.assertEquals(Respuesta.BUENO, encuesta.getAmbiente());

        controllerSeguimiento.agregarEncuesta(seguimiento, encuesta, Respuesta.MALO, Respuesta.REGULAR, Respuesta.BUENO);
        Assert.assertEquals(2, seguimiento.getEncuestas().size());
        Assert.assertEquals(encuesta, seguimiento.getEncuestas().get(1));
        Assert.assertEquals(Respuesta.MALO, encuesta.getEstado());
        Assert.assertEquals(Respuesta.REGULAR, encuesta.getLimpieza());
        Assert.assertEquals(Respuesta.BUENO, encuesta.getAmbiente());
    }

    @Test
    public void testTerminarSeguimiento() {
        Visitador visitador = new Visitador("John Doe", "john.doe@example.com","11");
        Integer cadencia = 7;
        Recordatorio recordatorio = new RecordatorioEmail();
        List<Encuesta> encuestas = new ArrayList<>();
        Seguimiento seguimiento = new Seguimiento(visitador, cadencia, recordatorio, encuestas);
        ControllerSeguimiento controllerSeguimiento = new ControllerSeguimiento();

        seguimiento.terminarSeguimiento();

        // Verificar que el seguimiento esté finalizado
        Assert.assertTrue(seguimiento.isFinalizado());

        controllerSeguimiento.terminarSeguimiento(seguimiento);
        Assert.assertTrue(seguimiento.isFinalizado());
    }
}
