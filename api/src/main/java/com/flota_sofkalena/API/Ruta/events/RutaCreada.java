package com.flota_sofkalena.API.Ruta.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Ruta.values.Duracion;
import com.flota_sofkalena.API.Ruta.values.Extension;
import com.flota_sofkalena.API.Ruta.values.Precio;
import com.flota_sofkalena.API.Ruta.values.RutaId;
import com.flota_sofkalena.API.Terminal.values.TerminalId;
import com.flota_sofkalena.API.valuesGenerics.Estado;
import com.flota_sofkalena.API.valuesGenerics.Nombre;

public class RutaCreada extends DomainEvent {

    private final RutaId entityId;
    private final Nombre nombre;
    private final Extension extension;
    private final Estado estado;
    private final Duracion duracion;
    private final Precio precio;
    private final TerminalId terminalId;

    public RutaCreada(RutaId entityId, Nombre nombre, Extension extension, Estado estado, Duracion duracion, Precio precio, TerminalId terminalId) {
        super("flota_sofkalena.ruta.rutacreada");
        this.entityId = entityId;
        this.nombre = nombre;
        this.extension = extension;
        this.estado = estado;
        this.duracion = duracion;
        this.precio = precio;
        this.terminalId = terminalId;
    }

    public TerminalId getTerminalId() {
        return terminalId;
    }

    public RutaId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Extension getExtension() {
        return extension;
    }

    public Estado getEstado() {
        return estado;
    }

    public Duracion getDuracion() {
        return duracion;
    }

    public Precio getPrecio() {
        return precio;
    }
}
