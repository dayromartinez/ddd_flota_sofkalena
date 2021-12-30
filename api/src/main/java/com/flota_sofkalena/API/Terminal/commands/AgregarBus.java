package com.flota_sofkalena.API.Terminal.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Terminal.values.*;
import com.flota_sofkalena.API.valuesGenerics.Dimensiones;
import com.flota_sofkalena.API.valuesGenerics.Estado;

public class AgregarBus extends Command {

    private final BusId entityId;
    private final Dimensiones dimensiones;
    private final Capacidad capacidad;
    private final Categoria categoria;
    private final Estado estado;
    private final ConductorId conductorId;
    private final TerminalId terminalId;

    public AgregarBus(BusId entityId, Dimensiones dimensiones, Capacidad capacidad, Categoria categoria, Estado estado, ConductorId conductorId, TerminalId terminalId) {
        this.entityId = entityId;
        this.dimensiones = dimensiones;
        this.capacidad = capacidad;
        this.categoria = categoria;
        this.estado = estado;
        this.conductorId = conductorId;
        this.terminalId = terminalId;
    }

    public BusId getEntityId() {
        return entityId;
    }

    public Dimensiones getDimensiones() {
        return dimensiones;
    }

    public Capacidad getCapacidad() {
        return capacidad;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Estado getEstado() {
        return estado;
    }

    public ConductorId getConductorId() {
        return conductorId;
    }

    public TerminalId getTerminalId() {
        return terminalId;
    }
}
