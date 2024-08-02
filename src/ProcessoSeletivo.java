import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class ProcessoSeletivo {
    
    public static void main(String[] args) {
    
        int salarioBase = 2000;
        ArrayList <Candidatos> usuarios = new ArrayList <Candidatos> ();
            
        try (Scanner entrada = new Scanner(System.in).useLocale(Locale.US)){                
                for(int i=0; i < 1; i++){
                    Candidatos pessoa = new Candidatos ();
                do {
                System.out.println("Digite o seu nome:");
                    String nome = entrada.next();    
                    pessoa.setNome(nome);

                System.out.println("Digite o salário pretendido (valor inteiro):");
                    int salarioPretendido = entrada.nextInt();
                    pessoa.setSalarioPretendido(salarioPretendido);

                    if(salarioBase > salarioPretendido){
                        System.out.println("Ligar para o Candidato");
                            i  ++;
                    }else if(salarioBase == salarioPretendido){                   
                        System.out.println("Ligar para o candidato com contra proposta.");
                            i  ++;
                    }else{
                        System.out.println("Aguardar o resultado dos outros candidatos.");
                            i ++;
                    }
                    usuarios.add(pessoa);                                 
                } while (i < 1);
                }
                    
            }catch (InputMismatchException e){
                System.out.println("Informações inválidas.");
            }

    System.out.println("O candidato " + usuarios.get(0) + " Solicitou este valor de salário R$" + Candidatos.getSalarioPretendido());
        /*if(salarioBase >= SalarioPretendido()){
            System.out.println("O candidato " + cadastro.getNome() + " foi selecionado para a vaga.");
        }else{
            System.out.println("O candidato está eliminado.");
        }*/
    }
}
   