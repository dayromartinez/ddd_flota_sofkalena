package com.flota_sofkalena.API.Cliente.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Cliente.values.ClienteId;
import com.flota_sofkalena.API.Cliente.values.HoraInicioYLlegada;
import com.flota_sofkalena.API.Cliente.values.ViajeId;

public class ActualizarHoraInicioYLlegadaViaje extends Command {

    private final ClienteId clienteId;
    private final ViajeId viajeId;
    private final HoraInicioYLlegada horaInicioYLlegada;

    public ActualizarHoraInicioYLlegadaViaje(ClienteId clienteId, ViajeId viajeId, HoraInicioYLlegada horaInicioYLlegada) {
        this.clienteId = clienteId;
        this.viajeId = viajeId;
        this.horaInicioYLlegada = horaInicioYLlegada;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public ViajeId getViajeId() {
        return viajeId;
    }

    public HoraInicioYLlegada getHoraInicioYLlegada() {
        return horaInicioYLlegada;
    }
}
