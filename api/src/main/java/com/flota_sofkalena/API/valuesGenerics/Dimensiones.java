package com.flota_sofkalena.API.valuesGenerics;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Dimensiones implements ValueObject<String> {

    private final String value;

    public Dimensiones(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isEmpty()){
            throw new IllegalArgumentException("Las dimensiones no pueden omitirse");
        }
    }

    public String value(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dimensiones that = (Dimensiones) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
