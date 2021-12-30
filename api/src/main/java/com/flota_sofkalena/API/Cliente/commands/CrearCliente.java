package com.flota_sofkalena.API.Cliente.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Cliente.values.Celular;
import com.flota_sofkalena.API.Cliente.values.ClienteId;
import com.flota_sofkalena.API.valuesGenerics.Apellido;
import com.flota_sofkalena.API.valuesGenerics.Nombre;

public class CrearCliente extends Command {

    private final ClienteId clienteId;
    private final Nombre nombre;
    private final Apellido apellido;
    private final Celular celular;

    public CrearCliente(ClienteId clienteId, Nombre nombre, Apellido apellido, Celular celular) {
        this.clienteId = clienteId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }

    public ClienteId getClienteId() {
        return clienteId;
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
