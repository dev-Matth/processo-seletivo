import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ProcessoSeletivo {
    private static int soma;

    public static void main(String[] args) {

        Cadastro cadastro = new Cadastro();
    
        double salarioBase = 2000.0;
        
            try (Scanner entrada = new Scanner(System.in).useLocale(Locale.US)){
                do {
                System.out.println("Digite o seu nome:");
                    String nome = entrada.next();
                    cadastro.setNome(nome);       

                System.out.println("Digite o salário pretendido:");
                    double salarioPretendido = entrada.nextFloat();
                    cadastro.setSalarioPretendido(salarioPretendido);

                    if(salarioBase > salarioPretendido){
                        System.out.println("Ligar para o Candidato");
                            soma  ++;
                    }else if(salarioBase == salarioPretendido){                   
                        System.out.println("Ligar para o candidato com contra proposta.");
                            soma  ++;
                    }else{
                        System.out.println("Aguardar o resultado dos outros candidatos.");
                            soma ++;
                    }
                
                } while (soma < 5);
                    
            }catch (InputMismatchException e){
                System.out.println("Informações inválidas.");
            }

        System.out.println("O candidato " + cadastro.getNome() + " Solicitou este valor de salário " + cadastro.getSalarioPretendido());
            if(salarioBase >= cadastro.getSalarioPretendido()){
                System.out.println("O candidato " + cadastro.getNome() + " foi selecionado para a vaga.");
            }else{
                System.out.println("O candidato está eliminado.");
        }
    }
}
   