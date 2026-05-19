package br.com.sigafatec.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sigafatec.dto.AlunoDTO;
import br.com.sigafatec.model.Aluno;
import br.com.sigafatec.repository.AlunoRepository;

@Service
public class AlunoService {
    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository){
        this.repository = repository;
    }

    public Aluno criar(AlunoDTO dto){
        System.out.println(dto.cpf());
        Aluno aluno = new Aluno(dto.nome(), dto.cpf());
        return repository.save(aluno);
    }

    public Aluno buscarPorId(Long id){
        return  repository.findById(id).orElse(null);
    }

    public boolean excluir(Long id){
        boolean res = repository.existsById(id);
        if(res){
            repository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    public List<Aluno> listarTodos(){
        return repository.findAll();
    }
}
