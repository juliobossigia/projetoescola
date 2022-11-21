/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author julio
 */
public abstract class DAO {
        protected String pathArquivo;
public DAO(){
    this.pathArquivo = "file.csv";
    
}   
public DAO (String pathArquivo){
    this.pathArquivo = pathArquivo;
}

public abstract boolean delete (Object obj);

protected void save (String texto){
    FileWriter arq = null;
    try {
        arq= new FileWriter (this.pathArquivo);
        PrintWriter gravaArq = new PrintWriter(arq);
        gravaArq.print(texto);
        arq.close();
    }catch (IOException ex){
        System.out.println(ex.getMessage());
    }finally {
        try{
            arq.close();
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

}
    



