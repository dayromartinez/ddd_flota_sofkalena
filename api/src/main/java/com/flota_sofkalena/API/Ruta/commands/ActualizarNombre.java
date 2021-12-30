package com.flota_sofkalena.API.Ruta.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Ruta.values.RutaId;
import com.flota_sofkalena.API.valuesGenerics.Nombre;

public class ActualizarNombre extends Command {

    private final RutaId rutaId;
    private final Nombre nombre;

    public ActualizarNombre(RutaId rutaId, Nombre nombre) {
        this.rutaId = rutaId;
        this.nombre = nombre;
    }

    public RutaId getRutaId() {
        return rutaId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
