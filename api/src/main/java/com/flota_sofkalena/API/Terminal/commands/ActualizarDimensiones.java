package com.flota_sofkalena.API.Terminal.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Terminal.values.TerminalId;
import com.flota_sofkalena.API.valuesGenerics.Dimensiones;

public class ActualizarDimensiones extends Command {

    private final TerminalId terminalId;
    private final Dimensiones dimensiones;

    public ActualizarDimensiones(TerminalId terminalId, Dimensiones dimensiones) {
        this.terminalId = terminalId;
        this.dimensiones = dimensiones;
    }

    public TerminalId getTerminalId() {
        return terminalId;
    }

    public Dimensiones getDimensiones() {
        return dimensiones;
    }
}
