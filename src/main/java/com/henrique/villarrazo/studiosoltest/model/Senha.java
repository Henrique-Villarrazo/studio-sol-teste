package com.henrique.villarrazo.studiosoltest.model;

import com.henrique.villarrazo.studiosoltest.dto.SenhaDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "senhas")
@Entity(name = "Senha")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Senha {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String senha;

    public Senha(SenhaDto senhaDto) {
        this.senha = senhaDto.senha();
    }

}
