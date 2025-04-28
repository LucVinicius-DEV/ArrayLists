import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        double media = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        NumeroReal[] vect = new NumeroReal[n];

        // nesse for, apresentamos os valores digitados pelo usuário
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            double numero = sc.nextDouble();  // Usando nextDouble para permitir números reais
            vect[i] = new NumeroReal(numero); // Mudamos para instanciar NumeroReal
        }

        System.out.println("\nValores:");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + vect[i]); // Imprimindo os números armazenados
        }

        // nesse for, fazemos a soma de todos os valores
        for (int i = 0; i < n; i++) {
            soma += vect[i].getNumero(); // Somando os valores dos objetos
        }
        System.out.println("\nSOMA: " + soma);

        // aqui fazemos a média de todos os valores
        media = soma / n;
        System.out.println("MEDIA: " + media);

        sc.close();
    }
}
