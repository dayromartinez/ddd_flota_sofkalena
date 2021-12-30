package com.flota_sofkalena.API.Ruta.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Ruta.values.RutaId;
import com.flota_sofkalena.API.valuesGenerics.Estado;

public class ActualizarEstado extends Command {

    private final RutaId rutaId;
    private final Estado estado;

    public ActualizarEstado(RutaId rutaId, Estado estado) {
        this.rutaId = rutaId;
        this.estado = estado;
    }

    public RutaId getRutaId() {
        return rutaId;
    }

    public Estado getEstado() {
        return estado;
    }
}
