package com.flota_sofkalena.API.Terminal.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Ruta.values.RutaId;
import com.flota_sofkalena.API.Terminal.values.BusId;
import com.flota_sofkalena.API.Terminal.values.ConductorId;
import com.flota_sofkalena.API.Terminal.values.Sueldo;
import com.flota_sofkalena.API.Terminal.values.TerminalId;
import com.flota_sofkalena.API.valuesGenerics.Apellido;
import com.flota_sofkalena.API.valuesGenerics.Nombre;

public class ConductorAgregado extends DomainEvent {

    private final ConductorId entityId;
    private final Nombre nombre;
    private final Apellido apellido;
    private final Sueldo sueldo;
    private final BusId busId;
    private final RutaId rutaId;
    private final TerminalId terminalId;

    public ConductorAgregado(ConductorId entityId, Nombre nombre, Apellido apellido, Sueldo sueldo, BusId busId, RutaId rutaId, TerminalId terminalId) {
        super("flota_sofkalena.terminal.conductoragregado");
        this.entityId = entityId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.busId = busId;
        this.rutaId = rutaId;
        this.terminalId = terminalId;
    }

    public ConductorId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Apellido getApellido() {
        return apellido;
    }

    public Sueldo getSueldo() {
        return sueldo;
    }

    public BusId getBusId() {
        return busId;
    }

    public RutaId getRutaId() {
        return rutaId;
    }

    public TerminalId getTerminalId() {
        return terminalId;
    }
}
