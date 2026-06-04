package com.lunail.lunail_api.repository;

import com.lunail.lunail_api.model.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvaliacaoRepository
    extends JpaRepository<Avaliacao,String> {
}
