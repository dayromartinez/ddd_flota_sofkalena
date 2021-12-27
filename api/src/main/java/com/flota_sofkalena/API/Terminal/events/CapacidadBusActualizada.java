package com.flota_sofkalena.API.Terminal.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Terminal.values.BusId;
import com.flota_sofkalena.API.Terminal.values.Capacidad;

public class CapacidadBusActualizada extends DomainEvent {

    private final BusId busId;
    private final Capacidad capacidad;

    public CapacidadBusActualizada(BusId busId, Capacidad capacidad) {
        super("flota_sofkalena.terminal.capacidadbusactualizada");
        this.busId = busId;
        this.capacidad = capacidad;
    }

    public BusId getBusId() {
        return busId;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}
