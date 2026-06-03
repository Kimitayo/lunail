package com.lunail.lunail_api.model;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name="registroUso")
public class RegistroUso {
    @Id
    @Column(nullable = false, length = 36)
    private String id;
    @Column(nullable = false)
    private LocalDate dataUso;
    @ManyToOne
    @JoinColumn(name="esmalte_id", nullable = false)
    private Esmalte esmalte;

    // construtor
    public RegistroUso(Esmalte esmalte, LocalDate dataUso) {
        this.id = UUID.randomUUID().toString();
        this.esmalte = esmalte;
        this.dataUso = dataUso;
    }

    // construtor pro db
    protected RegistroUso() {}

    // getter e setter
    public String getId() {
        return id;
    }

    public LocalDate getDataUso() {
        return dataUso;
    }

    public Esmalte getEsmalte() {
        return esmalte;
    }

}
