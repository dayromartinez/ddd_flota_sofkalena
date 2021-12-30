package com.flota_sofkalena.API.Ruta.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Ruta.values.Extension;
import com.flota_sofkalena.API.Ruta.values.RutaId;

public class ActualizarExtension extends Command {

    private final RutaId rutaId;
    private final Extension extension;

    public ActualizarExtension(RutaId rutaId, Extension extension) {
        this.rutaId = rutaId;
        this.extension = extension;
    }

    public RutaId getRutaId() {
        return rutaId;
    }

    public Extension getExtension() {
        return extension;
    }
}
