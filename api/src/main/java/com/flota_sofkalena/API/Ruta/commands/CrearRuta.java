package com.flota_sofkalena.API.Ruta.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Ruta.values.Duracion;
import com.flota_sofkalena.API.Ruta.values.Extension;
import com.flota_sofkalena.API.Ruta.values.Precio;
import com.flota_sofkalena.API.Ruta.values.RutaId;
import com.flota_sofkalena.API.Terminal.values.TerminalId;
import com.flota_sofkalena.API.valuesGenerics.Estado;
import com.flota_sofkalena.API.valuesGenerics.Nombre;

public class CrearRuta extends Command {

    private final RutaId entityId;
    private final Nombre nombre;
    private final Extension extension;
    private final Estado estado;
    private final Duracion duracion;
    private final Precio precio;
    private final TerminalId terminalId;

    public CrearRuta(RutaId entityId, Nombre nombre, Extension extension, Estado estado, Duracion duracion, Precio precio, TerminalId terminalId) {
        this.entityId = entityId;
        this.nombre = nombre;
        this.extension = extension;
        this.estado = estado;
        this.duracion = duracion;
        this.precio = precio;
        this.terminalId = terminalId;
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

    public TerminalId getTerminalId() {
        return terminalId;
    }
}
