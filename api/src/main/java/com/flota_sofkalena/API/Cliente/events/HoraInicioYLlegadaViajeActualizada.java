package com.flota_sofkalena.API.Cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Cliente.values.HoraInicioYLlegada;
import com.flota_sofkalena.API.Cliente.values.ViajeId;

public class HoraInicioYLlegadaViajeActualizada extends DomainEvent {

    private final ViajeId viajeId;
    private final HoraInicioYLlegada horaInicioYLlegada;

    public HoraInicioYLlegadaViajeActualizada(ViajeId viajeId, HoraInicioYLlegada horaInicioYLlegada) {
        super("flota_sofkalena.cliente.horainicioyllegadaviajeactualizada");
        this.viajeId = viajeId;
        this.horaInicioYLlegada = horaInicioYLlegada;
    }

    public ViajeId getViajeId() {
        return viajeId;
    }

    public HoraInicioYLlegada getHoraInicioYLlegada() {
        return horaInicioYLlegada;
    }
}
