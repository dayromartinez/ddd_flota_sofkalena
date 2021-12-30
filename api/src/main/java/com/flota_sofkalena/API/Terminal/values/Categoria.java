package com.flota_sofkalena.API.Terminal.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Categoria implements ValueObject<String> {

    private final String value;

    public Categoria(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isEmpty()){
            throw new IllegalArgumentException("La categoría no puede ser nula");
        }
        if(!"Bus pequeño".equals(this.value) && !"Bus mediano".equals(this.value) && !"Bus grande".equals(this.value)){
            throw new IllegalArgumentException("El texto ingresado no corresponde a ninguna de las 3 categorías" +
                    "diponibles: 'Bus pequeño', 'Bus mediano' o 'Bus grande'.");
        }
    }

    public String value(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(value, categoria.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
