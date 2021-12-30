package com.flota_sofkalena.API.Cliente.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Cliente.values.ClienteId;
import com.flota_sofkalena.API.Cliente.values.Email;
import com.flota_sofkalena.API.Cliente.values.UsuarioId;

public class ActualizarEmailUsuario extends Command {

    private final ClienteId clienteId;
    private final UsuarioId usuarioId;
    private final Email email;

    public ActualizarEmailUsuario(ClienteId clienteId, UsuarioId usuarioId, Email email) {
        this.clienteId = clienteId;
        this.usuarioId = usuarioId;
        this.email = email;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public Email getEmail() {
        return email;
    }
}
