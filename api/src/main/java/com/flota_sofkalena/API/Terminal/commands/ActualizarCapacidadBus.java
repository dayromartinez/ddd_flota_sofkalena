package com.flota_sofkalena.API.Terminal.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Terminal.values.BusId;
import com.flota_sofkalena.API.Terminal.values.Capacidad;
import com.flota_sofkalena.API.Terminal.values.TerminalId;

public class ActualizarCapacidadBus extends Command {

    private final TerminalId terminalId;
    private final BusId busId;
    private final Capacidad capacidad;

    public ActualizarCapacidadBus(TerminalId terminalId, BusId busId, Capacidad capacidad) {
        this.terminalId = terminalId;
        this.busId = busId;
        this.capacidad = capacidad;
    }

    public TerminalId getTerminalId() {
        return terminalId;
    }

    public BusId getBusId() {
        return busId;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}
