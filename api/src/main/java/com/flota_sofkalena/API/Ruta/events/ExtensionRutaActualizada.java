package com.flota_sofkalena.API.Ruta.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Ruta.values.Extension;

public class ExtensionRutaActualizada extends DomainEvent {

    private final Extension extension;

    public ExtensionRutaActualizada(Extension extension) {
        super("flota_sofkalena.ruta.extensionrutaactualizada");
        this.extension = extension;
    }

    public Extension getExtension() {
        return extension;
    }
}
