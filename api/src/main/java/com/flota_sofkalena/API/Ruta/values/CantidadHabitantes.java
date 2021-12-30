package com.flota_sofkalena.API.Ruta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CantidadHabitantes implements ValueObject<Integer> {

    private final Integer value;

    public CantidadHabitantes(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value <= 0 || this.value > 10000000){
            throw new IllegalArgumentException("La cantidad de habitantes de una población no puede ser menor o igual a 0, ni mayor a 10 millones de personas.");
        }
    }

    public Integer value(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CantidadHabitantes that = (CantidadHabitantes) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
