package com.flota_sofkalena.API.Ruta.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Ruta.values.PoblacionId;
import com.flota_sofkalena.API.valuesGenerics.Nombre;

public class NombrePoblacionActualizado extends DomainEvent {

    private final PoblacionId poblacionId;
    private final Nombre nombre;

    public NombrePoblacionActualizado(PoblacionId poblacionId, Nombre nombre) {
        super("flota_sofkalena.ruta.nombrepoblacionactualizado");
        this.poblacionId = poblacionId;
        this.nombre = nombre;
    }

    public PoblacionId getPoblacionId() {
        return poblacionId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
