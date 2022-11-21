/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import classes.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julio
 */
public class AlunoDao extends DAO {
private final List<Aluno> lsAlunos;

    

public AlunoDao(){
    super ("ListagemAlunos.csv");
    this.lsAlunos = new ArrayList<>();    
}

public boolean save (Aluno alun){
    this.lsAlunos.add(alun);
    String texto = this.lsAlunosToCSV();
    super.save(texto);
    return true;
}

public Aluno findByMatricula(String matricula){
    for (Aluno a:  this.lsAlunos){
        if(a.getMatricula().equals(matricula))
            return a;
    }
    return null;
}
public Aluno find (Aluno alun){
    for (Aluno a: this.lsAlunos){
        if (a.equals(alun))
            return a;
    }
    return null;
}


  
    private String lsAlunosToCSV() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(Object obj, int i) {
        Aluno alun = (Aluno) obj;
        for (int i+0; i<=this.lsAlunos.size()-1; i++){
        Aluno p = (Aluno) this.lsAlunos.get(i);
        if (p.getMatricula().equals(alun.getMatricula())){
            this.lsAlunos.remove(i);
            
            
        String texto = this.lsAlunosToCSV();
        super.save(texto);
        return true;
        }
    }
        return false;
    }

    @Override
    public boolean delete(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Aluno> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void update(String matriculaOriginal, Aluno novoAluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
 

  


}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public boolean delete(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
