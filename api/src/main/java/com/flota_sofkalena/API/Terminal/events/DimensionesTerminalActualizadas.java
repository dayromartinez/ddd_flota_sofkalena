package com.flota_sofkalena.API.Terminal.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.valuesGenerics.Dimensiones;

public class DimensionesTerminalActualizadas extends DomainEvent {

    private final Dimensiones dimensiones;

    public DimensionesTerminalActualizadas(Dimensiones dimensiones) {
        super("flota_sofkalena.terminal.dimensionesterminalactualizadas");
        this.dimensiones = dimensiones;
    }

    public Dimensiones getDimensiones() {
        return dimensiones;
    }
}
