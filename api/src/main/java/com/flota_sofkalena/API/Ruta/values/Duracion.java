package com.flota_sofkalena.API.Ruta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Duracion implements ValueObject<String> {

    private final String value;

    public Duracion(String value) {
        this.value = Objects.requireNonNull(value);
        Pattern pattern = Pattern.compile("^(0[0-9]|1[0-9]|2[0-3]|[0-9]):[0-5][0-9]$");
        Matcher matcher = pattern.matcher(this.value);
        if(matcher.matches()){
            throw new IllegalArgumentException("Estructura del tiempo de duración de la ruta inválida. Ej: hh:mm");
        }
    }

    public String value(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duracion duracion = (Duracion) o;
        return Objects.equals(value, duracion.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
