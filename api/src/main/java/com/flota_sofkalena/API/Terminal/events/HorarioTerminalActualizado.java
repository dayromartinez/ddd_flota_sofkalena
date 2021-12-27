package com.flota_sofkalena.API.Terminal.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Terminal.values.Horario;

public class HorarioTerminalActualizado extends DomainEvent {

    private final Horario horario;

    public HorarioTerminalActualizado(Horario horario) {
        super("flota_sofkalena.terminal.horarioterminalactualizado");
        this.horario = horario;
    }

    public Horario getHorario() {
        return horario;
    }
}
