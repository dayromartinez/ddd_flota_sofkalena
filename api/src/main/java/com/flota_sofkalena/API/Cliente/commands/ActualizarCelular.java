package com.flota_sofkalena.API.Cliente.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Cliente.values.Celular;
import com.flota_sofkalena.API.Cliente.values.ClienteId;

public class ActualizarCelular extends Command {

    private final ClienteId clienteId;
    private final Celular celular;

    public ActualizarCelular(ClienteId clienteId, Celular celular) {
        this.clienteId = clienteId;
        this.celular = celular;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Celular getCelular() {
        return celular;
    }
}
