package com.flota_sofkalena.API.Terminal.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Terminal.values.ConductorId;
import com.flota_sofkalena.API.valuesGenerics.Apellido;

public class ApellidoConductorActualizado extends DomainEvent {

    private final ConductorId conductorId;
    private final Apellido apellido;

    public ApellidoConductorActualizado(ConductorId conductorId, Apellido apellido) {
        super("flota_sofkalena.terminal.apellidoconductoractualizado");
        this.conductorId = conductorId;
        this.apellido = apellido;
    }

    public ConductorId getConductorId() {
        return conductorId;
    }

    public Apellido getApellido() {
        return apellido;
    }
}
