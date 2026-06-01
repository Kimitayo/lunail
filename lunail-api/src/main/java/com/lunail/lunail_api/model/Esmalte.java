package com.lunail.lunail_api.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Esmalte {
    private String fotoPath;
    private String id;
    private String nome;
    private Marca marca;
    private double preco;
    private LocalDate dataAquisicao;
    private Cor corPrincipal;
    private Acabamento acabamentoEsmalte;
    private NivelEsmalte nivelEsmalte;
    private String usuarioId; // pra separar os esmaltes de cada usuario
    private boolean favorito; // coração roxo favoritos

    // construtor
    public Esmalte(String nome, Marca marca, double preco, LocalDate dataAquisicao, Cor corPrincipal, Acabamento acabamentoEsmalte, NivelEsmalte nivelEsmalte, String  usuarioId) {
        this.fotoPath = null;
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.dataAquisicao = dataAquisicao;
        this.corPrincipal = corPrincipal;
        this.acabamentoEsmalte = acabamentoEsmalte;
        this.nivelEsmalte = nivelEsmalte;
        this.usuarioId = usuarioId; // vai pegar depois o id do usuario
        this.favorito = false;
    }

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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
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

    public String getUsuarioId() {
        return usuarioId;
    }

}
