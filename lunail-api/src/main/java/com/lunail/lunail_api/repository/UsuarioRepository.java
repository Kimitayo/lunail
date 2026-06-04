package com.lunail.lunail_api.repository;

import com.lunail.lunail_api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository  // criar uma interface pra falar diretamente com o bd
    extends JpaRepository<Usuario, String> { // como id do Usuario é string, ai deixo string aqui no seg parametro
    Optional<Usuario> findByEmail(String email);
    /*optional pra representar um valor que pode ou não ser encontrado
    findByEmail pra encontrar um email no bd
    * */
}

