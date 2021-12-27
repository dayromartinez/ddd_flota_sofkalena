package com.flota_sofkalena.API.Cliente.entidades;

import co.com.sofka.domain.generic.Entity;
import com.flota_sofkalena.API.Cliente.values.Celular;
import com.flota_sofkalena.API.Cliente.values.Email;
import com.flota_sofkalena.API.Cliente.values.UserName;
import com.flota_sofkalena.API.Cliente.values.UsuarioId;
import com.flota_sofkalena.API.valuesGenerics.Apellido;
import com.flota_sofkalena.API.valuesGenerics.Nombre;
import org.apache.catalina.User;

import java.util.List;
import java.util.Objects;

public class Usuario extends Entity<UsuarioId> {

    private UserName userName;
    private Email email;
    private List<Viaje> viajesUsuario;

    public Usuario(UsuarioId entityId, UserName userName, Email email) {
        super(entityId);
        this.userName = userName;
        this.email = email;
    }

    public void actualizarUserName(UserName userName) {
        this.userName = Objects.requireNonNull(userName);
    }

    public void actualizarEmail(Email email){
        this.email = Objects.requireNonNull(email);
    }

    public UserName userName(){
        return userName;
    }

    public Email email(){
        return email;
    }
}
