package com.flota_sofkalena.API.Terminal.values;

import co.com.sofka.domain.generic.Identity;

public class BusId extends Identity {

    public BusId() {
    }

    private BusId(String id) {
        super(id);
    }

    public static BusId of(String id){
        return new BusId(id);
    }
}
