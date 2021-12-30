package com.flota_sofkalena.API.Terminal.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Terminal.values.Direccion;
import com.flota_sofkalena.API.Terminal.values.TerminalId;

public class ActualizarDireccion extends Command {

    private final TerminalId terminalId;
    private final Direccion direccion;

    public ActualizarDireccion(TerminalId terminalId, Direccion direccion) {
        this.terminalId = terminalId;
        this.direccion = direccion;
    }

    public TerminalId getTerminalId() {
        return terminalId;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
