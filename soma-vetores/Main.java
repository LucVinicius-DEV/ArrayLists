import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Solicita a quantidade de elementos que os vetores terão
        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        // Declara os vetores A, B e C
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        // Leitura dos valores do vetor A
        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Leitura dos valores do vetor B
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        // Geração do vetor C, onde cada elemento é a soma dos elementos correspondentes de A e B
        for (int i = 0; i < n; i++) {
            c[i] = a[i] + b[i];
        }

        // Impressão do vetor C
        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < n; i++) {
            System.out.println(c[i]);
        }

        sc.close();
    }
}
