package com.lunail.lunail_api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @Column(length = 36)
    private String id;
    @Column(nullable = false, length = 100)
    private String nomeCompleto;
    @Column(nullable = false,  unique = true, length = 100) // true pq não pode ter 2 registros com o mesmo email
    private String email;
    @JsonIgnore // pra não aparecer a senha no json
    @Column(nullable = false,   length = 255)
    private String senha;
    @Column(nullable = false)
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

    // construtor pro banco de dados não travar. assim o JPA cria o objeto vazio, busca os dados no banco e depois preenche campo por campo usando os setters
    protected Usuario() {} // vai ser protected pra só o JPA usar esse construtor

}
