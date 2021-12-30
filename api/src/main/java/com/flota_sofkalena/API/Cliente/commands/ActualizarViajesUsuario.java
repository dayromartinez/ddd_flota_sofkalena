package com.flota_sofkalena.API.Cliente.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Cliente.entidades.Viaje;
import com.flota_sofkalena.API.Cliente.values.ClienteId;
import com.flota_sofkalena.API.Cliente.values.UsuarioId;

import java.util.List;

public class ActualizarViajesUsuario extends Command {

    private final ClienteId clienteId;
    private final UsuarioId usuarioId;
    private final List<Viaje> viajes;

    public ActualizarViajesUsuario(ClienteId clienteId, UsuarioId usuarioId, List<Viaje> viajes) {
        this.clienteId = clienteId;
        this.usuarioId = usuarioId;
        this.viajes = viajes;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public UsuarioId getUsuarioId() {
        return usuarioId;
    }

    public List<Viaje> getViajes() {
        return viajes;
    }
}
