package com.flota_sofkalena.API.Ruta.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Ruta.values.Precio;
import com.flota_sofkalena.API.Ruta.values.RutaId;

public class ActualizarPrecio extends Command {

    private final RutaId rutaId;
    private final Precio precio;

    public ActualizarPrecio(RutaId rutaId, Precio precio) {
        this.rutaId = rutaId;
        this.precio = precio;
    }

    public RutaId getRutaId() {
        return rutaId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
