package com.flota_sofkalena.API.Cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import com.flota_sofkalena.API.Cliente.entidades.Viaje;
import com.flota_sofkalena.API.Cliente.values.Celular;
import com.flota_sofkalena.API.Cliente.values.ClienteId;
import com.flota_sofkalena.API.Cliente.values.UsuarioId;
import com.flota_sofkalena.API.valuesGenerics.Apellido;
import com.flota_sofkalena.API.valuesGenerics.Nombre;

import java.util.List;

public class Cliente extends AggregateEvent<ClienteId> {

    protected Nombre nombre;
    protected Apellido apellido;
    protected Celular celular;
    protected List<Viaje> historialDeViajes;
    protected UsuarioId usuarioId;

    public Cliente(ClienteId entityId, Nombre nombre, Apellido apellido, Celular celular) {
        super(entityId);
    }
}
