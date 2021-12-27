package com.flota_sofkalena.API.Terminal.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Terminal.values.BusId;
import com.flota_sofkalena.API.Terminal.values.ConductorId;

public class BusConductorActualizado extends DomainEvent {

    private final ConductorId conductorId;
    private final BusId busId;

    public BusConductorActualizado(ConductorId conductorId, BusId busId) {
        super("flota_sofkalena.terminal.busconductoractualizado");
        this.conductorId = conductorId;
        this.busId = busId;
    }

    public ConductorId getConductorId() {
        return conductorId;
    }

    public BusId getBusId() {
        return busId;
    }
}
