package com.flota_sofkalena.API.Ruta.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Ruta.values.CantidadCarriles;
import com.flota_sofkalena.API.Ruta.values.ViaId;

public class CantidadCarrilesViaActualizada extends DomainEvent {

    private final ViaId viaId;
    private final CantidadCarriles cantidadCarriles;

    public CantidadCarrilesViaActualizada(ViaId viaId, CantidadCarriles cantidadCarriles) {
        super("flota_sofkalena.ruta.cantidadcarrilesviaactualizada");
        this.viaId = viaId;
        this.cantidadCarriles = cantidadCarriles;
    }

    public ViaId getViaId() {
        return viaId;
    }

    public CantidadCarriles getCantidadCarriles() {
        return cantidadCarriles;
    }
}
