package com.example;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

public class TestFichaMedica {

    @Test
    public void testActualizarTratamientos_AnimalEnTratamiento() {
        Animal animal = new Animal("Roman", 0, 1.5, 5, 10.0, new Domestico());
        List<TipoTratamiento> tratamientos = new ArrayList<>();
        FichaMedica fichaMedica = new FichaMedica(tratamientos, animal, null, null);

        Tratamiento tratamiento = new Tratamiento(new Accion("Accion 1", "Descripcion 1"), new Veterinario("", ""), "", new Date(), "");
        tratamientos.add(tratamiento);

        fichaMedica.actualizarTratamientos();

        assertEquals(EnTratamiento.class, animal.getEstado().getClass());
    }

    @Test
    public void testActualizarTratamientos_AnimalEstadoAnterior() {
        Animal animal =  new Animal("Roman", 0, 1.5, 5, 10.0, new Domestico());
        List<TipoTratamiento> tratamientos = new ArrayList<>();
        FichaMedica fichaMedica = new FichaMedica(tratamientos, animal, null, null);

        Tratamiento tratamiento = new Tratamiento(new Accion("Accion 1", "Descripcion 1"), new Veterinario("", ""), "", new Date(), "");
        fichaMedica.guardarTratamiento(tratamiento);
        tratamiento.finalizarTratamiento();

        fichaMedica.actualizarTratamientos();

        assertEquals(Domestico.class, animal.getEstado().getClass());
    }

    @Test
    public void testGuardarTratamiento() {
        Animal animal =  new Animal("Roman", 0, 1.5, 5, 10.0, new Domestico());
        List<TipoTratamiento> tratamientos = new ArrayList<>();
        FichaMedica fichaMedica = new FichaMedica(tratamientos, animal, null, null);

        Tratamiento tratamiento = new Tratamiento(new Accion("Accion 1", "Descripcion 1"), new Veterinario("", ""), "", new Date(), "");
        fichaMedica.guardarTratamiento(tratamiento);

        assertEquals(1, tratamientos.size());
        assertEquals(fichaMedica, tratamiento.getObserver());
    }

}
