package processo;
import java.util.Locale;
import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato();
    }
    
    static void analisarCandidato (){
        double salarioBase = 2000.0;

        try (Scanner entrada = new Scanner(System.in).useLocale(Locale.US)){
            
            System.out.println("Digite o salário pretendido:");
            double salarioPretendido = entrada.nextDouble();
                
    
                if(salarioBase > salarioPretendido){
                    System.out.println("Ligar para o Candidato");
                }else if(salarioBase == salarioPretendido)
                    System.out.println("Ligar para o candidato com contra proposta.");
                else{
                    System.out.println("Aguardando o resultado dos demais candidatos.");
                }
        }catch (Exception e){
            System.out.println("Valor inválido!");

        }                         
    }
}