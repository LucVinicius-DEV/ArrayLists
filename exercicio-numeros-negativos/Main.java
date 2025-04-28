
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? (limite máximo 10)");
        int n = sc.nextInt();

        if (n > 10) {
            System.out.println("Limite máximo de 10 números excedido.");
        } else {
            Negativos[] vect = new Negativos[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Digite um número: ");
                int numero = sc.nextInt();
                vect[i] = new Negativos(numero);
            }

            System.out.println("\nNÚMEROS NEGATIVOS:");
            for (int i = 0; i < n; i++) {
                if (vect[i].getNumero() < 0) {
                    System.out.println(vect[i]);
                }
            }
        }

        sc.close();
    }
}
