package com.flota_sofkalena.API.Ruta.commands;

import co.com.sofka.domain.generic.Command;
import com.flota_sofkalena.API.Ruta.values.CantidadCarriles;
import com.flota_sofkalena.API.Ruta.values.Extension;
import com.flota_sofkalena.API.Ruta.values.RutaId;
import com.flota_sofkalena.API.Ruta.values.ViaId;
import com.flota_sofkalena.API.valuesGenerics.Estado;

public class AgregarVia extends Command {

    private final ViaId entityId;
    private final Extension extension;
    private final CantidadCarriles cantidadCarriles;
    private final Estado estado;
    private final RutaId rutaId;

    public AgregarVia(ViaId entityId, Extension extension, CantidadCarriles cantidadCarriles, Estado estado, RutaId rutaId) {
        this.entityId = entityId;
        this.extension = extension;
        this.cantidadCarriles = cantidadCarriles;
        this.estado = estado;
        this.rutaId = rutaId;
    }

    public ViaId getEntityId() {
        return entityId;
    }

    public Extension getExtension() {
        return extension;
    }

    public CantidadCarriles getCantidadCarriles() {
        return cantidadCarriles;
    }

    public Estado getEstado() {
        return estado;
    }

    public RutaId getRutaId() {
        return rutaId;
    }
}
