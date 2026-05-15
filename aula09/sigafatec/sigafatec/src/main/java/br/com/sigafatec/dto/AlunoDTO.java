package br.com.sigafatec.dto;

import jakarta.validation.constraints.NotBlank;

public record AlunoDTO(
    @NotBlank String nome,
    @NotBlank String cpf
) {}
