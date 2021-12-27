package com.flota_sofkalena.API.Cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Cliente.values.ClienteId;
import com.flota_sofkalena.API.Cliente.values.FechaViaje;
import com.flota_sofkalena.API.Cliente.values.HoraInicioYLlegada;
import com.flota_sofkalena.API.Cliente.values.ViajeId;
import com.flota_sofkalena.API.Ruta.values.RutaId;

public class ViajeAgregado extends DomainEvent {

    private final ViajeId entityId;
    private final FechaViaje fechaViaje;
    private final HoraInicioYLlegada horaInicioYLlegada;
    private final RutaId rutaId;
    private final ClienteId clienteId;

    public ViajeAgregado(ViajeId entityId, FechaViaje fechaViaje, HoraInicioYLlegada horaInicioYLlegada, RutaId rutaId, ClienteId clienteId) {
        super("flota_sofkalena.cliente.viajeagregado");
        this.entityId = entityId;
        this.fechaViaje = fechaViaje;
        this.horaInicioYLlegada = horaInicioYLlegada;
        this.rutaId = rutaId;
        this.clienteId = clienteId;
    }

    public ViajeId getEntityId() {
        return entityId;
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
