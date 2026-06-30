package com.lunail.lunail_api.service;

import com.lunail.lunail_api.model.*;
import com.lunail.lunail_api.repository.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EsmalteService {

    private final EsmalteRepository esmalteRepository;
    private final UsuarioRepository usuarioRepository;
    private final MarcaRepository marcaRepository;
    private final CorRepository corRepository;
    private final AcabamentoRepository acabamentoRepository;

    public EsmalteService(EsmalteRepository esmalteRepository,
                          UsuarioRepository usuarioRepository,
                          MarcaRepository marcaRepository,
                          CorRepository corRepository,
                          AcabamentoRepository acabamentoRepository) {
        this.esmalteRepository = esmalteRepository;
        this.usuarioRepository = usuarioRepository;
        this.marcaRepository = marcaRepository;
        this.corRepository = corRepository;
        this.acabamentoRepository = acabamentoRepository;
    }

    public Esmalte cadastrar(String nome, String marcaId, LocalDate dataAquisicao,
                             String corId, String acabamentoId,
                             String nivelEsmalte, String usuarioId) {

        if (nome == null || nome.isBlank() || marcaId == null ||
                dataAquisicao == null || corId == null ||
                acabamentoId == null || nivelEsmalte == null || usuarioId == null) {
            throw new RuntimeException("Verifique todos os campos obrigatórios!");
        }

        Usuario usuario = usuarioRepository.findById(usuarioId)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        Marca marca = marcaRepository.findById(marcaId)
                .orElseThrow(() -> new RuntimeException("Marca não encontrada"));

        Cor cor = corRepository.findById(corId)
                .orElseThrow(() -> new RuntimeException("Cor não encontrada"));

        Acabamento acabamento = acabamentoRepository.findById(acabamentoId)
                .orElseThrow(() -> new RuntimeException("Acabamento não encontrado"));

        NivelEsmalte nivel = NivelEsmalte.valueOf(nivelEsmalte);

        Esmalte novoEsmalte = new Esmalte(nome, marca, dataAquisicao, cor, acabamento, nivel, usuario);
        return esmalteRepository.save(novoEsmalte);
    }

    public List<Esmalte> listarColecao(String usuarioId) {
        Usuario usuario = usuarioRepository.findById(usuarioId)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        return esmalteRepository.findByUsuario(usuario);
    }

    public List<Esmalte> listarFavoritos(String usuarioId) {
        Usuario usuario = usuarioRepository.findById(usuarioId)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        return esmalteRepository.findByUsuarioAndFavoritoTrue(usuario);
    }

    public Esmalte favoritar(String id) {
        Esmalte esmalte = esmalteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Esmalte não encontrado"));
        esmalte.setFavorito(!esmalte.isFavorito());
        return esmalteRepository.save(esmalte);
    }

    public List<Esmalte> filtrarPorCor(String usuarioId, String corId) {
        Usuario usuario = usuarioRepository.findById(usuarioId)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        Cor cor = corRepository.findById(corId)
                .orElseThrow(() -> new RuntimeException("Cor não encontrada"));
        return esmalteRepository.findByUsuarioAndCorPrincipal(usuario, cor);
    }

    public List<Esmalte> buscarPorNome(String usuarioId, String nome) {
        Usuario usuario = usuarioRepository.findById(usuarioId)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        return esmalteRepository.findByUsuarioAndNomeContainingIgnoreCase(usuario, nome);
    }
}