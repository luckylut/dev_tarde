import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Digite um número para ver a tabuada: ");
        int n = sc.nextInt();

        // Processamento e saída
        System.out.println("\n=== TABUADA DE " + n + " ===");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", n, i, (n * i));
        }

        sc.close();
    }
}