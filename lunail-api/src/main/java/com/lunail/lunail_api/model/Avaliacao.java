package com.lunail.lunail_api.model;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name="avaliacao")
public class Avaliacao {
    @Id
    @Column(length = 36)
    private String id;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "esmalte_id")
    private Esmalte esmalte;
    @Column(nullable = false)
    private float nota;
    @Column(nullable = false)
    private LocalDate dataAvaliacao;
    @Column(length = 255)
    private String comentario;

    // construtor
    public Avaliacao(float nota, String comentario, LocalDate dataAvaliacao, Usuario usuario, Esmalte esmalte) {
        this.id = UUID.randomUUID().toString();
        this.usuario = usuario;
        this.esmalte = esmalte;
        this.nota = nota;
        this.dataAvaliacao = dataAvaliacao;
        this.comentario = comentario;
    }

    // construtor pro db
    protected Avaliacao() {}

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setDataAvaliacao(LocalDate dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Esmalte getEsmalte() {
        return esmalte;
    }

    public String getId() {
        return id;
    }
}
