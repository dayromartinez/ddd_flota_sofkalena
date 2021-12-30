package com.flota_sofkalena.API.Terminal.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Terminal.values.ConductorId;
import com.flota_sofkalena.API.Terminal.values.TerminalId;
import com.flota_sofkalena.API.valuesGenerics.Nombre;

public class ActualizarNombreConductor extends Command {

    private final TerminalId terminalId;
    private final ConductorId conductorId;
    private final Nombre nombre;

    public ActualizarNombreConductor(TerminalId terminalId, ConductorId conductorId, Nombre nombre) {
        this.terminalId = terminalId;
        this.conductorId = conductorId;
        this.nombre = nombre;
    }

    public TerminalId getTerminalId() {
        return terminalId;
    }

    public ConductorId getConductorId() {
        return conductorId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
