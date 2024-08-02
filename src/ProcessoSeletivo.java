import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        double salarioBase = 2000;
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> salarios = new ArrayList<>();

        try (Scanner entrada = new Scanner(System.in).useLocale(Locale.US)) {
            for (int i = 0; i < 5; i++) {
                System.out.println("Digite o seu nome:");
                String nome = entrada.next();
                nomes.add(nome);

                System.out.println("Digite o salário pretendido:");
                double salarioPretendido = entrada.nextDouble();
                salarios.add(salarioPretendido);

                if (salarioBase > salarioPretendido) {
                    System.out.println("Ligar para o Candidato");
                } else if (salarioBase == salarioPretendido) {
                    System.out.println("Ligar para o candidato com contra proposta.");
                } else {
                    System.out.println("Aguardar o resultado dos outros candidatos.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido.");
        }

        for (int i = 0; i < 5; i++) {
            if (salarios.get(i) <= salarioBase) {
                System.out.println("O candidato " + nomes.get(i) + " foi selecionado para a vaga.");
            } else {
                System.out.println("O candidato " + nomes.get(i) + " está eliminado.");
            }
        }
    }
}