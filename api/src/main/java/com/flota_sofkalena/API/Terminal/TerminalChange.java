package com.flota_sofkalena.API.Terminal;

import co.com.sofka.domain.generic.EventChange;
import com.flota_sofkalena.API.Ruta.Ruta;
import com.flota_sofkalena.API.Terminal.entidades.Bus;
import com.flota_sofkalena.API.Terminal.entidades.Conductor;
import com.flota_sofkalena.API.Terminal.events.*;

import java.util.ArrayList;

public class TerminalChange extends EventChange {
    public TerminalChange(Terminal terminal) {

        apply((ApellidoConductorActualizado event) -> {
            var conductor = terminal.getConductorPorConductorId(event.getConductorId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra al conductor especificado"));
            conductor.actualizarApellido(event.getApellido());
        });

        apply((BusAgregado event) -> {
            terminal.buses.add(new Bus(event.getEntityId(), event.getDimensiones(), event.getCapacidad(), event.getCategoria(), event.getEstado(), event.getConductorId(), event.getTerminalId()));
        });

        apply((BusConductorActualizado event) -> {
            var conductor = terminal.getConductorPorConductorId(event.getConductorId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra al conductor especificado"));
            conductor.actualizarBus(event.getBusId());
        });

        apply((CapacidadBusActualizada event) -> {
            var bus = terminal.getBusPorBusId(event.getBusId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra el bus especificado"));
            bus.actualizarCapacidad(event.getCapacidad());
        });

        apply((CapacidadTerminalActualizada event) -> {
            terminal.capacidad = event.getCapacidad();
        });

        apply((ConductorAgregado event) -> {
            terminal.conductores.add(new Conductor(event.getEntityId(), event.getNombre(), event.getApellido(), event.getSueldo(), event.getBusId(), event.getRutaId(), event.getTerminalId()));
        });

        apply((DimensionesTerminalActualizadas event) -> {
            terminal.dimensiones = event.getDimensiones();
        });

        apply((DireccionTerminalActualizada event) -> {
            terminal.direccion = event.getDireccion();
        });

        apply((EstadoBusActualizado event) -> {
            var bus = terminal.getBusPorBusId(event.getBusId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra el bus especificado"));
            bus.actualizarEstado(event.getEstado());
        });

        apply((HorarioTerminalActualizado event) -> {
            terminal.horario = event.getHorario();
        });

        apply((NombreConductorActualizado event) -> {
            var conductor = terminal.getConductorPorConductorId(event.getConductorId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra al conductor especificado"));
            conductor.actualizarNombre(event.getNombre());
        });

        apply((RutaConductorActualizada event) -> {
            var conductor = terminal.getConductorPorConductorId(event.getConductorId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra al conductor especificado"));
            conductor.actualizarRuta(event.getRutaId());
        });

        apply((SueldoConductorActualizado event) -> {
            var conductor = terminal.getConductorPorConductorId(event.getConductorId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra al conductor especificado"));
            conductor.actualizarSueldo(event.getSueldo());
        });

        apply((TerminalCreado event) -> {
            terminal.terminalId = event.getEntityId();
            terminal.direccion = event.getDireccion();
            terminal.dimensiones = event.getDimensiones();
            terminal.horario = event.getHorario();
            terminal.capacidad = event.getCapacidad();
            terminal.conductores = new ArrayList<Conductor>();
            terminal.buses = new ArrayList<Bus>();
            terminal.rutas = new ArrayList<Ruta>();
        });
    }
}
