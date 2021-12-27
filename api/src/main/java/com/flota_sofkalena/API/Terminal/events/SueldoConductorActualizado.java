package com.flota_sofkalena.API.Terminal.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Terminal.values.ConductorId;
import com.flota_sofkalena.API.Terminal.values.Sueldo;

public class SueldoConductorActualizado extends DomainEvent {

    private final ConductorId conductorId;
    private final Sueldo sueldo;

    public SueldoConductorActualizado(ConductorId conductorId, Sueldo sueldo) {
        super("flota_sofkalena.terminal.sueldoconductoractualizado");
        this.conductorId = conductorId;
        this.sueldo = sueldo;
    }

    public ConductorId getConductorId() {
        return conductorId;
    }

    public Sueldo getSueldo() {
        return sueldo;
    }
}
