package com.lunail.lunail_api.service;

import com.lunail.lunail_api.model.Cor;
import com.lunail.lunail_api.repository.CorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorService {

    private final CorRepository corRepository;

    public CorService(CorRepository corRepository) {
        this.corRepository = corRepository;
    }

    public Cor cadastrar(String nomeCor, String hexadecimal) {
        Cor cor = new Cor(nomeCor, hexadecimal);
        return corRepository.save(cor);
    }

    public List<Cor> listar() {
        return corRepository.findAll();
    }
}