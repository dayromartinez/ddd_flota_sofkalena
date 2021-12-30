package com.flota_sofkalena.API.Cliente.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Cliente.values.ClienteId;
import com.flota_sofkalena.API.valuesGenerics.Apellido;

public class ActualizarApellido extends Command {

    private final ClienteId clienteId;
    private final Apellido apellido;

    public ActualizarApellido(ClienteId clienteId, Apellido apellido) {
        this.clienteId = clienteId;
        this.apellido = apellido;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Apellido getApellido() {
        return apellido;
    }
}
