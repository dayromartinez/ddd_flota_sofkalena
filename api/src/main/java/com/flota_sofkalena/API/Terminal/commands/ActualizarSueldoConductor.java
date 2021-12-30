package com.flota_sofkalena.API.Terminal.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Terminal.values.ConductorId;
import com.flota_sofkalena.API.Terminal.values.Sueldo;
import com.flota_sofkalena.API.Terminal.values.TerminalId;

public class ActualizarSueldoConductor extends Command {

    private final TerminalId terminalId;
    private final ConductorId conductorId;
    private final Sueldo sueldo;

    public ActualizarSueldoConductor(TerminalId terminalId, ConductorId conductorId, Sueldo sueldo) {
        this.terminalId = terminalId;
        this.conductorId = conductorId;
        this.sueldo = sueldo;
    }

    public TerminalId getTerminalId() {
        return terminalId;
    }

    public ConductorId getConductorId() {
        return conductorId;
    }

    public Sueldo getSueldo() {
        return sueldo;
    }
}
