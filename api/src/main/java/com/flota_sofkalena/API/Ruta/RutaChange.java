package com.flota_sofkalena.API.Ruta;

import co.com.sofka.domain.generic.EventChange;
import com.flota_sofkalena.API.Ruta.entidades.Poblacion;
import com.flota_sofkalena.API.Ruta.entidades.Via;
import com.flota_sofkalena.API.Ruta.events.*;

import java.util.ArrayList;
import java.util.List;

public class RutaChange extends EventChange {
    public RutaChange(Ruta ruta) {

        apply((CantidadCarrilesViaActualizada event) -> {
            var via = ruta.getViaPorViaId(event.getViaId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra la via especificada"));
            via.actualizarCantidadCarriles(event.getCantidadCarriles());
        });

        apply((CantidadHabitantesPoblacionActualizada event) -> {
            var poblacion = ruta.getPoblacionPorPoblacionId(event.getPoblacionId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra la población especificada"));
            poblacion.actualizarCantidadHabitantes(event.getCantidadHabitantes());
        });

        apply((DuracionRutaActualizada event) -> {
            ruta.duracion = event.getDuracion();
        });

        apply((EstadoRutaActualizado event) -> {
            ruta.estado = event.getEstado();
        });

        apply((EstadoViaActualizado event) -> {
            var via = ruta.getViaPorViaId(event.getViaId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra la via especificada"));
            via.actualizarEstado(event.getEstado());
        });

        apply((ExtensionRutaActualizada event) -> {
            ruta.extension = event.getExtension();
        });

        apply((ExtensionViaActualizada event) -> {
            var via = ruta.getViaPorViaId(event.getViaId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra la via especificada"));
            via.actualizarExtension(event.getExtension());
        });

        apply((NombrePoblacionActualizado event) -> {
            var poblacion = ruta.getPoblacionPorPoblacionId(event.getPoblacionId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra la población especificada"));
            poblacion.actualizarNombre(event.getNombre());
        });

        apply((NombreRutaActualizado event) -> {
            ruta.nombre = event.getNombre();
        });

        apply((PoblacionAgregada event) -> {
            ruta.poblaciones.add(new Poblacion(event.getEntityId(), event.getNombre(), event.getDepartamento(), event.getCantidadHabitantes(), event.getRutaId()));
        });

        apply((PrecioRutaActualizado event) -> {
            ruta.precio = event.getPrecio();
        });

        apply((RutaCreada event) -> {
            ruta.rutaId = event.getEntityId();
            ruta.nombre = event.getNombre();
            ruta.extension = event.getExtension();
            ruta.estado = event.getEstado();
            ruta.duracion = event.getDuracion();
            ruta.precio = event.getPrecio();
            ruta.terminalId = event.getTerminalId();
            ruta.poblaciones = new ArrayList<Poblacion>();
            ruta.vias = new ArrayList<Via>();
        });

        apply((ViaAgregada event) -> {
            ruta.vias.add(new Via(event.getEntityId(), event.getExtension(), event.getCantidadCarriles(), event.getEstado(), event.getRutaId()));
        });
    }
}
