package com.flota_sofkalena.API.Terminal.entidades;

import co.com.sofka.domain.generic.Entity;
import com.flota_sofkalena.API.Terminal.Terminal;
import com.flota_sofkalena.API.Terminal.values.*;
import com.flota_sofkalena.API.valuesGenerics.Dimensiones;
import com.flota_sofkalena.API.valuesGenerics.Estado;

import java.util.Objects;

public class Bus extends Entity<BusId> {

    private Dimensiones dimensiones;
    private Capacidad capacidad;
    private Categoria categoria;
    private Estado estado;
    private ConductorId conductorId;
    private TerminalId terminalId;

    public Bus(BusId entityId, Dimensiones dimensiones, Capacidad capacidad, Categoria categoria, Estado estado, ConductorId conductorId, TerminalId terminalId) {
        super(entityId);
        this.dimensiones = dimensiones;
        this.capacidad = capacidad;
        this.categoria = categoria;
        this.estado = estado;
        this.conductorId = conductorId;
        this.terminalId = terminalId;
    }

    public void actualizarCapacidad(Capacidad capacidad){
        this.capacidad = Objects.requireNonNull(capacidad);
    }

    public void actualizarEstado(Estado estado){
        this.estado = Objects.requireNonNull(estado);
    }

    public void actualizarConductor(ConductorId conductorId){
        this.conductorId = Objects.requireNonNull(conductorId);
    }

    public void actualizarTerminal(TerminalId terminalId){
        this.terminalId = Objects.requireNonNull(terminalId);
    }

    public Dimensiones dimensiones() {
        return dimensiones;
    }

    public Capacidad capacidad() {
        return capacidad;
    }

    public Categoria categoria() {
        return categoria;
    }

    public Estado estado() {
        return estado;
    }

    public ConductorId conductorId() {
        return conductorId;
    }

    public TerminalId terminalId() {
        return terminalId;
    }
}
