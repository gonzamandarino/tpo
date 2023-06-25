package com.example.Controller;

import com.example.Exportador;
import com.example.FichaMedica;
import com.example.TipoTratamiento;

public class ControllerFichaMedica {

    public void exportarFichaMedica(FichaMedica fichaMedica) {
        fichaMedica.exportar();
    }

    public void cambiarExportador(FichaMedica fichaMedica, Exportador exportador) {
        fichaMedica.cambiarExportador(exportador);
    }

    public void guardarTratamiento(FichaMedica fichaMedica, TipoTratamiento tratamiento) {
        fichaMedica.guardarTratamiento(tratamiento);
    }
}
