package com.lunail.lunail_api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "cor")
public class Cor {
    @Id
    @Column(length = 36)
    private String id;
    @Column(length = 100, nullable = false, unique = true)
    private String nomeCor;
    @Column(length = 7, nullable = false, unique = true)
    private String hexadecimal;

    // construtor
    public Cor(String nomeCor, String hexadecimal) {
        this.id = UUID.randomUUID().toString();
        this.nomeCor = nomeCor;
        this.hexadecimal = hexadecimal;
    }

    // construtor pro bd
    protected Cor() {}

    // set e get

    public String getNomeCor() {
        return nomeCor;
    }

    public void setNomeCor(String nomeCor) {
        this.nomeCor = nomeCor;
    }

    public String getHexadecimal() {
        return hexadecimal;
    }

    public void setHexadecimal(String hexadecimal) {
        this.hexadecimal = hexadecimal;
    }

    public String getId() {
        return id;
    }
}
