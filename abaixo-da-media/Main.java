import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Define o ponto como separador decimal
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt(); // Lê a quantidade de elementos

        double[] vetor = new double[n]; // Cria o vetor para armazenar os números

        double soma = 0.0; // Variável para somar os elementos e calcular a média

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
            soma += vetor[i]; // Acumula a soma dos elementos
        }

        double media = soma / n; // Calcula a média dos elementos

        System.out.printf("\nMÉDIA DO VETOR = %.3f\n", media); // Exibe a média com 3 casas decimais

        System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
        for (int i = 0; i < n; i++) {
            if (vetor[i] < media) { // Verifica quais elementos estão abaixo da média
                System.out.printf("%.1f\n", vetor[i]); // Imprime o elemento com 1 casa decimal
            }
        }

        sc.close(); // Fecha o scanner
    }
}
