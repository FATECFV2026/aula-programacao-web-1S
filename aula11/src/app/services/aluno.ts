import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
@Injectable({
  providedIn: 'root',
})
export class AlunoService {
  private url = "http://localhost:8080/aluno"

  constructor(private http: HttpClient){}

  salvar(aluno:any){
    return this.http.post(this.url,aluno)
  }

  listar(){
    return this.http.get(this.url)
  }
}
