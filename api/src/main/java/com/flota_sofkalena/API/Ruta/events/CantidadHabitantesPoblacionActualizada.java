package com.flota_sofkalena.API.Ruta.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Ruta.values.CantidadHabitantes;
import com.flota_sofkalena.API.Ruta.values.PoblacionId;

public class CantidadHabitantesPoblacionActualizada extends DomainEvent {

    private final PoblacionId poblacionId;
    private final CantidadHabitantes cantidadHabitantes;

    public CantidadHabitantesPoblacionActualizada(PoblacionId poblacionId, CantidadHabitantes cantidadHabitantes) {
        super("flota_sofkalena.ruta.cantidadhabitantespoblacionactualizado");
        this.poblacionId = poblacionId;
        this.cantidadHabitantes = cantidadHabitantes;
    }

    public PoblacionId getPoblacionId() {
        return poblacionId;
    }

    public CantidadHabitantes getCantidadHabitantes() {
        return cantidadHabitantes;
    }
}
