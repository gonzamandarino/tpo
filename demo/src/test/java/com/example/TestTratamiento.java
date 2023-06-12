package com.example;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

public class TestTratamiento {

    @Test
    public void testRealizarAcciones() {
        Accion accion1 = new Accion("Accion 1", "Descripcion 1");
        Accion accion2 = new Accion("Accion 2", "Descripcion 2");

        Tratamiento tratamiento = new Tratamiento(accion1, new Veterinario("", "","11"), "", new Date());

        tratamiento.agregarControl(accion2);

        tratamiento.realizarAcciones();

        // Verificar que las acciones se hayan realizado correctamente
        for (Accion accion : tratamiento.getControles()) {
            assertTrue(accion.isCompleto());
        }
    }

    @Test
    public void testFinalizarTratamiento() {
        Accion control = new Accion("Control de temperatura", "Realizar medición y ajuste de la temperatura");
        Veterinario vet = new Veterinario("Dr. Juan Perez", "juan.perez@example.com","11");
        String registro = "Registro de temperatura diario";
        Date fechaInicio = new Date();
        String comentario = "Tratamiento exitoso";
        Animal animal = new Animal("Roman", 0, 1.5, 5, 10.0, new Domestico());
        List<TipoTratamiento> tratamientos = new ArrayList<>();
        FichaMedica fichaMedica = new FichaMedica(tratamientos, animal, null, null);


        Tratamiento tratamiento = new Tratamiento(control, vet, registro, fechaInicio);

        fichaMedica.guardarTratamiento(tratamiento);

        tratamiento.finalizarTratamiento();

        // Verificar que el tratamiento esté finalizado
        assertTrue(tratamiento.isFinalizado());
    }
}

