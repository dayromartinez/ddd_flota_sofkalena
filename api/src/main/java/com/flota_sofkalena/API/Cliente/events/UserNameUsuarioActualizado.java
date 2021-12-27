package com.flota_sofkalena.API.Cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Cliente.values.UserName;
import com.flota_sofkalena.API.Cliente.values.UsuarioId;

public class UserNameUsuarioActualizado extends DomainEvent {

    private final UsuarioId usuarioId;
    private final UserName userName;

    public UserNameUsuarioActualizado(UsuarioId usuarioId, UserName userName) {
        super("flota_sofkalena.cliente.usernameusuarioactualizado");
        this.userName = userName;
        this.usuarioId = usuarioId;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public UserName getUserName() {
        return userName;
    }
}
