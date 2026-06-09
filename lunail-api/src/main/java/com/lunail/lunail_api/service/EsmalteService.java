package com.lunail.lunail_api.service;

import com.lunail.lunail_api.model.*;
import com.lunail.lunail_api.repository.EsmalteRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class EsmalteService {
    private final EsmalteRepository esmalteRepository; // conectar ao esmalteRepository

    public EsmalteService(EsmalteRepository esmalteRepository) {
        this.esmalteRepository = esmalteRepository;
    }

    // construtores lógicos
    public Esmalte cadastrar(String nome, Marca marca, LocalDate dataAquisicao, Cor corPrincipal, Acabamento acabamentoEsmalte, NivelEsmalte nivelEsmalte, Usuario usuario) {
        // verificar se os campos obrigatorios foram preenchedos
        if ((nome == null || nome.isBlank()) || marca == null || acabamentoEsmalte == null || nivelEsmalte == null || corPrincipal == null || dataAquisicao == null) {
            throw new RuntimeException("Verifique todos os campos obrigatórios!");
        } else {
            Esmalte novoEsmalte = new Esmalte(nome, marca, dataAquisicao, corPrincipal, acabamentoEsmalte, nivelEsmalte, usuario);
            return esmalteRepository.save(novoEsmalte);
        }
    }
}
