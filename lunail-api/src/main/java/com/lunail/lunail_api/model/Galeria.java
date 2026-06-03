package com.lunail.lunail_api.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name="galeria")
public class Galeria {
    @Id
    @Column(length = 36)
    private String id;
    @Column(length = 500, nullable = false)
    private String path;
    @Column(nullable = false)
    private LocalDate dataUpload;
    @ManyToOne
    @JoinColumn(name="esmalte_id", nullable = false)
    private Esmalte esmalte;

    // construtor
    public Galeria(String path, LocalDate dataUpload, Esmalte esmalte) {
        this.id = UUID.randomUUID().toString();
        this.path = path;
        this.dataUpload = dataUpload;
        this.esmalte = esmalte;
    }

    // construtor db
    protected Galeria() {}

    // getter e setter

    public Esmalte getEsmalte() {
        return esmalte;
    }

    public String getId() {
        return id;
    }

    public LocalDate getDataUpload() {
        return dataUpload;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
