package com.flota_sofkalena.API.Cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.valuesGenerics.Nombre;

public class NombreClienteActualizado extends DomainEvent {

    private final Nombre nombre;

    public NombreClienteActualizado(Nombre nombre) {
        super("flota_sofkalena.cliente.nombreclienteactualizado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
