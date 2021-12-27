package com.flota_sofkalena.API.Terminal;

import co.com.sofka.domain.generic.AggregateEvent;
import com.flota_sofkalena.API.Ruta.Ruta;
import com.flota_sofkalena.API.Ruta.values.RutaId;
import com.flota_sofkalena.API.Terminal.entidades.Bus;
import com.flota_sofkalena.API.Terminal.entidades.Conductor;
import com.flota_sofkalena.API.Terminal.events.*;
import com.flota_sofkalena.API.Terminal.values.*;
import com.flota_sofkalena.API.valuesGenerics.Apellido;
import com.flota_sofkalena.API.valuesGenerics.Dimensiones;
import com.flota_sofkalena.API.valuesGenerics.Estado;
import com.flota_sofkalena.API.valuesGenerics.Nombre;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Terminal extends AggregateEvent<TerminalId> {

    protected Direccion direccion;
    protected Dimensiones dimensiones;
    protected Horario horario;
    protected Capacidad capacidad;
    protected List<Bus> buses;
    protected List<Ruta> rutas;
    protected List<Conductor> conductores;
    protected List<Terminal> terminales;

    public Terminal(TerminalId entityId, Direccion direccion, Dimensiones dimensiones, Horario horario, Capacidad capacidad) {
        super(entityId);
        appendChange(new TerminalCreado(entityId, direccion, dimensiones, horario, capacidad)).apply();
    }

    public void actualizarDireccion(Direccion direccion){
        Objects.requireNonNull(direccion);
        appendChange(new DireccionTerminalActualizada(direccion)).apply();
    }

    public void actualizarDimensiones(Dimensiones dimensiones){
        Objects.requireNonNull(dimensiones);
        appendChange(new DimensionesTerminalActualizadas(dimensiones)).apply();
    }

    public void actualizarHorario(Horario horario){
        Objects.requireNonNull(horario);
        appendChange(new HorarioTerminalActualizado(horario)).apply();
    }

    public void actualizarCapacidad(Capacidad capacidad){
        Objects.requireNonNull(capacidad);
        appendChange(new CapacidadTerminalActualizada(capacidad)).apply();
    }

    public void agregarConductor(ConductorId entityId, Nombre nombre, Apellido apellido, Sueldo sueldo, BusId busId, RutaId rutaId, TerminalId terminalId){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(apellido);
        Objects.requireNonNull(sueldo);
        Objects.requireNonNull(busId);
        Objects.requireNonNull(rutaId);
        Objects.requireNonNull(terminalId);
        appendChange(new ConductorAgregado(entityId, nombre, apellido, sueldo, busId, rutaId, terminalId)).apply();
    }

    public void actualizarBusConductor(ConductorId conductorId, BusId busId){
        Objects.requireNonNull(conductorId);
        Objects.requireNonNull(busId);
        appendChange(new BusConductorActualizado(conductorId, busId)).apply();
    }

    public void actualizarRutaConductor(ConductorId conductorId, RutaId rutaId){
        Objects.requireNonNull(conductorId);
        Objects.requireNonNull(rutaId);
        appendChange(new RutaConductorActualizada(conductorId, rutaId)).apply();
    }

    public void actualizarSueldoConductor(ConductorId conductorId, Sueldo sueldo){
        Objects.requireNonNull(conductorId);
        Objects.requireNonNull(sueldo);
        appendChange(new SueldoConductorActualizado(conductorId, sueldo)).apply();
    }

    public void actualizarNombreConductor(ConductorId conductorId, Nombre nombre){
        Objects.requireNonNull(conductorId);
        Objects.requireNonNull(nombre);
        appendChange(new NombreConductorActualizado(conductorId, nombre)).apply();
    }

    public void actualizarApellidoConductor(ConductorId conductorId, Apellido apellido){
        Objects.requireNonNull(conductorId);
        Objects.requireNonNull(apellido);
        appendChange(new ApellidoConductorActualizado(conductorId, apellido)).apply();
    }

    public void agregarBus(BusId entityId, Dimensiones dimensiones, Capacidad capacidad, Categoria categoria, Estado estado, ConductorId conductorId, TerminalId terminalId){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(dimensiones);
        Objects.requireNonNull(capacidad);
        Objects.requireNonNull(categoria);
        Objects.requireNonNull(estado);
        Objects.requireNonNull(conductorId);
        Objects.requireNonNull(terminalId);
        appendChange(new BusAgregado(entityId, dimensiones, capacidad, categoria, estado, conductorId, terminalId)).apply();
    }

    public void actualizarCapacidadBus(BusId busId, Capacidad capacidad){
        Objects.requireNonNull(busId);
        Objects.requireNonNull(capacidad);
        appendChange(new CapacidadBusActualizada(busId, capacidad)).apply();
    }

    public void actualizarCategoriaBus(BusId busId, Categoria categoria){
        Objects.requireNonNull(busId);
        Objects.requireNonNull(categoria);
        appendChange(new CategoriaBusActualizada(busId, categoria)).apply();
    }

    public void actualizarEstadoBus(BusId busId, Estado estado){
        Objects.requireNonNull(busId);
        Objects.requireNonNull(estado);
        appendChange(new EstadoBusActualizado(busId, estado)).apply();
    }

    public Optional<Terminal> getTerminalPorTerminalId(TerminalId terminalId){
        return terminales.stream().
                filter(terminal -> terminal.identity().equals(terminalId))
                .findFirst();
    }

    public List<Conductor> getConductoresPorTerminalId(TerminalId terminalId){
        return conductores.stream()
                .filter(conductor -> conductor.terminalId().equals(terminalId))
                .collect(Collectors.toList());
    }

    public Optional<Conductor> getConductorPorConductorId(ConductorId conductorId){
        return conductores.stream()
                .filter(conductor -> conductor.identity().equals(conductorId))
                .findFirst();
    }

    public List<Bus> getBusesPorTerminalId(TerminalId terminalId){
        return buses.stream()
                .filter(bus -> bus.terminalId().equals(terminalId))
                .collect(Collectors.toList());
    }

    public Optional<Bus> getBusPorBusId(BusId busId){
        return buses.stream()
                .filter(bus -> bus.identity().equals(busId))
                .findFirst();
    }

    public Direccion direccion() {
        return direccion;
    }

    public Dimensiones dimensiones() {
        return dimensiones;
    }

    public Horario horario() {
        return horario;
    }

    public Capacidad capacidad() {
        return capacidad;
    }

    public List<Bus> buses() {
        return buses;
    }

    public List<Ruta> rutas() {
        return rutas;
    }

    public List<Conductor> conductores() {
        return conductores;
    }
}
