package com.flota_sofkalena.API.Terminal.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Terminal.values.Capacidad;
import com.flota_sofkalena.API.Terminal.values.TerminalId;

public class ActualizarCapacidad extends Command {

    private final TerminalId terminalId;
    private final Capacidad capacidad;

    public ActualizarCapacidad(TerminalId terminalId, Capacidad capacidad) {
        this.terminalId = terminalId;
        this.capacidad = capacidad;
    }

    public TerminalId getTerminalId() {
        return terminalId;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}
