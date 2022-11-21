
package classes;

/**
 *
 * @author julio
 */
import java.util.Locale;
import java.util.Scanner;

public class Professor extends Pessoa {
   
    private String cpf;

    public Professor(){
        super();
        this.cpf ="000.000.000-00";
    }
    
    
        public String cabecalho(){
            return "Nome;Sexo;Idade;CPF\n";
        }
    
        public String atributoToCSV(){
            
            String aux = this.nome+";"+this.sexo+";"+this.idade+";"+this.cpf+"\n";
            return aux;
            
        }
    
    
    @Override
        public void CSVToAtributo (String csv){
            String vetor[] = csv.split(";");
           super.CSVToAtributo(csv);
            this.cpf = vetor[3];  
            
        }
    
    
    @Override
    public void preencher(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("******* Preenchendo Professor *********");
        super.preencher();
        System.out.print("Informe o CPF: ");
        this.cpf = leitor.next();
    }
    public String ToString(){
        String saida= "";
       saida = super.nome + "----------- Dados do professor ------------\n" + "Nome:"+"\n"
       +"Sexo: " + this.sexo+"\n"
       +"Idade: " + this.idade+"\n"
       +"CPF: " + this.cpf+"\n"
       +"-------------------------------------------";
       return saida;
    }
    @Override
    public void imprimir(){
        System.out.println("----------- Dados do professor ------------");
        super.imprimir();
        System.out.println("CPF: " + this.cpf);
        System.out.println("-------------------------------------------");
    }

    public void copiar(Professor outro){
        this.nome = outro.getNome();
        this.sexo = outro.getSexo();
        this.idade = outro.getIdade();
        this.cpf = outro.getCpf();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void getSexo(char charAt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}