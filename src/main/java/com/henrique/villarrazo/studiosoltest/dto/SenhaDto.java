package com.henrique.villarrazo.studiosoltest.dto;

import com.henrique.villarrazo.studiosoltest.annotation.Password;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record SenhaDto(
        @NotBlank
        @Password
        String senha
) {
}
