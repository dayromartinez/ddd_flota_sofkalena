package com.flota_sofkalena.API.Ruta.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Ruta.values.Extension;
import com.flota_sofkalena.API.Ruta.values.RutaId;
import com.flota_sofkalena.API.Ruta.values.ViaId;

public class ActualizarExtensionVia extends Command {

    private final RutaId rutaId;
    private final ViaId viaId;
    private final Extension extension;

    public ActualizarExtensionVia(RutaId rutaId, ViaId viaId, Extension extension) {
        this.rutaId = rutaId;
        this.viaId = viaId;
        this.extension = extension;
    }

    public RutaId getRutaId() {
        return rutaId;
    }

    public ViaId getViaId() {
        return viaId;
    }

    public Extension getExtension() {
        return extension;
    }
}
