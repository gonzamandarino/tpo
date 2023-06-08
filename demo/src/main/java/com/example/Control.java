package com.example;

public class Control implements TipoTratamiento {
    @Override
    public void realizarAcciones() {
        System.out.println("Realizando acción de Control");
        // Aquí se puede implementar la lógica específica para la acción de Control
        finalizarTratamiento();
    }
}
