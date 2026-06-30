package com.lunail.lunail_api.controller;

import com.lunail.lunail_api.dto.EsmalteDTO;
import com.lunail.lunail_api.model.Esmalte;
import com.lunail.lunail_api.service.EsmalteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/esmaltes")
public class EsmalteController {

    private final EsmalteService esmalteService;

    public EsmalteController(EsmalteService esmalteService) {
        this.esmalteService = esmalteService;
    }

    @PostMapping
    public Esmalte cadastrar(@RequestBody EsmalteDTO dto) {
        return esmalteService.cadastrar(
                dto.getNome(),
                dto.getMarcaId(),
                dto.getDataAquisicao(),
                dto.getCorId(),
                dto.getAcabamentoId(),
                dto.getNivelEsmalte(),
                dto.getUsuarioId()
        );
    }

    @GetMapping("/{usuarioId}")
    public List<Esmalte> listarColecao(@PathVariable String usuarioId) {
        return esmalteService.listarColecao(usuarioId);
    }

    @GetMapping("/{usuarioId}/favoritos")
    public List<Esmalte> listarFavoritos(@PathVariable String usuarioId) {
        return esmalteService.listarFavoritos(usuarioId);
    }

    @PatchMapping("/{id}/favoritar")
    public Esmalte favoritar(@PathVariable String id) {
        return esmalteService.favoritar(id);
    }

    @GetMapping("/{usuarioId}/buscar")
    public List<Esmalte> buscarPorNome(@PathVariable String usuarioId,
                                       @RequestParam String nome) {
        return esmalteService.buscarPorNome(usuarioId, nome);
    }

    @GetMapping("/{usuarioId}/filtrar/cor/{corId}")
    public List<Esmalte> filtrarPorCor(@PathVariable String usuarioId,
                                       @PathVariable String corId) {
        return esmalteService.filtrarPorCor(usuarioId, corId);
    }
}