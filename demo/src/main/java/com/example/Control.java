package com.example;

public class Control extends TipoTratamiento {
    public Control(Accion control, Veterinario vet, String registro) {
        super(control, vet, registro);
    }

    @Override
    public void realizarAcciones() {
        System.out.println("Realizando acción de Control");
        super.realizarAcciones();
        // Aquí se puede implementar la lógica específica para la acción de Control
        finalizarTratamiento();
        super.getObserver().actualizarTratamientos();
    }
}
