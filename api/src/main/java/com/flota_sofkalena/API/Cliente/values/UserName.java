package com.flota_sofkalena.API.Cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class UserName implements ValueObject<String> {

    private final String value;

    public UserName(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isEmpty()){
            throw new IllegalArgumentException("El nombre de usuario no puede ser vacío");
        }
    }

    public String value(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserName userName = (UserName) o;
        return Objects.equals(value, userName.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}