package com.flota_sofkalena.API.Cliente.values;

import co.com.sofka.domain.generic.Identity;

public class ViajeId extends Identity {

    public ViajeId() {
    }

    private ViajeId(String id) {
        super(id);
    }

    public static ViajeId of(String id){
        return new ViajeId(id);
    }
}
