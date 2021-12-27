package com.flota_sofkalena.API.Terminal.entidades;

import co.com.sofka.domain.generic.Entity;
import com.flota_sofkalena.API.Ruta.values.RutaId;
import com.flota_sofkalena.API.Terminal.values.BusId;
import com.flota_sofkalena.API.Terminal.values.ConductorId;
import com.flota_sofkalena.API.Terminal.values.Sueldo;
import com.flota_sofkalena.API.Terminal.values.TerminalId;
import com.flota_sofkalena.API.valuesGenerics.Apellido;
import com.flota_sofkalena.API.valuesGenerics.Nombre;

import java.util.Objects;

public class Conductor extends Entity<ConductorId> {

    private Nombre nombre;
    private Apellido apellido;
    private Sueldo sueldo;
    private BusId busId;
    private RutaId rutaId;
    private TerminalId terminalId;

    public Conductor(ConductorId entityId, Nombre nombre, Apellido apellido, Sueldo sueldo, BusId busId, RutaId rutaId, TerminalId terminalId) {
        super(entityId);
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.busId = busId;
        this.rutaId = rutaId;
        this.terminalId = terminalId;
    }

    public void actualizarBus(BusId busId){
        this.busId = Objects.requireNonNull(busId);
    }

    public void actualizarRuta(RutaId rutaId){
        this.rutaId = Objects.requireNonNull(rutaId);
    }

    public void actualizarSueldo(Sueldo sueldo){
        this.sueldo = Objects.requireNonNull(sueldo);
    }

    public void actualizarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void actualizarApellido(Apellido apellido){
        this.apellido = Objects.requireNonNull(apellido);
    }

    public Nombre nombre() {
        return nombre;
    }

    public Apellido apellido() {
        return apellido;
    }

    public Sueldo sueldo() {
        return sueldo;
    }

    public BusId busId() {
        return busId;
    }

    public RutaId rutaId() {
        return rutaId;
    }

    public TerminalId terminalId(){
        return terminalId;
    }
}
