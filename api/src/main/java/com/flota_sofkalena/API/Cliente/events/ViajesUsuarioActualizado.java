package com.flota_sofkalena.API.Cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Cliente.entidades.Viaje;
import com.flota_sofkalena.API.Cliente.values.UsuarioId;

import java.util.List;

public class ViajesUsuarioActualizado extends DomainEvent {

    private final UsuarioId usuarioId;
    private final List<Viaje> viajes;

    public ViajesUsuarioActualizado(UsuarioId usuarioId, List<Viaje> viajes) {
        super("flota_sofkalena.cliente.viajesusuarioactualizados");
        this.usuarioId = usuarioId;
        this.viajes = viajes;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public List<Viaje> getViajes() {
        return viajes;
    }
}
