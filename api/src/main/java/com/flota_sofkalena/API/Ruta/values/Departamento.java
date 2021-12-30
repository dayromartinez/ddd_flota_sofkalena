package com.flota_sofkalena.API.Ruta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Departamento implements ValueObject<String> {

    private final String value;
    String[] departamentos = {"Atlántico", "Bolívar", "Cesar", "Córdoba", "La Guajira", "Magdalena", "Sucre",
            "Caldas", "Quindío", "Risaralda", "Tolima", "Boyacá", "Cundinamarca", "Meta", "Huila",
            "Cauca", "Chocó", "Nariño", "Valle del Cauca", "Amazonas", "Caquetá", "Guaviare", "Guainía",
            "Putumayo", "Vaupés", "Santander", "Norte de Santander", "Antioquia"};

    public Departamento(String value) {
        this.value = Objects.requireNonNull(value);
        var match = Arrays.stream(departamentos).filter(departamento -> departamento.equals(value))
                .findFirst().orElseThrow(() -> new IllegalArgumentException("El texto ingresado no corresponde a ninguno" +
                        "de los 32 departamentos de Colombia"));
    }

    public String value(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departamento that = (Departamento) o;
        return Objects.equals(value, that.value) && Arrays.equals(departamentos, that.departamentos);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(value);
        result = 31 * result + Arrays.hashCode(departamentos);
        return result;
    }
}