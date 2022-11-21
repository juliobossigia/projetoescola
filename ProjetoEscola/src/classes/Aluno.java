
package classes;

/**
 *
 * @author julio
 */
import java.util.Scanner;

public class Aluno extends Pessoa{
    
    private String matricula;

    public Aluno(){
       super();
       this.matricula = "0000000000";
    }
    
    public String cabecalho(){
            return "Nome;Sexo;Idade;Matricula\n";
        }
    
        public String atributoToCSV(){
            
            String aux = this.nome+";"+this.sexo+";"+this.idade+";"+this.matricula+"\n";
            return aux;
            
        }
    
    
    @Override
        public void CSVToAtributo (String csv){
            String vetor[] = csv.split(";");
           
            this.matricula = vetor[3]; 
            
        }
    
    
    @Override
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("*************** Preenchendo Aluno **************");
        super.preencher();
        System.out.print("Informe a matricula:");
        this.matricula = ler.next();
      
        System.out.println("-------------------------------------------------");
    }

    public void copiar(Aluno outro){
        setNome(outro.getNome());
        setIdade(outro.getIdade());
        setMatricula(outro.getMatricula());
        setSexo(outro.getSexo());
        setIdade(outro.getIdade());
       
    }
    @Override
    public void imprimir(){
        System.out.println("------------------ Dados do Aluno --------------");
        super.imprimir();
        System.out.println("Matricula : " + getMatricula());
    
    }
    
      public String imprimirParaString(){
        String saida= "";
       saida = "----------- Dados do Aluno ------------\n"
       +"Nome: " + this.nome+"\n"
       +"Sexo: " + this.sexo+"\n"
       +"Idade: " + this.idade+"\n"
       +"CPF: " + this.matricula+"\n"
       +"-------------------------------------------";
       return saida;
    }
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String Matricula) {
        this.matricula = Matricula;
    }


}

