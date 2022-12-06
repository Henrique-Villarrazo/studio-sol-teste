package com.henrique.villarrazo.studiosoltest.repository;

import com.henrique.villarrazo.studiosoltest.model.Senha;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SenhaRespository extends JpaRepository<Senha, Long> {
}
