/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.ProfessorDao;
import classes.Professor;
import java.util.List;
/**
 *
 * @author julio
 */
public class ProfessorController {
    private final ProfessorDao repositorio;
 
public ProfessorController(){
    repositorio= new ProfessorDao();
}
public boolean cadastrarProfessor (String nome, String sexo, String idade, String cpf) throws ProfessorException{
    Professor novoProfessor = validacaoVazio(nome, sexo, idade, cpf);
    if (repositorio.findByCPF(cpf) == null){
        return repositorio.save(novoProfessor);
    }else{
        throw new ProfessorException("Já existe um Professor com esse CPF.");
    }
}

public Professor buscarProfessor(String cpf){
    return this.repositorio.findByCPF(cpf);
}

public List<Professor> listarPorfessores(){
    return this.repositorio.findAll();
}


public void atualizarProfessor (String cpfOriginal, String nome, String sexo, String idade, String cpf ) throws ProfessorException{
        Professor novoProfessor= validacaoVazio(nome, sexo, idade, cpf);
        repositorio.update(cpfOriginal, novoProfessor);
}        
private Professor validacaoVazio(String nome, String sexo, String idade, String cpf) throws ProfessorException{
    Professor p = new Professor();
    if (nome.isEmpty())
        throw new ProfessorException("Campo vazio - Nome.");
    p.setNome(nome);
    
    if (sexo.isEmpty())
        throw new ProfessorException("Campo vazio - Sexo.");
    p.setSexo(sexo.charAt(0));
    
    if (idade.isEmpty())
        throw new ProfessorException("Campo vazio - Idade.");
    p.setIdade(0);
    
    if (cpf.isEmpty())
        throw new ProfessorException("Campo vazio - cpf.");
    p.setCpf(cpf);

    return p;
}
}