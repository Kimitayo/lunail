package com.lunail.lunail_api.service;

import com.lunail.lunail_api.model.Marca;
import com.lunail.lunail_api.model.TipoEsmalte;
import com.lunail.lunail_api.repository.MarcaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaService {

    private final MarcaRepository marcaRepository;

    public MarcaService(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    public Marca cadastrar(String nome, String tipo) {
        Marca marca = new Marca(nome, TipoEsmalte.valueOf(tipo));
        return marcaRepository.save(marca);
    }

    public List<Marca> listar() {
        return marcaRepository.findAll();
    }
}