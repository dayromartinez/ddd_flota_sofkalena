package com.flota_sofkalena.API.Ruta.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Ruta.values.Extension;
import com.flota_sofkalena.API.Ruta.values.ViaId;

public class ExtensionViaActualizada extends DomainEvent {

    private final ViaId viaId;
    private final Extension extension;

    public ExtensionViaActualizada(ViaId viaId, Extension extension) {
        super("flota_sofkalena.ruta.extensionviaactualizada");
        this.viaId = viaId;
        this.extension = extension;
    }

    public ViaId getViaId() {
        return viaId;
    }

    public Extension getExtension() {
        return extension;
    }
}
