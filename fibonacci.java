import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int t1 = 0;
        int t2 = 1;
        int t3 = 0;

        System.out.println("-".repeat(42));
        System.out.printf("%3sConsulta da Sequência de Fibonacci%n", " ");
        System.out.println("-".repeat(42));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int valor = scanner.nextInt();

        while (valor > t3) {
            t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
        }

        if (valor == 0 || valor == 1) {
            System.out.println("O número faz parte da sequência de Fibonacci.");
        } else if (valor == t3) {
            System.out.println("O número faz parte da sequência de Fibonacci.");
        } else {
            System.out.println("O número digitado não faz parte da sequência de Fibonacci.");
        }

        scanner.close();
    }
}