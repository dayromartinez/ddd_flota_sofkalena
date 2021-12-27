package com.flota_sofkalena.API.Cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Cliente.values.Celular;

public class CelularClienteActualizado extends DomainEvent {

    private final Celular celular;

    public CelularClienteActualizado(Celular celular) {
        super("flota_sofkalena.cliente.celularclienteactualizado");
        this.celular = celular;
    }

    public Celular getCelular() {
        return celular;
    }
}
