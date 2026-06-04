package com.lunail.lunail_api.dto;

public class CadastroDTO {
    private String nomeCompleto;
    private String email;
    private String senha;
    private String confirmarSenha;

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }

    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    // vai precisar dos setters pra quando a requisição chegar pra preencher os atributos

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }
}
