import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class ProcessoSeletivo {
    
    public static void main(String[] args) {
    
        int salarioBase = 2000;
        ArrayList <Nomes> nomes = new ArrayList <Nomes> ();
        ArrayList <Salarios> salarios = new ArrayList <Salarios> ();
            
            try (Scanner entrada = new Scanner(System.in).useLocale(Locale.US)){                
                for(int i=0; i < 2; i++){
                    Nomes candidatoNome = new Nomes ();
                    Salarios candidatoSalario = new Salarios ();
                do {
                System.out.println("Digite o seu nome:");
                    String nome = entrada.next();    
                    candidatoNome.setNome(nome);

                System.out.println("Digite o salário pretendido (valor inteiro):");
                int salarioPretendido = entrada.nextInt();
                    candidatoSalario.setSalarioPretendido(salarioPretendido);

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
                    nomes.add(candidatoNome);
                    salarios.add(candidatoSalario);  

                } while (i < 2);
                }
                entrada.close();
            }catch (InputMismatchException e){
                System.out.println("Informações inválidas.");
            }
            
    for(int i=0; i < 2; i++){
    do{
    System.out.println("O candidato " + nomes.get(i) + " Solicitou este valor de salário R$" + salarios.get(i));    
        if(Salarios.getSalarios() <= salarioBase){
            System.out.println("O candidato " + nomes.get(i) + " foi selecionado para a vaga.");
            i ++;
        }else{
            System.out.println("O candidato está eliminado.");
            i ++;
        }
    } while (i < 2);
    }
    }
}

   