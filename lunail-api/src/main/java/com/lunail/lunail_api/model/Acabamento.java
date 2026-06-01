package com.lunail.lunail_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table (name="acabamento")
public class Acabamento {
    @Id
    @Column(length = 36)
    private String id;
    @Column(length = 50, nullable = false,  unique = true)
    private String nomeAcabamento;
    @Column(length = 255)
    private String descricao;

    // construtor
    public Acabamento(String nomeAcabamento, String descricao) {
        this.id = UUID.randomUUID().toString();
        this.nomeAcabamento = nomeAcabamento;
        this.descricao = descricao;
    }

    // construtor db
    protected Acabamento() {}

    // get e set

    public String getNomeAcabamento() {
        return nomeAcabamento;
    }

    public void setNomeAcabamento(String nomeAcabamento) {
        this.nomeAcabamento = nomeAcabamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // get
    public String getId() {
        return id;
    }
}
