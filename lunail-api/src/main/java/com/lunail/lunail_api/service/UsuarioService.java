package com.lunail.lunail_api.service;

import com.lunail.lunail_api.model.Usuario;
import com.lunail.lunail_api.repository.UsuarioRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository; // no service conecto ao repository

    // construtor
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(); // pra criptografar a senha antes de salvar

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // metodos
    // cadastrar
    public Usuario cadastrar(String nomeCompleto, String email, String senha, String confirmarSenha) {
        // 1. verifica se email já existe
        // 2. se existe -> lança erro
        // 3. se não existe, aceita email, compara as senhas -> cria e salva
        // 4. guarda data de cadastro

        // verificar senhas
        if (!senha.equals(confirmarSenha)) {
            throw new RuntimeException("As senhas não coincidem");
        }

        // verificar se email já existe
        Optional<Usuario> optional = usuarioRepository.findByEmail(email);
        if (optional.isPresent()) {
            throw new RuntimeException("Este e-mail já existe");
        } else {
            Usuario novoUsuario = new Usuario(nomeCompleto, email, encoder.encode(senha));
            return usuarioRepository.save(novoUsuario); // salva no banco de dados e retorna
        }
    }

    // login
    public Usuario login(String email, String senha) {
        // 1. busca usuario pelo email
        // 2. se não existe -> lança erro
        // 3. se existe -> verifica senha
        // 4. se senha errada -> lança erro
        // 5. se tudo certo -> retorna usuário

        Optional<Usuario> optional = usuarioRepository.findByEmail(email);
        if (optional.isEmpty()) { // email nao existe
            throw new RuntimeException("Email ou senha incorretos");
        } else {
            Usuario usuario = optional.get(); // se tem algo, pega o que tem dentro
            if (!encoder.matches(senha, usuario.getSenha())) { // senha diferente do getSenha()
                throw new RuntimeException("Email ou senha incorretos");
            } else {
                return usuario;
            }
        }
    }
}
