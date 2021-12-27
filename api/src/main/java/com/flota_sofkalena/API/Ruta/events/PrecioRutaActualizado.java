package com.flota_sofkalena.API.Ruta.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Ruta.values.Precio;

public class PrecioRutaActualizado extends DomainEvent {

    private final Precio precio;

    public PrecioRutaActualizado(Precio precio) {
        super("flota_sofkalena.ruta.preciorutaactualizado");
        this.precio = precio;
    }

    public Precio getPrecio() {
        return precio;
    }
}
