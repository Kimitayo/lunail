package com.lunail.lunail_api.dto;

import java.time.LocalDate;

public class EsmalteDTO {
    private String nome;
    private String marcaId;
    private LocalDate dataAquisicao;
    private String corId;
    private String acabamentoId;
    private String nivelEsmalte;
    private String usuarioId;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getMarcaId() { return marcaId; }
    public void setMarcaId(String marcaId) { this.marcaId = marcaId; }

    public LocalDate getDataAquisicao() { return dataAquisicao; }
    public void setDataAquisicao(LocalDate dataAquisicao) { this.dataAquisicao = dataAquisicao; }

    public String getCorId() { return corId; }
    public void setCorId(String corId) { this.corId = corId; }

    public String getAcabamentoId() { return acabamentoId; }
    public void setAcabamentoId(String acabamentoId) { this.acabamentoId = acabamentoId; }

    public String getNivelEsmalte() { return nivelEsmalte; }
    public void setNivelEsmalte(String nivelEsmalte) { this.nivelEsmalte = nivelEsmalte; }

    public String getUsuarioId() { return usuarioId; }
    public void setUsuarioId(String usuarioId) { this.usuarioId = usuarioId; }
}