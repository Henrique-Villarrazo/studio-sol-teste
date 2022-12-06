package com.henrique.villarrazo.studiosoltest.controller;

import com.henrique.villarrazo.studiosoltest.dto.SenhaDto;
import com.henrique.villarrazo.studiosoltest.model.Senha;
import com.henrique.villarrazo.studiosoltest.repository.SenhaRespository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("verify")
public class SenhaController {

    @Autowired
    private SenhaRespository respository;

    @PostMapping
    @Transactional
    public void cadastroSenha(@RequestBody @Valid SenhaDto senhaDto) {
        respository.save(new Senha(senhaDto));
    }
}
