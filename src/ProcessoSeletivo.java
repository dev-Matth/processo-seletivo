import java.util.Locale;
import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        Cadastro cadastro = new Cadastro();

        double salarioBase = 2000.0;

         try (Scanner entrada = new Scanner(System.in).useLocale(Locale.US)){
            
            System.out.println("Digite o seu nome:");
                String nome = entrada.next();
                cadastro.setNome(nome);       

            System.out.println("Digite o salário pretendido:");
                double salarioPretendido = entrada.nextDouble();
                cadastro.setSalarioPretendido(salarioPretendido);

                if(salarioBase > salarioPretendido){
                    System.out.println("Ligar para o Candidato");
                }else if(salarioBase == salarioPretendido)
                    System.out.println("Ligar para o candidato com contra proposta.");
                else{
                    System.out.println("Aguardando o resultado dos demais candidatos.");
                }
        }catch (Exception e){
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