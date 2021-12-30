package com.flota_sofkalena.API.Ruta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CantidadCarriles implements ValueObject<Integer> {

    private final Integer value;

    public CantidadCarriles(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value <= 0 || this.value > 5){
            throw new IllegalArgumentException("La cantidad mínima de carriles por vía es de 1, y la cantidad máxima es de 5.");
        }
    }

    public Integer value(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CantidadCarriles that = (CantidadCarriles) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
