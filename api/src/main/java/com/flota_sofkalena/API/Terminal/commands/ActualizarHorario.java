package com.flota_sofkalena.API.Terminal.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Terminal.values.Horario;
import com.flota_sofkalena.API.Terminal.values.TerminalId;

public class ActualizarHorario extends Command {

    private final TerminalId terminalId;
    private final Horario horario;

    public ActualizarHorario(TerminalId terminalId, Horario horario) {
        this.terminalId = terminalId;
        this.horario = horario;
    }

    public TerminalId getTerminalId() {
        return terminalId;
    }

    public Horario getHorario() {
        return horario;
    }
}
