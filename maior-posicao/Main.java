import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Define o padrão de formatação para usar ponto como separador decimal
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt(); // Lê a quantidade de números que serão digitados

        double[] numeros = new double[n]; // Cria um vetor de números reais com tamanho informado pelo usuário

        // Loop para ler os números
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextDouble(); // Armazena o número digitado no vetor
        }

        // Inicializa o maior valor e a posição como sendo o primeiro elemento do vetor
        double maiorValor = numeros[0];
        int posicaoMaior = 0;

        // Loop para encontrar o maior número e sua posição
        for (int i = 1; i < n; i++) {
            if (numeros[i] > maiorValor) { // Se encontrar um número maior
                maiorValor = numeros[i]; // Atualiza o maior valor
                posicaoMaior = i;         // Atualiza a posição do maior valor
            }
        }

        System.out.println();
        System.out.printf("MAIOR VALOR = %.1f%n", maiorValor); // Exibe o maior valor encontrado
        System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicaoMaior); // Exibe a posição do maior valor

        sc.close(); // Fecha o Scanner para liberar recursos
    }
}
