package com.flota_sofkalena.API.Cliente.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Cliente.values.ClienteId;
import com.flota_sofkalena.API.Cliente.values.FechaViaje;
import com.flota_sofkalena.API.Cliente.values.HoraInicioYLlegada;
import com.flota_sofkalena.API.Cliente.values.ViajeId;
import com.flota_sofkalena.API.Ruta.values.RutaId;

public class AgregarViaje extends Command {

    private final ViajeId viajeId;
    private final FechaViaje fechaViaje;
    private final HoraInicioYLlegada horaInicioYLlegada;
    private final RutaId rutaId;
    private final ClienteId clienteId;

    public AgregarViaje(ViajeId viajeId, FechaViaje fechaViaje, HoraInicioYLlegada horaInicioYLlegada, RutaId rutaId, ClienteId clienteId) {
        this.viajeId = viajeId;
        this.fechaViaje = fechaViaje;
        this.horaInicioYLlegada = horaInicioYLlegada;
        this.rutaId = rutaId;
        this.clienteId = clienteId;
    }

    public ViajeId getViajeId() {
        return viajeId;
    }

    public FechaViaje getFechaViaje() {
        return fechaViaje;
    }

    public HoraInicioYLlegada getHoraInicioYLlegada() {
        return horaInicioYLlegada;
    }

    public RutaId getRutaId() {
        return rutaId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
