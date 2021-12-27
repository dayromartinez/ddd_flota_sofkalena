package com.flota_sofkalena.API.Ruta.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Ruta.values.ViaId;
import com.flota_sofkalena.API.valuesGenerics.Estado;

public class EstadoViaActualizado extends DomainEvent {

    private final ViaId viaId;
    private final Estado estado;

    public EstadoViaActualizado(ViaId viaId, Estado estado) {
        super("flota_sofkalena.ruta.estadoviaactualizada");
        this.viaId = viaId;
        this.estado = estado;
    }

    public ViaId getViaId() {
        return viaId;
    }

    public Estado getEstado() {
        return estado;
    }
}
