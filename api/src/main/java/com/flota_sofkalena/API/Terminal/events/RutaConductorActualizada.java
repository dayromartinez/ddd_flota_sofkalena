package com.flota_sofkalena.API.Terminal.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Ruta.values.RutaId;
import com.flota_sofkalena.API.Terminal.values.ConductorId;

public class RutaConductorActualizada extends DomainEvent {

    private final ConductorId conductorId;
    private final RutaId rutaId;

    public RutaConductorActualizada(ConductorId conductorId, RutaId rutaId) {
        super("flota_sofkalena.terminal.rutaconductoractualizada");
        this.conductorId = conductorId;
        this.rutaId = rutaId;
    }

    public ConductorId getConductorId() {
        return conductorId;
    }

    public RutaId getRutaId() {
        return rutaId;
    }
}
