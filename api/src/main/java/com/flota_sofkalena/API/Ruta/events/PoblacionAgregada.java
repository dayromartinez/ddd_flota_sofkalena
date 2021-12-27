package com.flota_sofkalena.API.Ruta.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Ruta.values.CantidadHabitantes;
import com.flota_sofkalena.API.Ruta.values.Departamento;
import com.flota_sofkalena.API.Ruta.values.PoblacionId;
import com.flota_sofkalena.API.Ruta.values.RutaId;
import com.flota_sofkalena.API.valuesGenerics.Nombre;

public class PoblacionAgregada extends DomainEvent {

    private final PoblacionId entityId;
    private final Nombre nombre;
    private final Departamento departamento;
    private final CantidadHabitantes cantidadHabitantes;
    private final RutaId rutaId;

    public PoblacionAgregada(PoblacionId entityId, Nombre nombre, Departamento departamento, CantidadHabitantes cantidadHabitantes, RutaId rutaId) {
        super("flota_sofkalena.ruta.poblacionagregada");
        this.entityId = entityId;
        this.nombre = nombre;
        this.departamento = departamento;
        this.cantidadHabitantes = cantidadHabitantes;
        this.rutaId = rutaId;
    }

    public PoblacionId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public CantidadHabitantes getCantidadHabitantes() {
        return cantidadHabitantes;
    }

    public RutaId getRutaId() {
        return rutaId;
    }
}
