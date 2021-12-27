package com.flota_sofkalena.API.Cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Cliente.values.Email;
import com.flota_sofkalena.API.Cliente.values.UsuarioId;

public class EmailUsuarioActualizado extends DomainEvent {

    private final UsuarioId usuarioId;
    private final Email email;

    public EmailUsuarioActualizado(UsuarioId usuarioId, Email email) {
        super("flota_sofkalena.cliente.emailusuarioactualizado");
        this.usuarioId = usuarioId;
        this.email = email;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public Email getEmail() {
        return email;
    }
}
