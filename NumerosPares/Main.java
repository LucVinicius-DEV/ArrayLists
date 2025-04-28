
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita a quantidade de números que serão informados
        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        // Lê os números e armazena no vetor
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("NÚMEROS PARES:");

        int quantidadePares = 0;

        // Percorre o vetor para encontrar e exibir os números pares
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
                quantidadePares++;
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + quantidadePares);

        sc.close();
    }
}
