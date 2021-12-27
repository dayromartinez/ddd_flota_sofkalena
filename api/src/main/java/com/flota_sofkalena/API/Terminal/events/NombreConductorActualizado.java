package com.flota_sofkalena.API.Terminal.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Terminal.values.ConductorId;
import com.flota_sofkalena.API.valuesGenerics.Nombre;

public class NombreConductorActualizado extends DomainEvent {

    private final ConductorId conductorId;
    private final Nombre nombre;

    public NombreConductorActualizado(ConductorId conductorId, Nombre nombre) {
        super("flota_sofkalena.terminal.nombreconductoractualizado");
        this.conductorId = conductorId;
        this.nombre = nombre;
    }

    public ConductorId getConductorId() {
        return conductorId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}