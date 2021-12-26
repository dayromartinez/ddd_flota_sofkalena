package com.flota_sofkalena.API.Ruta;

import co.com.sofka.domain.generic.AggregateEvent;
import com.flota_sofkalena.API.Ruta.entidades.Poblacion;
import com.flota_sofkalena.API.Ruta.entidades.Via;
import com.flota_sofkalena.API.Ruta.values.Duracion;
import com.flota_sofkalena.API.Ruta.values.Extension;
import com.flota_sofkalena.API.Ruta.values.Precio;
import com.flota_sofkalena.API.Ruta.values.RutaId;
import com.flota_sofkalena.API.valuesGenerics.Estado;
import com.flota_sofkalena.API.valuesGenerics.Nombre;
import java.util.List;

public class Ruta extends AggregateEvent<RutaId> {

    protected Nombre nombre;
    protected Extension extension;
    protected Estado estado;
    protected Duracion duracion;
    protected Precio precio;
    protected List<Poblacion> poblacionesRuta;
    protected List<Via> viasRuta;

    public Ruta(RutaId entityId, Nombre nombre, Extension extension, Estado estado, Duracion duracion, Precio precio) {
        super(entityId);
    }
}
