
package classes;

import java.util.Scanner;

/**
 *
 * @author julio
 */
public class Pessoa {
    protected String nome;
    protected char sexo;
    protected int idade;
    
    
    public Pessoa(){
        this.nome = " ";
        this.sexo=' ';
        this.idade=0;
    }
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o nome: ");
        this.nome = leitor.next();
        System.out.print("Informe o sexo: ");
        this.sexo = leitor.next().charAt(0);
        System.out.print("Informe a idade: ");
        this.idade = leitor.nextInt();
    }
    
    public void imprimir(){
       
        System.out.println("Nome: " + this.nome);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Idade: " + this.idade);
    }
     public void CSVToAtributo (String csv){
            String vetor[] = csv.split(";");
            this.nome = vetor[0];
            this.sexo = vetor[1].charAt(0);
            this.idade = Integer.parseInt (vetor[2]);
     }
    
     public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}


