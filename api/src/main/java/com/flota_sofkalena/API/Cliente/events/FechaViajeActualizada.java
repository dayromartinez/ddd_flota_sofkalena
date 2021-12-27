package com.flota_sofkalena.API.Cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Cliente.values.FechaViaje;
import com.flota_sofkalena.API.Cliente.values.ViajeId;

public class FechaViajeActualizada extends DomainEvent {

    private final ViajeId viajeId;
    private final FechaViaje fechaViaje;

    public FechaViajeActualizada(ViajeId viajeId, FechaViaje fechaViaje) {
        super("flota_sofkalena.cliente.fechaviajeactualizada");
        this.viajeId = viajeId;
        this.fechaViaje = fechaViaje;
    }

    public ViajeId getViajeId() {
        return viajeId;
    }

    public FechaViaje getFechaViaje() {
        return fechaViaje;
    }
}
