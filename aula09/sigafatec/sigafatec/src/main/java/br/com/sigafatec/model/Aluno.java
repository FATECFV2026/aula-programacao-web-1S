package br.com.sigafatec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="aluno")
public class Aluno {
    @Id
    private long id;

    private String nome;
    private String cpf;
}
