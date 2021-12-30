package com.flota_sofkalena.API.Terminal.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Terminal.values.BusId;
import com.flota_sofkalena.API.Terminal.values.TerminalId;
import com.flota_sofkalena.API.valuesGenerics.Estado;

public class ActualizarEstadoBus extends Command {

    private final TerminalId terminalId;
    private final BusId busId;
    private final Estado estado;

    public ActualizarEstadoBus(TerminalId terminalId, BusId busId, Estado estado) {
        this.terminalId = terminalId;
        this.busId = busId;
        this.estado = estado;
    }

    public TerminalId getTerminalId() {
        return terminalId;
    }

    public BusId getBusId() {
        return busId;
    }

    public Estado getEstado() {
        return estado;
    }
}
