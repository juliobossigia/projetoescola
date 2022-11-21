/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import classes.Professor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julio
 */
public class ProfessorDao extends DAO {
    private List<Professor> lstProfessores;
    private final ArrayList<Object> lsProfessores;
    

public ProfessorDao(){
    super ("ListagemProfessores.csv");
    this.lsProfessores = new ArrayList<>();    
}

public boolean save (Professor prof){
    this.lstProfessores.add(prof);
    String texto = this.lsProfessoresToCSV();
    super.save(texto);
    return true;
}

public Professor findByCPF(String cpf){
    for (Professor p:  this.lsProfessores){
        if(p.getCpf().equals(cpf))
            return p;
    }
    return null;
}
public Professor find (Professor prof){
    for (Professor p: this.lstProfessores){
        if (p.equals(prof))
            return p;
    }
        return null;
}


  
    private String lsProfessoresToCSV() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(Object obj, int i) {
        Professor prof = (Professor) obj;
        for (int i+0; i<=this.lsProfessores.size()-1; i++){
        Professor p = (Professor) this.lsProfessores.get(i);
        if (p.getCpf().equals(prof.getCpf())){
            this.lsProfessores.remove(i);
            
            
        String texto = this.lsProfessoresToCSV();
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

    public List<Professor> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void update(String cpfOriginal, Professor novoProfessor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }





}