package com.flota_sofkalena.API.Cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Cliente.values.Email;
import com.flota_sofkalena.API.Cliente.values.UserName;
import com.flota_sofkalena.API.Cliente.values.UsuarioId;

public class UsuarioAgregado extends DomainEvent {

    private final UsuarioId usuarioId;
    private final UserName userName;
    private final Email email;

    public UsuarioAgregado(UsuarioId usuarioId, UserName userName, Email email) {
        super("flota_sofkalena.cliente.usuarioagregado");
        this.usuarioId = usuarioId;
        this.userName = userName;
        this.email = email;
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
