package com.flota_sofkalena.API.Cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Celular implements ValueObject<Integer> {

    private final Integer value;

    public Celular(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value < 300000000 || this.value > 399999999){
            throw new IllegalArgumentException("El número celular debe ser de 9 dígitos, donde el primer dígito siempre es 3");
        }
    }

    public Integer value(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Celular celular = (Celular) o;
        return Objects.equals(value, celular.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
