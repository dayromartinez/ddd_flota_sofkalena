package com.flota_sofkalena.API.Terminal.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Terminal.values.Capacidad;
import com.flota_sofkalena.API.Terminal.values.Direccion;
import com.flota_sofkalena.API.Terminal.values.Horario;
import com.flota_sofkalena.API.Terminal.values.TerminalId;
import com.flota_sofkalena.API.valuesGenerics.Dimensiones;

public class TerminalCreado extends DomainEvent {

    private final TerminalId entityId;
    private final Direccion direccion;
    private final Dimensiones dimensiones;
    private final Horario horario;
    private final Capacidad capacidad;

    public TerminalCreado(TerminalId entityId, Direccion direccion, Dimensiones dimensiones, Horario horario, Capacidad capacidad) {
        super("flota_sofkalena.terminal.terminalcreado");
        this.entityId = entityId;
        this.direccion = direccion;
        this.dimensiones = dimensiones;
        this.horario = horario;
        this.capacidad = capacidad;
    }

    public TerminalId getEntityId() {
        return entityId;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Dimensiones getDimensiones() {
        return dimensiones;
    }

    public Horario getHorario() {
        return horario;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }
}
