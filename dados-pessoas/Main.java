import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada da quantidade de pessoas
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        double[] alturas = new double[n];
        char[] generos = new char[n];

        // Entrada dos dados de cada pessoa
        for (int i = 0; i < n; i++) {
            System.out.println("Altura da " + (i + 1) + "a pessoa: ");
            alturas[i] = sc.nextDouble();
            System.out.println("Genero da " + (i + 1) + "a pessoa (M/F): ");
            generos[i] = sc.next().charAt(0);
        }

        // Inicializando variáveis para cálculos
        double menorAltura = alturas[0];
        double maiorAltura = alturas[0];
        double somaAlturasMulheres = 0.0;
        int quantidadeMulheres = 0;
        int quantidadeHomens = 0;

        // Processamento dos dados
        for (int i = 0; i < n; i++) {
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
            if (generos[i] == 'F' || generos[i] == 'f') {
                somaAlturasMulheres += alturas[i];
                quantidadeMulheres++;
            } else if (generos[i] == 'M' || generos[i] == 'm') {
                quantidadeHomens++;
            }
        }

        // Cálculo da média de altura das mulheres
        double mediaAlturaMulheres = 0.0;
        if (quantidadeMulheres > 0) {
            mediaAlturaMulheres = somaAlturasMulheres / quantidadeMulheres;
        }

        // Saída dos resultados
        System.out.printf("Menor altura = %.2f%n", menorAltura);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);

        if (quantidadeMulheres > 0) {
            System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
        } else {
            System.out.println("Nenhuma mulher cadastrada para calcular a media.");
        }

        System.out.println("Numero de homens = " + quantidadeHomens);

        sc.close();
    }
}
