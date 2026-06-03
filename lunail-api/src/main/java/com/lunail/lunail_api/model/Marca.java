package com.lunail.lunail_api.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "marca")
public class Marca {
    @Id
    @Column(length = 36)
    private String id;
    @Column(length = 100, nullable = false, unique = true)
    private String nome;
    @Enumerated(EnumType.STRING) // pra usar o tipoEsmalte enum no bd
    @Column(length = 20, nullable = false)
    private TipoEsmalte tipoEsmalte;

    // construtor
    public Marca(String nome, TipoEsmalte tipoEsmalte) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.tipoEsmalte = tipoEsmalte;
    }

    // construtor pro bd
    protected Marca() {}

    // getter e setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoEsmalte getTipoEsmalte() {
        return tipoEsmalte;
    }

    public void setTipoEsmalte(TipoEsmalte tipoEsmalte) {
        this.tipoEsmalte = tipoEsmalte;
    }

    public String getId() {
        return id;
    }
}
