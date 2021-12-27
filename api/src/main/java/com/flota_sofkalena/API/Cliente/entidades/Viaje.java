package com.flota_sofkalena.API.Cliente.entidades;

import co.com.sofka.domain.generic.Entity;
import com.flota_sofkalena.API.Cliente.values.ClienteId;
import com.flota_sofkalena.API.Cliente.values.FechaViaje;
import com.flota_sofkalena.API.Cliente.values.HoraInicioYLlegada;
import com.flota_sofkalena.API.Cliente.values.ViajeId;
import com.flota_sofkalena.API.Ruta.values.RutaId;

import java.util.Objects;

public class Viaje extends Entity<ViajeId> {

    private FechaViaje fechaViaje;
    private HoraInicioYLlegada horaInicioYLlegada;
    private RutaId rutaId;
    private ClienteId clienteId;

    public Viaje(ViajeId entityId, FechaViaje fechaViaje, HoraInicioYLlegada horaInicioYLlegada, RutaId rutaId, ClienteId clienteId) {
        super(entityId);
        this.fechaViaje = fechaViaje;
        this.horaInicioYLlegada = horaInicioYLlegada;
    }

    public void actualizarFechaViaje(FechaViaje fechaViaje){
        this.fechaViaje = Objects.requireNonNull(fechaViaje);
    }

    public void actualizarHoraInicioYLlegada(HoraInicioYLlegada horaInicioYLlegada){
        this.horaInicioYLlegada = Objects.requireNonNull(horaInicioYLlegada);
    }

    public void asociarRuta(RutaId rutaId){
        this.rutaId = Objects.requireNonNull(rutaId);
    }

    public FechaViaje fechaViaje() {
        return fechaViaje;
    }

    public HoraInicioYLlegada horaInicioYLlegada() {
        return horaInicioYLlegada;
    }

    public ClienteId clienteId() {
        return clienteId;
    }

    public RutaId rutaId() {
        return rutaId;
    }
}
