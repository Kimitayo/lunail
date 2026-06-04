package com.lunail.lunail_api.controller;

import com.lunail.lunail_api.dto.CadastroDTO;
import com.lunail.lunail_api.dto.LoginDTO;
import com.lunail.lunail_api.model.Usuario;
import com.lunail.lunail_api.service.UsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // diz pro string que esta é a classe que recebe requisições HTTP
@RequestMapping("/usuarios") // a rota base começa por usuarios
public class UsuarioController {
    private final UsuarioService usuarioService;

    // construtor com dependencia
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/cadastrar") // recebe requisição do tipo POST pra cadastrar
    public Usuario cadastrar(@RequestBody CadastroDTO dto) { //RequestBody pega o JSON que chegou na requisição e converte em objeto Java
        return usuarioService.cadastrar(
                dto.getNomeCompleto(),
                dto.getEmail(),
                dto.getSenha(),
                dto.getConfirmarSenha()
        );
    }

    @PostMapping("/login")
    public Usuario login(@RequestBody LoginDTO dto) {
        return usuarioService.login(
                dto.getEmail(),
                dto.getSenha()
        );
    }
}
