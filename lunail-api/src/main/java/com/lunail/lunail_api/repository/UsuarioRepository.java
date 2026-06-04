package com.lunail.lunail_api.repository;

import com.lunail.lunail_api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository  // criar uma interface pra falar diretamente com o bd
    extends JpaRepository<Usuario, String> { // como id do Usuario é string, ai deixo string aqui no seg parametro

}

