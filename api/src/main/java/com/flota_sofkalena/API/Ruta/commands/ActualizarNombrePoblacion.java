package com.flota_sofkalena.API.Ruta.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Ruta.values.PoblacionId;
import com.flota_sofkalena.API.Ruta.values.RutaId;
import com.flota_sofkalena.API.valuesGenerics.Nombre;

public class ActualizarNombrePoblacion extends Command {

    private final RutaId rutaId;
    private final PoblacionId poblacionId;
    private final Nombre nombre;

    public ActualizarNombrePoblacion(RutaId rutaId, PoblacionId poblacionId, Nombre nombre) {
        this.rutaId = rutaId;
        this.poblacionId = poblacionId;
        this.nombre = nombre;
    }

    public RutaId getRutaId() {
        return rutaId;
    }

    public PoblacionId getPoblacionId() {
        return poblacionId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
