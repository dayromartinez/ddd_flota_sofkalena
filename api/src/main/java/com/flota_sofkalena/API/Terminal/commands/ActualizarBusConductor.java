package com.flota_sofkalena.API.Terminal.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Terminal.values.BusId;
import com.flota_sofkalena.API.Terminal.values.ConductorId;
import com.flota_sofkalena.API.Terminal.values.TerminalId;

public class ActualizarBusConductor extends Command {

    private final TerminalId terminalId;
    private final ConductorId conductorId;
    private final BusId busId;

    public ActualizarBusConductor(TerminalId terminalId, ConductorId conductorId, BusId busId) {
        this.terminalId = terminalId;
        this.conductorId = conductorId;
        this.busId = busId;
    }

    public TerminalId getTerminalId() {
        return terminalId;
    }

    public ConductorId getConductorId() {
        return conductorId;
    }

    public BusId getBusId() {
        return busId;
    }
}
