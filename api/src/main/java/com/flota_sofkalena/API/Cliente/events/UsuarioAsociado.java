package com.flota_sofkalena.API.Cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Cliente.values.UsuarioId;

public class UsuarioAsociado extends DomainEvent {

    private final UsuarioId usuarioId;

    public UsuarioAsociado(UsuarioId usuarioId) {
        super("flota_sofkalena.cliente.usuarioasociado");
        this.usuarioId = usuarioId;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }
}
