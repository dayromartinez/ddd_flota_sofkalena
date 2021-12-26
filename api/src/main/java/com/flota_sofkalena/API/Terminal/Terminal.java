package com.flota_sofkalena.API.Terminal;

import co.com.sofka.domain.generic.AggregateEvent;
import com.flota_sofkalena.API.Terminal.values.TerminalId;

public class Terminal extends AggregateEvent<TerminalId> {

    public Terminal(TerminalId entityId) {
        super(entityId);
    }
}
