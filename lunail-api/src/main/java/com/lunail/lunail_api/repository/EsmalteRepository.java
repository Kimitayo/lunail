package com.lunail.lunail_api.repository;

import com.lunail.lunail_api.model.Cor;
import com.lunail.lunail_api.model.Esmalte;
import com.lunail.lunail_api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EsmalteRepository
    extends JpaRepository<Esmalte,String> {
    // ver todos os esmaltes da colecao
    List<Esmalte> findByUsuario(Usuario usuario);
    // filtrar por cor no dashboard
    List<Esmalte> findByUsuarioAndCorPrincipal(Usuario usuario, Cor cor);
    // lista de favoritos
    List<Esmalte> findByUsuarioAndFavoritoTrue(Usuario usuario);
    // buscar esmalte na lupa
    List<Esmalte> findByUsuarioAndNomeContainingIgnoreCase(Usuario usuario, String nome);
    // Containing pra buscar a palavra mesmo que incompleta
    // ignoreCase pra ignorar se é maiuscula ou minuscula
}
