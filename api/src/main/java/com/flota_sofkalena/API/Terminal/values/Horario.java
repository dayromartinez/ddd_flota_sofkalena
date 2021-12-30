package com.flota_sofkalena.API.Terminal.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Horario implements ValueObject<String> {

    private final String value;

    public Horario(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isEmpty()){
            throw new IllegalArgumentException("El horario del terminal no puede ser nulo");
        }
    }

    public String value(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horario horario = (Horario) o;
        return Objects.equals(value, horario.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
