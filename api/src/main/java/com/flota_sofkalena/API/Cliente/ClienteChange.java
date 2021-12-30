package com.flota_sofkalena.API.Cliente;

import co.com.sofka.domain.generic.EventChange;
import com.flota_sofkalena.API.Cliente.entidades.Usuario;
import com.flota_sofkalena.API.Cliente.entidades.Viaje;
import com.flota_sofkalena.API.Cliente.events.*;

import java.util.ArrayList;

public class ClienteChange extends EventChange {
    public ClienteChange(Cliente cliente) {

        apply((ApellidoClienteActualizado event) -> {
            cliente.apellido = event.getApellido();
        });

        apply((CelularClienteActualizado event) -> {
            cliente.celular = event.getCelular();
        });

        apply((ClienteCreado event) -> {
            cliente.nombre = event.getNombre();
            cliente.apellido = event.getApellido();
            cliente.celular = event.getCelular();
            cliente.viajes = new ArrayList<Viaje>();
        });

        apply((EmailUsuarioActualizado event) -> {
            cliente.usuario.actualizarEmail(event.getEmail());
        });

        apply((FechaViajeActualizada event) -> {
            var viaje = cliente.getViajePorId(event.getViajeId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra el viaje especificado de este cliente"));
            viaje.actualizarFechaViaje(event.getFechaViaje());
        });

        apply((HoraInicioYLlegadaViajeActualizada event) -> {
            var viaje = cliente.getViajePorId(event.getViajeId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra el viaje especificado de este cliente"));
            viaje.actualizarHoraInicioYLlegada(event.getHoraInicioYLlegada());
        });

        apply((NombreClienteActualizado event) -> {
            cliente.nombre = event.getNombre();
        });

        apply((UserNameUsuarioActualizado event) -> {
            cliente.usuario.actualizarUserName(event.getUserName());
        });

        apply((UsuarioAgregado event) -> {
            cliente.usuario = new Usuario(event.getUsuarioId(), event.getUserName(), event.getEmail());
        });

        apply((UsuarioAsociado event) -> {
            cliente.usuarioId = event.getUsuarioId();
        });

        apply((ViajeAgregado event) -> {
            cliente.viajes.add(new Viaje(event.getEntityId(), event.getFechaViaje(), event.getHoraInicioYLlegada(), event.getRutaId(), event.getClienteId()));
        });

        apply((ViajesUsuarioActualizado event) -> {
            cliente.usuario.actualizarViajes(event.getViajes());
        });
    }
}
