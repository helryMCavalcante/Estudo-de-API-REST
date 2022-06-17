package com.estudoDeApi.estudoDeApi.model;

import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Usuarios")
public class UsuarioModel {
    @Id
    public Integer id;
    @Column (nullable = false, length = 50)
    public String nome;
    @Column (nullable = false, length = 10)
    public String login;
    @Column(nullable = false, length = 10)
    public String senha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
