package com.flota_sofkalena.API.Cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.HashMap;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HoraInicioYLlegada implements ValueObject<HashMap<String, String>> {

    private final HashMap<String, String> value;

    public HoraInicioYLlegada(HashMap<String, String> value) {

        this.value = Objects.requireNonNull(value);
        if(!this.value.containsKey("horaInicio") || !this.value.containsKey("horaLlegada")){
            throw new IllegalArgumentException("Falta la key de hora inicio o de llegada, o ambas.");
        }
        if(this.value.get("horaInicio").isEmpty() || this.value.get("horaLlegada").isEmpty()){
            throw new IllegalArgumentException("Falta la hora de inicio o de llegada, o ambas.");
        }

        Pattern pattern = Pattern.compile("^(0[0-9]|1[0-9]|2[0-3]|[0-9]):[0-5][0-9]$");
        Matcher matcherHoraInicio = pattern.matcher(this.value.get("horaInicio"));
        Matcher matcherHoraLlegada = pattern.matcher(this.value.get("horaLlegada"));
        if(!matcherHoraInicio.matches() || !matcherHoraLlegada.matches()){
            throw new IllegalArgumentException("Estructura de la hora de inicio o de llegada o de ambas, inválida. Ej: hh:mm");
        }
    }

    public HashMap<String, String> value(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoraInicioYLlegada that = (HoraInicioYLlegada) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
