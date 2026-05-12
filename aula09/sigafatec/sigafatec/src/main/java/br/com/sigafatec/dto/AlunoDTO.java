package br.com.sigafatec.dto;

import jakarta.validation.constraints.NotBlank;

public record AlunoDTO(
     String nome,
     String cpf
) 

{
    
}
