package com.flota_sofkalena.API.Terminal.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Terminal.values.Capacidad;
import com.flota_sofkalena.API.Terminal.values.Direccion;
import com.flota_sofkalena.API.Terminal.values.Horario;
import com.flota_sofkalena.API.Terminal.values.TerminalId;
import com.flota_sofkalena.API.valuesGenerics.Dimensiones;

public class CrearTerminal extends Command {

    private final TerminalId entityId;
    private final Direccion direccion;
    private final Dimensiones dimensiones;
    private final Horario horario;
    private final Capacidad capacidad;

    public CrearTerminal(TerminalId entityId, Direccion direccion, Dimensiones dimensiones, Horario horario, Capacidad capacidad) {
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
