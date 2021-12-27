package com.flota_sofkalena.API.Terminal;

import co.com.sofka.domain.generic.AggregateEvent;
import com.flota_sofkalena.API.Ruta.Ruta;
import com.flota_sofkalena.API.Terminal.entidades.Bus;
import com.flota_sofkalena.API.Terminal.entidades.Conductor;
import com.flota_sofkalena.API.Terminal.values.Capacidad;
import com.flota_sofkalena.API.Terminal.values.Direccion;
import com.flota_sofkalena.API.Terminal.values.Horario;
import com.flota_sofkalena.API.Terminal.values.TerminalId;
import com.flota_sofkalena.API.valuesGenerics.Dimensiones;

import java.util.List;

public class Terminal extends AggregateEvent<TerminalId> {

    protected Direccion direccion;
    protected Dimensiones dimensiones;
    protected Horario horario;
    protected Capacidad capacidad;
    protected List<Bus> busesTerminal;
    protected List<Ruta> rutasTerminal;
    protected List<Conductor> conductoresTerminal;

    public Terminal(TerminalId entityId, Direccion direccion, Dimensiones dimensiones, Horario horario, Capacidad capacidad) {
        super(entityId);
    }
}
