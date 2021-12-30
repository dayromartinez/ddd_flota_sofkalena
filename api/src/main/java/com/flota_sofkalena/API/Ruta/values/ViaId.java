package com.flota_sofkalena.API.Ruta.values;

import co.com.sofka.domain.generic.Identity;

public class ViaId extends Identity {

    public ViaId() {
    }

    private ViaId(String id) {
        super(id);
    }

    public static ViaId of(String id){
        return new ViaId(id);
    }
}
