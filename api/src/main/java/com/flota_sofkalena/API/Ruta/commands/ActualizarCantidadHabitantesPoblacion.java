package com.flota_sofkalena.API.Ruta.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Ruta.values.CantidadHabitantes;
import com.flota_sofkalena.API.Ruta.values.PoblacionId;
import com.flota_sofkalena.API.Ruta.values.RutaId;

public class ActualizarCantidadHabitantesPoblacion extends Command {

    private final RutaId rutaId;
    private final PoblacionId poblacionId;
    private final CantidadHabitantes cantidadHabitantes;

    public ActualizarCantidadHabitantesPoblacion(RutaId rutaId, PoblacionId poblacionId, CantidadHabitantes cantidadHabitantes) {
        this.rutaId = rutaId;
        this.poblacionId = poblacionId;
        this.cantidadHabitantes = cantidadHabitantes;
    }

    public RutaId getRutaId() {
        return rutaId;
    }

    public PoblacionId getPoblacionId() {
        return poblacionId;
    }

    public CantidadHabitantes getCantidadHabitantes() {
        return cantidadHabitantes;
    }
}
