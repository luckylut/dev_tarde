import java.util.Scanner;

public class cinco_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;

        System.out.println("Digite 5 números:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            int num = sc.nextInt();

            soma += num; // acumula a soma
        }

        double media = soma / 5.0;

        System.out.println("\n=== RESULTADO ===");
        System.out.println("Soma: " + soma);
        System.out.printf("Média: %.2f\n", media);

        sc.close();
    }
}
