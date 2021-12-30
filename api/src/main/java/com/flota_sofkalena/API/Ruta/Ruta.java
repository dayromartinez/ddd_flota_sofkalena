package com.flota_sofkalena.API.Ruta;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Ruta.entidades.Poblacion;
import com.flota_sofkalena.API.Ruta.entidades.Via;
import com.flota_sofkalena.API.Ruta.events.*;
import com.flota_sofkalena.API.Ruta.values.*;
import com.flota_sofkalena.API.Terminal.values.TerminalId;
import com.flota_sofkalena.API.valuesGenerics.Estado;
import com.flota_sofkalena.API.valuesGenerics.Nombre;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Ruta extends AggregateEvent<RutaId> {

    protected Nombre nombre;
    protected Extension extension;
    protected Estado estado;
    protected Duracion duracion;
    protected Precio precio;
    protected List<Poblacion> poblaciones;
    protected List<Via> vias;
    protected RutaId rutaId;
    protected TerminalId terminalId;

    public Ruta(RutaId entityId, Nombre nombre, Extension extension, Estado estado, Duracion duracion, Precio precio, TerminalId terminalId) {
        super(entityId);
        appendChange(new RutaCreada(entityId, nombre, extension, estado, duracion, precio, terminalId)).apply();
    }

    private Ruta(RutaId entityId){
        super(entityId);
        subscribe(new RutaChange(this));
    }

    public static Ruta from(RutaId rutaId, List<DomainEvent> events){
        var ruta = new Ruta(rutaId);
        events.forEach(ruta::applyEvent);
        return ruta;
    }

    public void actualizarNombre(Nombre nombre){
        Objects.requireNonNull(nombre);
        appendChange(new NombreRutaActualizado(nombre)).apply();
    }

    public void actualizarExtension(Extension extension){
        Objects.requireNonNull(extension);
        appendChange(new ExtensionRutaActualizada(extension)).apply();
    }

    public void actualizarEstado(Estado estado){
        Objects.requireNonNull(estado);
        appendChange(new EstadoRutaActualizado(estado)).apply();
    }

    public void actualizarDuracion(Duracion duracion){
        Objects.requireNonNull(duracion);
        appendChange(new DuracionRutaActualizada(duracion)).apply();
    }

    public void actualizarPrecio(Precio precio){
        Objects.requireNonNull(precio);
        appendChange(new PrecioRutaActualizado(precio)).apply();
    }

    public void agregarPoblacion(PoblacionId entityId, Nombre nombre, Departamento departamento, CantidadHabitantes cantidadHabitantes, RutaId rutaId){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(departamento);
        Objects.requireNonNull(cantidadHabitantes);
        Objects.requireNonNull(rutaId);
        appendChange(new PoblacionAgregada(entityId, nombre, departamento, cantidadHabitantes, rutaId)).apply();
    }

    public void actualizarNombrePoblacion(PoblacionId poblacionId, Nombre nombre){
        Objects.requireNonNull(poblacionId);
        Objects.requireNonNull(nombre);
        appendChange(new NombrePoblacionActualizado(poblacionId, nombre)).apply();
    }

    public void actualizarCantidadHabitantesPoblacion(PoblacionId poblacionId, CantidadHabitantes cantidadHabitantes){
        Objects.requireNonNull(poblacionId);
        Objects.requireNonNull(cantidadHabitantes);
        appendChange(new CantidadHabitantesPoblacionActualizada(poblacionId, cantidadHabitantes)).apply();
    }

    public void agregarVia(ViaId entityId, Extension extension, CantidadCarriles cantidadCarriles, Estado estado, RutaId rutaId){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(extension);
        Objects.requireNonNull(cantidadCarriles);
        Objects.requireNonNull(estado);
        Objects.requireNonNull(rutaId);
        appendChange(new ViaAgregada(entityId, extension, cantidadCarriles, estado, rutaId)).apply();
    }

    public void actualizarExtensionVia(ViaId viaId, Extension extension){
        Objects.requireNonNull(viaId);
        Objects.requireNonNull(extension);
        appendChange(new ExtensionViaActualizada(viaId, extension)).apply();
    }

    public void actualizarCantidadCarrilesVia(ViaId viaId, CantidadCarriles cantidadCarriles){
        Objects.requireNonNull(viaId);
        Objects.requireNonNull(cantidadCarriles);
        appendChange(new CantidadCarrilesViaActualizada(viaId, cantidadCarriles)).apply();
    }

    public void actualizarEstadoVia(ViaId viaId, Estado estado){
        Objects.requireNonNull(viaId);
        Objects.requireNonNull(estado);
        appendChange(new EstadoViaActualizado(viaId, estado)).apply();
    }

    public Optional<Poblacion> getPoblacionPorPoblacionId(PoblacionId poblacionId){
        return poblaciones.stream()
                .filter(poblacion -> poblacion.identity().equals(poblacionId))
                .findFirst();
    }

    public Optional<Via> getViaPorViaId(ViaId viaId){
        return vias.stream()
                .filter(via -> via.identity().equals(viaId))
                .findFirst();
    }

    public Nombre nombre() {
        return nombre;
    }

    public Extension extension() {
        return extension;
    }

    public Estado estado() {
        return estado;
    }

    public Duracion duracion() {
        return duracion;
    }

    public Precio precio() {
        return precio;
    }

    public List<Poblacion> poblaciones() {
        return poblaciones;
    }

    public List<Via> vias() {
        return vias;
    }

    public RutaId rutaId() {
        return rutaId;
    }

    public TerminalId terminalId() {
        return terminalId;
    }
}
