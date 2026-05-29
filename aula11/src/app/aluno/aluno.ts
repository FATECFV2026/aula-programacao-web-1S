import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AlunoService } from '../services/aluno';

@Component({
  selector: 'app-aluno',
  imports: [FormsModule],
  standalone: true,
  templateUrl: './aluno.html',
  styleUrl: './aluno.css',
})
export class Aluno {
    titulo = "Cadastro de Alunos"
    nome = ""
    cpf = ""

    constructor(private service: AlunoService){}

    cadastrar(){

      const aluno ={
        nome: this.nome,
        cpf: this.cpf
      }

      this.service.salvar(aluno).subscribe({
        next: (res) =>{
          console.log("OK: ", res)
        },
        error: (err) =>{
          console.log("Erro: ", err)
        }
      })

      console.log("Nome", this.nome)
      console.log("Cpf", this.cpf)
    }
}
