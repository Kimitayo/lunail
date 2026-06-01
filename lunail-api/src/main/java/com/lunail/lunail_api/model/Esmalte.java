package com.lunail.lunail_api.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Esmalte {
    private String fotoPath;
    private String id;
    private String nome;
    private String marca;
    private double preco;
    private LocalDate dataAquisicao;
    private CorPrincipal corPrincipal;
    private TipoEsmalte tipoEsmalte;
    private AcabamentoEsmalte acabamentoEsmalte;
    private NivelEsmalte nivelEsmalte;
    private String usuarioId; // pra separar os esmaltes de cada usuario
    private float nota;
    private String descricaoAvaliacao;
    private int vezesUsado;
    private ArrayList<LocalDate> registrosAnteriores;
    private boolean favorito; // coração roxo favoritos

    // construtor
    public Esmalte(String nome, String marca, double preco, LocalDate dataAquisicao, CorPrincipal corPrincipal, TipoEsmalte tipoEsmalte, AcabamentoEsmalte acabamentoEsmalte, NivelEsmalte nivelEsmalte, String  usuarioId) {
        this.fotoPath = null;
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.dataAquisicao = dataAquisicao;
        this.corPrincipal = corPrincipal;
        this.tipoEsmalte = tipoEsmalte;
        this.acabamentoEsmalte = acabamentoEsmalte;
        this.nivelEsmalte = nivelEsmalte;
        this.usuarioId = usuarioId; // vai pegar depois o id do usuario
        this.nota = 0;
        this.descricaoAvaliacao = null;
        this.vezesUsado = 0;
        this.registrosAnteriores = new ArrayList<>();
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
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

    public CorPrincipal getCorPrincipal() {
        return corPrincipal;
    }

    public void setCorPrincipal(CorPrincipal corPrincipal) {
        this.corPrincipal = corPrincipal;
    }

    public TipoEsmalte getTipoEsmalte() {
        return tipoEsmalte;
    }

    public void setTipoEsmalte(TipoEsmalte tipoEsmalte) {
        this.tipoEsmalte = tipoEsmalte;
    }

    public AcabamentoEsmalte getAcabamentoEsmalte() {
        return acabamentoEsmalte;
    }

    public void setAcabamentoEsmalte(AcabamentoEsmalte acabamentoEsmalte) {
        this.acabamentoEsmalte = acabamentoEsmalte;
    }

    public NivelEsmalte getNivelEsmalte() {
        return nivelEsmalte;
    }

    public void setNivelEsmalte(NivelEsmalte nivelEsmalte) {
        this.nivelEsmalte = nivelEsmalte;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getDescricaoAvaliacao() {
        return descricaoAvaliacao;
    }

    public void setDescricaoAvaliacao(String descricaoAvaliacao) {
        this.descricaoAvaliacao = descricaoAvaliacao;
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

    public int getVezesUsado() {
        return vezesUsado;
    }

    public ArrayList<LocalDate> getRegistrosAnteriores() {
        return registrosAnteriores;
    }
}
