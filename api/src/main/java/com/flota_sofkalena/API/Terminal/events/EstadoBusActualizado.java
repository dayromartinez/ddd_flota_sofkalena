package com.flota_sofkalena.API.Terminal.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Terminal.values.BusId;
import com.flota_sofkalena.API.valuesGenerics.Estado;

public class EstadoBusActualizado extends DomainEvent {

    private final BusId busId;
    private final Estado estado;

    public EstadoBusActualizado(BusId busId, Estado estado) {
        super("flota_sofkalena.terminal.estadobusactualizado");
        this.busId = busId;
        this.estado = estado;
    }

    public BusId getBusId() {
        return busId;
    }

    public Estado getEstado() {
        return estado;
    }
}
