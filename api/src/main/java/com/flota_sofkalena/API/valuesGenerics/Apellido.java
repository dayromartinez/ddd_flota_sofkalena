package com.flota_sofkalena.API.valuesGenerics;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Apellido implements ValueObject<String> {

    private final String value;

    public Apellido(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isEmpty()){
            throw new IllegalArgumentException("El apellido no puede ser vacío");
        }
    }

    public String value(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apellido apellido = (Apellido) o;
        return Objects.equals(value, apellido.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
