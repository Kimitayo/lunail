package com.lunail.lunail_api.controller;

import com.lunail.lunail_api.dto.CorDTO;
import com.lunail.lunail_api.model.Cor;
import com.lunail.lunail_api.service.CorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cores")
public class CorController {

    private final CorService corService;

    public CorController(CorService corService) {
        this.corService = corService;
    }

    @PostMapping
    public Cor cadastrar(@RequestBody CorDTO dto) {
        return corService.cadastrar(dto.getNomeCor(), dto.getHexadecimal());
    }

    @GetMapping
    public List<Cor> listar() {
        return corService.listar();
    }
}