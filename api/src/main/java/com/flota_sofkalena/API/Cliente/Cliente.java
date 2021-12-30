package com.flota_sofkalena.API.Cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Cliente.entidades.Usuario;
import com.flota_sofkalena.API.Cliente.entidades.Viaje;
import com.flota_sofkalena.API.Cliente.events.*;
import com.flota_sofkalena.API.Cliente.values.*;
import com.flota_sofkalena.API.Ruta.values.RutaId;
import com.flota_sofkalena.API.valuesGenerics.Apellido;
import com.flota_sofkalena.API.valuesGenerics.Nombre;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Cliente extends AggregateEvent<ClienteId> {

    protected Nombre nombre;
    protected Apellido apellido;
    protected Celular celular;
    protected List<Viaje> viajes;
    protected UsuarioId usuarioId;
    protected Usuario usuario;
    protected ClienteId clienteId;

    public Cliente(ClienteId entityId, Nombre nombre, Apellido apellido, Celular celular) {
        super(entityId);
        appendChange(new ClienteCreado(nombre, apellido, celular)).apply();
    }
    
    private Cliente(ClienteId entityId){
        super(entityId);
        subscribe(new ClienteChange(this));
    }

    public static Cliente from(ClienteId clienteId, List<DomainEvent> events){
        var cliente = new Cliente(clienteId);
        events.forEach(cliente::applyEvent);
        return cliente;
    }

    public void actualizarNombre(Nombre nombre){
        Objects.requireNonNull(nombre);
        appendChange(new NombreClienteActualizado(nombre)).apply();
    }

    public void actualizarApellido(Apellido apellido){
        Objects.requireNonNull(apellido);
        appendChange(new ApellidoClienteActualizado(apellido)).apply();
    }

    public void actualizarCelular(Celular celular){
        Objects.requireNonNull(celular);
        appendChange(new CelularClienteActualizado(celular)).apply();
    }

    public void agregarCuentaUsuario(UsuarioId entityId, UserName userName, Email email){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(userName);
        Objects.requireNonNull(email);
        appendChange(new UsuarioAgregado(entityId, userName, email)).apply();
    }

    public void asociarUsuario(UsuarioId usuarioId){
        Objects.requireNonNull(usuarioId);
        appendChange(new UsuarioAsociado(usuarioId)).apply();
    }

    public void actualizarUsernameUsuario(UsuarioId usuarioId, UserName userName){
        Objects.requireNonNull(userName);
        Objects.requireNonNull(usuarioId);
        appendChange(new UserNameUsuarioActualizado(usuarioId, userName)).apply();
    }

    public void actualizarEmailUsuario(UsuarioId usuarioId, Email email){
        Objects.requireNonNull(usuarioId);
        Objects.requireNonNull(email);
        appendChange(new EmailUsuarioActualizado(usuarioId,email)).apply();
    }

    public void agregarViaje(ViajeId entityId, FechaViaje fechaViaje, HoraInicioYLlegada horaInicioYLlegada, RutaId rutaId, ClienteId clienteId){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(fechaViaje);
        Objects.requireNonNull(horaInicioYLlegada);
        Objects.requireNonNull(rutaId);
        Objects.requireNonNull(clienteId);
        appendChange(new ViajeAgregado(entityId, fechaViaje, horaInicioYLlegada, rutaId, clienteId)).apply();
    }

    public void actualizarFechaViaje(ViajeId viajeId, FechaViaje fechaViaje){
        Objects.requireNonNull(viajeId);
        Objects.requireNonNull(fechaViaje);
        appendChange(new FechaViajeActualizada(viajeId,fechaViaje)).apply();
    }

    public void actualizarHoraInicioYLlegadaViaje(ViajeId viajeId, HoraInicioYLlegada horaInicioYLlegada){
        Objects.requireNonNull(viajeId);
        Objects.requireNonNull(horaInicioYLlegada);
        appendChange(new HoraInicioYLlegadaViajeActualizada(viajeId, horaInicioYLlegada)).apply();
    }

    public void actualizarViajesUsuario(UsuarioId usuarioId, List<Viaje> viajes){
        Objects.requireNonNull(usuarioId);
        Objects.requireNonNull(viajes);
        appendChange(new ViajesUsuarioActualizado(usuarioId, viajes));
    }

    public Optional<Viaje> getViajePorId(ViajeId viajeId){
        return viajes.stream()
                .filter((viaje) -> viaje.identity().equals(viajeId))
                .findFirst();
    }

    public Nombre nombre() {
        return nombre;
    }

    public Apellido apellido() {
        return apellido;
    }

    public Celular celular() {
        return celular;
    }

    public List<Viaje> viajes() {
        return viajes;
    }

    public Usuario usuario(){
        return usuario;
    }

    public UsuarioId usuarioId() {
        return usuarioId;
    }

    public ClienteId clienteId() {
        return clienteId;
    }
}
