package com.lunail.lunail_api.service;

import com.lunail.lunail_api.model.Acabamento;
import com.lunail.lunail_api.repository.AcabamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcabamentoService {

    private final AcabamentoRepository acabamentoRepository;

    public AcabamentoService(AcabamentoRepository acabamentoRepository) {
        this.acabamentoRepository = acabamentoRepository;
    }

    public Acabamento cadastrar(String nomeAcabamento, String descricao) {
        Acabamento acabamento = new Acabamento(nomeAcabamento, descricao);
        return acabamentoRepository.save(acabamento);
    }

    public List<Acabamento> listar() {
        return acabamentoRepository.findAll();
    }
}