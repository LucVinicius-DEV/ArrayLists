import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner para ler os dados do usuário
        Scanner sc = new Scanner(System.in);

        // Lendo a quantidade de pessoas
        System.out.print("Quantas pessoas? ");
        int n = sc.nextInt();

        // Criando os vetores para armazenar os nomes e idades
        String[] nomes = new String[n];
        int[] idades = new int[n];

        // Lendo os dados das pessoas
        for (int i = 0; i < n; i++) {
            System.out.print("Nome da pessoa " + (i + 1) + ": ");
            sc.nextLine(); // Consumir o '\n' deixado pelo nextInt()
            nomes[i] = sc.nextLine();
            System.out.print("Idade de " + nomes[i] + ": ");
            idades[i] = sc.nextInt();
        }

        // Encontrando a pessoa mais velha
        int indiceMaisVelho = 0;
        for (int i = 1; i < n; i++) {
            if (idades[i] > idades[indiceMaisVelho]) {
                indiceMaisVelho = i;
            }
        }

        // Exibindo o nome da pessoa mais velha
        System.out.println("A pessoa mais velha é: " + nomes[indiceMaisVelho] + " com " + idades[indiceMaisVelho] + " anos.");

        // Fechando o scanner
        sc.close();
    }
}
