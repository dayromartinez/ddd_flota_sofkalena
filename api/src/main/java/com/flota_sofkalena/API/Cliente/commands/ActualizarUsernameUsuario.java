package com.flota_sofkalena.API.Cliente.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Cliente.values.ClienteId;
import com.flota_sofkalena.API.Cliente.values.UserName;
import com.flota_sofkalena.API.Cliente.values.UsuarioId;

public class ActualizarUsernameUsuario extends Command {

    private final ClienteId clienteId;
    private final UsuarioId usuarioId;
    private final UserName userName;

    public ActualizarUsernameUsuario(ClienteId clienteId, UsuarioId usuarioId, UserName userName) {
        this.clienteId = clienteId;
        this.usuarioId = usuarioId;
        this.userName = userName;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public UserName getUserName() {
        return userName;
    }
}
