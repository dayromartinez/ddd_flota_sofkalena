package com.flota_sofkalena.API.Cliente.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Cliente.values.ClienteId;
import com.flota_sofkalena.API.Cliente.values.UsuarioId;

public class AsociarUsuario extends Command {

    private final ClienteId clienteId;
    private final UsuarioId usuarioId;

    public AsociarUsuario(ClienteId clienteId, UsuarioId usuarioId) {
        this.clienteId = clienteId;
        this.usuarioId = usuarioId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }
}
