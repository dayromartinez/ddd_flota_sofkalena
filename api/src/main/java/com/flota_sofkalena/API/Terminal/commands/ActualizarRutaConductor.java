package com.flota_sofkalena.API.Terminal.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Ruta.values.RutaId;
import com.flota_sofkalena.API.Terminal.values.ConductorId;
import com.flota_sofkalena.API.Terminal.values.TerminalId;

public class ActualizarRutaConductor extends Command {

    private final TerminalId terminalId;
    private final ConductorId conductorId;
    private final RutaId rutaId;

    public ActualizarRutaConductor(TerminalId terminalId, ConductorId conductorId, RutaId rutaId) {
        this.terminalId = terminalId;
        this.conductorId = conductorId;
        this.rutaId = rutaId;
    }

    public TerminalId getTerminalId() {
        return terminalId;
    }

    public ConductorId getConductorId() {
        return conductorId;
    }

    public RutaId getRutaId() {
        return rutaId;
    }
}
