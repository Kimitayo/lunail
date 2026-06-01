package com.lunail.lunail_api.model;

import java.time.LocalDate;
import java.util.UUID;

public class Usuario {
    private String id;
    private String nomeCompleto;
    private String email;
    private String senha;
    private LocalDate dataCadastro;


    // get e set
    public String getId() {
        return id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    // construtor
    public Usuario(String nomeCompleto, String email, String senha) { // precisa ser public pra que outras partes do sistem consigar criar Usuario
        this.id = UUID.randomUUID().toString();
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.senha = senha;
        this.dataCadastro = LocalDate.now();
    }
}
