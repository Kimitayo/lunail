package com.lunail.lunail_api.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "esmalte")
public class Esmalte {
    @Column(length = 500)
    private String fotoPath;
    @Id
    @Column(length = 36)
    private String id;
    @Column(length = 100, nullable = false)
    private String nome;
    @ManyToOne
    @JoinColumn(name = "marca_id",  nullable = false)
    private Marca marca;
    @Column()
    private BigDecimal preco;
    @Column(nullable = false)
    private LocalDate dataAquisicao;
    @ManyToOne
    @JoinColumn(name = "cor_id", nullable = false)
    private Cor corPrincipal;
    @ManyToOne
    @JoinColumn(name = "acabamento_id",  nullable = false)
    private Acabamento acabamentoEsmalte;
    @Enumerated(EnumType.STRING)
    @Column(length = 20, nullable = false)
    private NivelEsmalte nivelEsmalte;
    @ManyToOne
    @JoinColumn(name = "usuario_id",  nullable = false)
    private Usuario usuario; // pra separar os esmaltes de cada usuario
    @Column(nullable = false)
    private boolean favorito; // coração roxo favoritos

    // construtor
    public Esmalte(String nome, Marca marca, LocalDate dataAquisicao, Cor corPrincipal, Acabamento acabamentoEsmalte, NivelEsmalte nivelEsmalte, Usuario  usuario) {
        this.fotoPath = null;
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.marca = marca;
        this.preco = null;
        this.dataAquisicao = dataAquisicao;
        this.corPrincipal = corPrincipal;
        this.acabamentoEsmalte = acabamentoEsmalte;
        this.nivelEsmalte = nivelEsmalte;
        this.usuario = usuario;
        this.favorito = false;
    }

    // construtor bd
    protected Esmalte() {}

    // set e get

    public String getFotoPath() {
        return fotoPath;
    }

    public void setFotoPath(String fotoPath) {
        this.fotoPath = fotoPath;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public LocalDate getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(LocalDate dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public Cor getCorPrincipal() {
        return corPrincipal;
    }

    public void setCorPrincipal(Cor corPrincipal) {
        this.corPrincipal = corPrincipal;
    }

    public Acabamento getAcabamentoEsmalte() {
        return acabamentoEsmalte;
    }

    public void setAcabamentoEsmalte(Acabamento acabamentoEsmalte) {
        this.acabamentoEsmalte = acabamentoEsmalte;
    }

    public NivelEsmalte getNivelEsmalte() {
        return nivelEsmalte;
    }

    public void setNivelEsmalte(NivelEsmalte nivelEsmalte) {
        this.nivelEsmalte = nivelEsmalte;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    // somente get
    public String getId() {
        return id;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
