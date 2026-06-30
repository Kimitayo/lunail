package com.lunail.lunail_api.controller;

import com.lunail.lunail_api.dto.AcabamentoDTO;
import com.lunail.lunail_api.model.Acabamento;
import com.lunail.lunail_api.service.AcabamentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/acabamentos")
public class AcabamentoController {

    private final AcabamentoService acabamentoService;

    public AcabamentoController(AcabamentoService acabamentoService) {
        this.acabamentoService = acabamentoService;
    }

    @PostMapping
    public Acabamento cadastrar(@RequestBody AcabamentoDTO dto) {
        return acabamentoService.cadastrar(dto.getNomeAcabamento(), dto.getDescricao());
    }

    @GetMapping
    public List<Acabamento> listar() {
        return acabamentoService.listar();
    }
}