package com.flota_sofkalena.API.Ruta.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Ruta.values.Duracion;

public class DuracionRutaActualizada extends DomainEvent {

    private final Duracion duracion;

    public DuracionRutaActualizada(Duracion duracion) {
        super("flota_sofkalena.ruta.duracionrutaactualizada");
        this.duracion = duracion;
    }

    public Duracion getDuracion() {
        return duracion;
    }
}
