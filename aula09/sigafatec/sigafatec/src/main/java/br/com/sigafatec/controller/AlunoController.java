package br.com.sigafatec.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sigafatec.dto.AlunoDTO;
import br.com.sigafatec.model.Aluno;
import br.com.sigafatec.service.AlunoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private final AlunoService service;

    public AlunoController(AlunoService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Aluno> criar(@RequestBody AlunoDTO dto){
        System.out.println(dto.cpf());
        Aluno a = service.criar(dto);
        return ResponseEntity.created(URI.create("/aluno"+ a.getId())).body(a);
    }
    
    @GetMapping
    public String teste(){
        return "Teste do Servidor";
    }
}
