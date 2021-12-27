package com.flota_sofkalena.API.Terminal.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Terminal.values.Capacidad;

public class CapacidadTerminalActualizada extends DomainEvent {

    private final Capacidad capacidad;

    public CapacidadTerminalActualizada(Capacidad capacidad) {
        super("flota_sofkalena.terminal.capacidadterminalactualizada");
        this.capacidad = capacidad;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}
