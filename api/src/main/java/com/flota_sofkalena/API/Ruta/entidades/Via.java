package com.flota_sofkalena.API.Ruta.entidades;

import co.com.sofka.domain.generic.Entity;
import com.flota_sofkalena.API.Ruta.values.CantidadCarriles;
import com.flota_sofkalena.API.Ruta.values.Extension;
import com.flota_sofkalena.API.Ruta.values.RutaId;
import com.flota_sofkalena.API.Ruta.values.ViaId;
import com.flota_sofkalena.API.valuesGenerics.Estado;

import java.util.Objects;

public class Via extends Entity<ViaId> {

    private Extension extension;
    private CantidadCarriles cantidadCarriles;
    private Estado estado;
    private RutaId rutaId;

    public Via(ViaId entityId, Extension extension, CantidadCarriles cantidadCarriles, Estado estado, RutaId rutaId) {
        super(entityId);
        this.extension = extension;
        this.cantidadCarriles = cantidadCarriles;
        this.estado = estado;
        this.rutaId = rutaId;
    }

    public void actualizarExtension(Extension extension){
        this.extension = Objects.requireNonNull(extension);
    }

    public void actualizarCantidadCarriles(CantidadCarriles cantidadCarriles){
        this.cantidadCarriles = Objects.requireNonNull(cantidadCarriles);
    }

    public void actualizarEstado(Estado estado){
        this.estado = Objects.requireNonNull(estado);
    }

    public Extension extension() {
        return extension;
    }

    public CantidadCarriles cantidadCarriles() {
        return cantidadCarriles;
    }

    public Estado estado() {
        return estado;
    }

    public RutaId rutaId() {
        return rutaId;
    }
}
