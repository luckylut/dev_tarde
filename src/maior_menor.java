import java.util.Scanner;

public class maior_menor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = sc.nextInt();

        // Processamento
        int maior = Math.max(n1, Math.max(n2, n3));
        int menor = Math.min(n1, Math.min(n2, n3));

        int soma = n1 + n2 + n3;
        double media = soma / 3.0;

        // Saída
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Soma: " + soma);
        System.out.printf("Média: %.2f\n", media);

        sc.close();
    }
}