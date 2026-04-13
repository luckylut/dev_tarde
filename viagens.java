import java.util.Scanner;

public class viagens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Digite a distância da viagem em km: ");
        double km = sc.nextDouble();

        double preco;

        // Processamento
        if (km <= 200) {
            preco = km * 0.50;
        } else {
            preco = km * 0.45;
        }

        // Saída
        System.out.println("\n=== RESULTADO ===");
        System.out.printf("Distância: %.2f km\n", km);
        System.out.printf("Valor da passagem: R$ %.2f\n", preco);

        sc.close();
    }
}