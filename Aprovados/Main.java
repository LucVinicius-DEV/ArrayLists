import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner para leitura de dados
        Scanner sc = new Scanner(System.in);

        // Lendo a quantidade de alunos
        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();

        // Vetores para armazenar os dados
        String[] nomes = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        // Lendo os dados dos alunos
        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "º aluno:");
            sc.nextLine(); // Consumir a quebra de linha pendente
            nomes[i] = sc.nextLine();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        // Exibindo os alunos aprovados
        System.out.println("\nAlunos aprovados:");
        for (int i = 0; i < n; i++) {
            double media = (nota1[i] + nota2[i]) / 2.0;
            if (media >= 6.0) {
                System.out.println(nomes[i]);
            }
        }

        // Fechando o Scanner
        sc.close();
    }
}
