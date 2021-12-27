package com.flota_sofkalena.API.Ruta.entidades;

import co.com.sofka.domain.generic.Entity;
import com.flota_sofkalena.API.Ruta.values.CantidadHabitantes;
import com.flota_sofkalena.API.Ruta.values.Departamento;
import com.flota_sofkalena.API.Ruta.values.PoblacionId;
import com.flota_sofkalena.API.Ruta.values.RutaId;
import com.flota_sofkalena.API.valuesGenerics.Nombre;

import java.util.Objects;

public class Poblacion extends Entity<PoblacionId> {

    private Nombre nombre;
    private Departamento departamento;
    private CantidadHabitantes cantidadHabitantes;
    private RutaId rutaId;

    public Poblacion(PoblacionId entityId, Nombre nombre, Departamento departamento, CantidadHabitantes cantidadHabitantes, RutaId rutaId) {
        super(entityId);
        this.nombre = nombre;
        this.departamento = departamento;
        this.cantidadHabitantes = cantidadHabitantes;
        this.rutaId = rutaId;
    }

    public void actualizarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void actualizarCantidadHabitantes(CantidadHabitantes cantidadHabitantes){
        this.cantidadHabitantes = Objects.requireNonNull(cantidadHabitantes);
    }

    public Nombre nombre() {
        return nombre;
    }

    public Departamento departamento() {
        return departamento;
    }

    public CantidadHabitantes cantidadHabitantes() {
        return cantidadHabitantes;
    }

    public RutaId rutaId() {
        return rutaId;
    }
}
