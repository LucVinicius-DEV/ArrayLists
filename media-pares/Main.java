import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lendo o tamanho do vetor
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        // Lendo os elementos do vetor
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        double soma = 0.0;
        int contagemPares = 0;

        // Calculando a soma e contando quantos números pares existem
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
                contagemPares++;
            }
        }

        // Verificando se houve algum número par
        if (contagemPares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            double media = soma / contagemPares;
            System.out.printf("MEDIA DOS PARES = %.1f%n", media);
        }

        sc.close();
    }
}
