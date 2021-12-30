package com.flota_sofkalena.API.Ruta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Extension implements ValueObject<String> {

    private final String value;

    public Extension(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isEmpty()){
            throw new IllegalArgumentException("La distancia de la ruta no puede ser vacía.");
        }
    }

    public String value(){
        return value();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Extension extension = (Extension) o;
        return Objects.equals(value, extension.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
