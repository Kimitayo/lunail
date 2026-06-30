package com.lunail.lunail_api.controller;

import com.lunail.lunail_api.dto.MarcaDTO;
import com.lunail.lunail_api.model.Marca;
import com.lunail.lunail_api.service.MarcaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marcas")
public class MarcaController {

    private final MarcaService marcaService;

    public MarcaController(MarcaService marcaService) {
        this.marcaService = marcaService;
    }

    @PostMapping
    public Marca cadastrar(@RequestBody MarcaDTO dto) {
        return marcaService.cadastrar(dto.getNome(), dto.getTipo());
    }

    @GetMapping
    public List<Marca> listar() {
        return marcaService.listar();
    }
}