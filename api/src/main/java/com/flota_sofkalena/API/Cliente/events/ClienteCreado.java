package com.flota_sofkalena.API.Cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Cliente.values.Celular;
import com.flota_sofkalena.API.valuesGenerics.Apellido;
import com.flota_sofkalena.API.valuesGenerics.Nombre;

public class ClienteCreado extends DomainEvent {

    private final Nombre nombre;
    private final Apellido apellido;
    private final Celular celular;

    public ClienteCreado(Nombre nombre, Apellido apellido, Celular celular) {
        super("flota_sofkalena.cliente.clientecreado");
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Apellido getApellido() {
        return apellido;
    }

    public Celular getCelular() {
        return celular;
    }
}
