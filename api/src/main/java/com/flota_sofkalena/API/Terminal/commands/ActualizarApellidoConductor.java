package com.flota_sofkalena.API.Terminal.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Terminal.values.ConductorId;
import com.flota_sofkalena.API.Terminal.values.TerminalId;
import com.flota_sofkalena.API.valuesGenerics.Apellido;

public class ActualizarApellidoConductor extends Command {

    private final TerminalId terminalId;
    private final ConductorId conductorId;
    private final Apellido apellido;

    public ActualizarApellidoConductor(TerminalId terminalId, ConductorId conductorId, Apellido apellido) {
        this.terminalId = terminalId;
        this.conductorId = conductorId;
        this.apellido = apellido;
    }

    public TerminalId getTerminalId() {
        return terminalId;
    }

    public ConductorId getConductorId() {
        return conductorId;
    }

    public Apellido getApellido() {
        return apellido;
    }
}
