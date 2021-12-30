package com.flota_sofkalena.API.Cliente.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Cliente.values.ClienteId;
import com.flota_sofkalena.API.Cliente.values.FechaViaje;
import com.flota_sofkalena.API.Cliente.values.ViajeId;

public class ActualizarFechaViaje extends Command {

    private final ClienteId clienteId;
    private final ViajeId viajeId;
    private final FechaViaje fechaViaje;

    public ActualizarFechaViaje(ClienteId clienteId, ViajeId viajeId, FechaViaje fechaViaje) {
        this.clienteId = clienteId;
        this.viajeId = viajeId;
        this.fechaViaje = fechaViaje;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public ViajeId getViajeId() {
        return viajeId;
    }

    public FechaViaje getFechaViaje() {
        return fechaViaje;
    }
}
