package com.example;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestControl {
    @Test
    public void testRealizarAcciones() {
        Accion control = new Accion("Control de alimentación", "Realizar seguimiento y ajuste de la alimentación");
        Veterinario vet = new Veterinario("Dra. Maria Lopez", "maria.lopez@example.com","11");
        String registro = "Registro de consumo de alimentos";
        Animal animal = new Animal("Roman", 0, 1.5, 5, 10.0, tipoAnimal.DOMESTICO);
        List<TipoTratamiento> tratamientos = new ArrayList<>();
        FichaMedica fichaMedica = new FichaMedica(tratamientos, animal, null, null);

        Control controlTratamiento = new Control(control, vet, registro);
        
        fichaMedica.guardarTratamiento(controlTratamiento);

        controlTratamiento.realizarAcciones();

        // Verificar que la acción se haya realizado correctamente
        for (Accion accion : controlTratamiento.getControles()) {
            Assert.assertTrue(accion.isCompleto());
        }

        // Verificar que el tratamiento esté finalizado
        Assert.assertTrue(controlTratamiento.isFinalizado());
    }

    @Test
    public void testFinalizarTratamiento() {
        Accion control = new Accion("Control de alimentación", "Realizar seguimiento y ajuste de la alimentación");
        Veterinario vet = new Veterinario("Dra. Maria Lopez", "maria.lopez@example.com","11");
        String registro = "Registro de consumo de alimentos";
        Animal animal = new Animal("Roman", 0, 1.5, 5, 10.0, tipoAnimal.DOMESTICO);
        List<TipoTratamiento> tratamientos = new ArrayList<>();
        FichaMedica fichaMedica = new FichaMedica(tratamientos, animal, null, null);

        Control controlTratamiento = new Control(control, vet, registro);
        
        fichaMedica.guardarTratamiento(controlTratamiento);

        controlTratamiento.finalizarTratamiento();

        // Verificar que el tratamiento esté finalizado
        Assert.assertTrue(controlTratamiento.isFinalizado());
    }
}
