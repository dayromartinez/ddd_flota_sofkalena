package com.flota_sofkalena.API.Ruta.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Ruta.values.CantidadCarriles;
import com.flota_sofkalena.API.Ruta.values.RutaId;
import com.flota_sofkalena.API.Ruta.values.ViaId;

public class ActualizarCantidadCarrilesVia extends Command {

    private final RutaId rutaId;
    private final ViaId viaId;
    private final CantidadCarriles cantidadCarriles;

    public ActualizarCantidadCarrilesVia(RutaId rutaId, ViaId viaId, CantidadCarriles cantidadCarriles) {
        this.rutaId = rutaId;
        this.viaId = viaId;
        this.cantidadCarriles = cantidadCarriles;
    }

    public RutaId getRutaId() {
        return rutaId;
    }

    public ViaId getViaId() {
        return viaId;
    }

    public CantidadCarriles getCantidadCarriles() {
        return cantidadCarriles;
    }
}
