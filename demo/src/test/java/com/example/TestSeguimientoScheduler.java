package com.example;


import com.example.Controller.ControllerSeguimiento;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class TestSeguimientoScheduler {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream originalOutput = System.out;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @After
    public void tearDown() {
        System.setOut(originalOutput);
    }

    @Test
    public void testIniciarRecordatorio() throws InterruptedException {
        // Arrange
        Seguimiento seguimiento = Mockito.mock(Seguimiento.class);
        Cliente cliente = Mockito.mock(Cliente.class);
        int dias = 1;
        ControllerSeguimiento controllerSeguimiento = new ControllerSeguimiento(seguimiento, cliente, dias);

        // Act
        controllerSeguimiento.iniciarRecordatorio();

        // Espera un tiempo suficiente para que se active el recordatorio
        TimeUnit.SECONDS.sleep(2);

        // Assert
        Mockito.verify(seguimiento, Mockito.atLeastOnce()).recordarPartes(cliente);
    }

    @Test
    public void testDetenerRecordatorioDiario() {
        // Arrange
        Seguimiento seguimiento = Mockito.mock(Seguimiento.class);
        Cliente cliente = Mockito.mock(Cliente.class);
        int dias = 7;
        ControllerSeguimiento controllerSeguimiento = new ControllerSeguimiento(seguimiento, cliente, dias);

        // Act
        controllerSeguimiento.detenerRecordatorioDiario();

        // Assert
        assertTrue(outputStreamCaptor.toString().trim().isEmpty());
    }

    @Test
    public void testCambiarRecordatorio() {
        // Arrange
        Seguimiento seguimiento = Mockito.mock(Seguimiento.class);
        Cliente cliente = Mockito.mock(Cliente.class);
        int dias = 7;
        ControllerSeguimiento controllerSeguimiento = new ControllerSeguimiento(seguimiento, cliente, dias);

        Recordatorio nuevoRecordatorio = Mockito.mock(Recordatorio.class);

        // Act
        controllerSeguimiento.cambiarRecordatorio(nuevoRecordatorio);

        // Assert
        Mockito.verify(seguimiento, Mockito.times(1)).cambiarRecordatorio(nuevoRecordatorio);
    }
}
