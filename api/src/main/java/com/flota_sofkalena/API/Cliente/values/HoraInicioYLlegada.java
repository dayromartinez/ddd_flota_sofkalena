package com.flota_sofkalena.API.Cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.HashMap;

public class HoraInicioYLlegada implements ValueObject<HashMap<String, String>> {
    public HashMap<String, String> value(){
        return new HashMap<>();
    }
}
