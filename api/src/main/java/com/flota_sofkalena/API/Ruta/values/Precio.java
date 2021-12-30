package com.flota_sofkalena.API.Ruta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Precio implements ValueObject<String> {

    private final String value;

    public Precio(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isEmpty()){
            throw new IllegalArgumentException("El precio de esta ruta no puede ser nulo");
        }
        Pattern pattern = Pattern.compile("^(?!0\\.00)[1-9]\\d{0,2}(,\\d{3})*(\\.\\d\\d)?$");
        Matcher matcher = pattern.matcher(this.value);
        if(!matcher.matches()){
            throw new IllegalArgumentException("Estructura del precio inválida. Ej: 100.00 o 1,000.00");
        }
    }

    public String value(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Precio precio = (Precio) o;
        return Objects.equals(value, precio.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
