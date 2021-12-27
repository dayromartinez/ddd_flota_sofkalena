package com.flota_sofkalena.API.Terminal.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Terminal.values.Direccion;

public class DireccionTerminalActualizada extends DomainEvent {

    private final Direccion direccion;

    public DireccionTerminalActualizada(Direccion direccion) {
        super("flota_sofkalena.terminal.direccionterminalactualizada");
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
