package com.flota_sofkalena.API.Terminal.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.flota_sofkalena.API.Terminal.values.BusId;
import com.flota_sofkalena.API.Terminal.values.Categoria;

public class CategoriaBusActualizada extends DomainEvent {

    private final BusId busId;
    private final Categoria categoria;

    public CategoriaBusActualizada(BusId busId, Categoria categoria) {
        super("flota_sofkalena.terminal.categoriabusactualizada");
        this.busId = busId;
        this.categoria = categoria;
    }

    public BusId getBusId() {
        return busId;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
