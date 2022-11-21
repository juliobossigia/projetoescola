/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import classes.Aluno;
import Model.AlunoDao;
import java.util.List;

/**
 *
 * @author julio
 */
public class AlunoController {
     private final AlunoDao repositorio;
 
public AlunoControllerller(){
    repositorio= new AlunoDao();
}
public boolean cadastrarAluno (String nome, String sexo, String idade, String matricula) throws AlunoException{
    Aluno novoAluno = validacaoVazio(nome, sexo, idade, matricula);
    if (repositorio.findByMatricula(matricula) == null){
        return repositorio.save(novoAluno);
    }else{
        throw new AlunoException("Já existe um Professor com essa Matricula.");
    }
}

public Aluno buscarAluno(String matricula){
    return this.repositorio.findByMatricula(matricula);
}

public List<Aluno> listarAlunos(){
    return this.repositorio.findAll();
}


public void atualizarAluno (String matriculaOriginal, String nome, String sexo, String idade, String matricula ) throws AlunoException{
        Aluno novoAluno= validacaoVazio(nome, sexo, idade, matricula);
        repositorio.update(matriculaOriginal, novoAluno);
}        
private Aluno validacaoVazio(String nome, String sexo, String idade, String matricula) throws AlunoException{
    Aluno a = new Aluno();
    if (nome.isEmpty())
        throw new AlunoException("Campo vazio - Nome.");
    a.setNome(nome);
    
    if (sexo.isEmpty())
        throw new AlunoException("Campo vazio - Sexo.");
    a.setSexo(sexo.charAt(0));
    
    if (idade.isEmpty())
        throw new AlunoException("Campo vazio - Idade.");
    a.setIdade(0);
    
    if (matricula.isEmpty())
        throw new AlunoException("Campo vazio - matricula.");
    a.setMatricula(matricula);

    return a;
}

    
}
