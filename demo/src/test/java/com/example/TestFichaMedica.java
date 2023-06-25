package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import com.example.Controller.ControllerFichaMedica;

import java.util.ArrayList;
import java.util.List;

public class TestFichaMedica {


    @Test
    public void testExportarFichaMedica() {
        List<TipoTratamiento> tratamientos = new ArrayList<>();
        Animal animal = new Animal("Max", 5, 0.8, 10.0, 4.5, tipoAnimal.DOMESTICO);
        Seguimiento seguimiento = Mockito.mock(Seguimiento.class);
        Exportador exportador = Mockito.mock(Exportador.class);

        ControllerFichaMedica controller = new ControllerFichaMedica();

        FichaMedica fichaMedica = new FichaMedica(tratamientos, animal, seguimiento, exportador);

        controller.exportarFichaMedica(fichaMedica);

        Mockito.verify(exportador, Mockito.times(1)).exportar();
    }


    @Test
    public void testAgregarTratamiento() {
        List<TipoTratamiento> tratamientos = new ArrayList<>();
        Animal animal = Mockito.mock(Animal.class);
        Seguimiento seguimiento = Mockito.mock(Seguimiento.class);
        Exportador exportador = Mockito.mock(Exportador.class);

        FichaMedica fichaMedica = new FichaMedica(tratamientos, animal, seguimiento, exportador);
        ControllerFichaMedica controller = new ControllerFichaMedica();

        TipoTratamiento tratamiento = Mockito.mock(TipoTratamiento.class);
        controller.guardarTratamiento(fichaMedica, tratamiento);

        List<TipoTratamiento> tratamientosActuales = fichaMedica.getTratamientos();
        Assert.assertEquals(1, tratamientosActuales.size());
        Assert.assertTrue(tratamientosActuales.contains(tratamiento));
    }

    @Test
    public void testCambiarExportador() {
        List<TipoTratamiento> tratamientos = new ArrayList<>();
        Animal animal = Mockito.mock(Animal.class);
        Seguimiento seguimiento = Mockito.mock(Seguimiento.class);
        Exportador exportador = Mockito.mock(Exportador.class);

        FichaMedica fichaMedica = new FichaMedica(tratamientos, animal, seguimiento, exportador);
        ControllerFichaMedica controller = new ControllerFichaMedica();

        Exportador nuevoExportador = Mockito.mock(Exportador.class);
        controller.cambiarExportador(fichaMedica, nuevoExportador);

        Exportador exportadorActual = fichaMedica.getExp();
        Assert.assertEquals(nuevoExportador, exportadorActual);
    }
}
