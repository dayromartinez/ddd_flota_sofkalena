package com.flota_sofkalena.API.Ruta.values;

import co.com.sofka.domain.generic.Identity;

public class PoblacionId extends Identity {

    public PoblacionId() {
    }

    private PoblacionId(String id) {
        super(id);
    }

    public static PoblacionId of(String id){
        return new PoblacionId(id);
    }
}
