package com.flota_sofkalena.API.Ruta.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Ruta.values.RutaId;
import com.flota_sofkalena.API.Ruta.values.ViaId;
import com.flota_sofkalena.API.valuesGenerics.Estado;

public class ActualizarEstadoVia extends Command {

    private final RutaId rutaId;
    private final ViaId viaId;
    private final Estado estado;

    public ActualizarEstadoVia(RutaId rutaId, ViaId viaId, Estado estado) {
        this.rutaId = rutaId;
        this.viaId = viaId;
        this.estado = estado;
    }

    public RutaId getRutaId() {
        return rutaId;
    }

    public ViaId getViaId() {
        return viaId;
    }

    public Estado getEstado() {
        return estado;
    }
}
