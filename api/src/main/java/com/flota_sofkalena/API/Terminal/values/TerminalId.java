package com.flota_sofkalena.API.Terminal.values;

import co.com.sofka.domain.generic.Identity;

public class TerminalId extends Identity {

    public TerminalId() {
    }

    private TerminalId(String id) {
        super(id);
    }

    public static TerminalId of(String id){
        return new TerminalId(id);
    }
}
