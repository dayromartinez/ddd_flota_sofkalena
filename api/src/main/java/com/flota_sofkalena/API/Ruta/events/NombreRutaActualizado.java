package com.flota_sofkalena.API.Ruta.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.valuesGenerics.Nombre;

public class NombreRutaActualizado extends DomainEvent {

    private final Nombre nombre;

    public NombreRutaActualizado(Nombre nombre) {
        super("flota_sofkalena.ruta.nombrerutaactualizado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
