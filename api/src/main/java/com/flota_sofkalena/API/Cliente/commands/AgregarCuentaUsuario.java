package com.flota_sofkalena.API.Cliente.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Cliente.values.ClienteId;
import com.flota_sofkalena.API.Cliente.values.Email;
import com.flota_sofkalena.API.Cliente.values.UserName;
import com.flota_sofkalena.API.Cliente.values.UsuarioId;

public class AgregarCuentaUsuario extends Command {

    private final ClienteId clienteId;
    private final UsuarioId usuarioId;
    private final UserName userName;
    private final Email email;

    public AgregarCuentaUsuario(ClienteId clienteId, UsuarioId usuarioId, UserName userName, Email email) {
        this.clienteId = clienteId;
        this.usuarioId = usuarioId;
        this.userName = userName;
        this.email = email;
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

    public Email getEmail() {
        return email;
    }
}
