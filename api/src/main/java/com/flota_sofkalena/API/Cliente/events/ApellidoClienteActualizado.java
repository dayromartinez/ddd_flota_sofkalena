package com.flota_sofkalena.API.Cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.valuesGenerics.Apellido;

public class ApellidoClienteActualizado extends DomainEvent {

    private final Apellido apellido;

    public ApellidoClienteActualizado(Apellido apellido) {
        super("flota_sofkalena.cliente.apellidoclienteactualizado");
        this.apellido = apellido;
    }

    public Apellido getApellido() {
        return apellido;
    }
}
