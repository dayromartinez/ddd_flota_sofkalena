package com.flota_sofkalena.API.Ruta.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.valuesGenerics.Estado;

public class EstadoRutaActualizado extends DomainEvent {

    private final Estado estado;

    public EstadoRutaActualizado(Estado estado) {
        super("flota_sofkalena.ruta.estadorutaactualizado");
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
