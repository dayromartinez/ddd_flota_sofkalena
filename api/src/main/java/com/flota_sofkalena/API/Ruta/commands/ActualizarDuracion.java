package com.flota_sofkalena.API.Ruta.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Ruta.values.Duracion;
import com.flota_sofkalena.API.Ruta.values.RutaId;

public class ActualizarDuracion extends Command {

    private final RutaId rutaId;
    private final Duracion duracion;

    public ActualizarDuracion(RutaId rutaId, Duracion duracion) {
        this.rutaId = rutaId;
        this.duracion = duracion;
    }

    public RutaId getRutaId() {
        return rutaId;
    }

    public Duracion getDuracion() {
        return duracion;
    }
}
