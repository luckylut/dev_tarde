import java.util.Scanner;

public class desc_combustiveis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Digite a quantidade de litros: ");
        double litros = sc.nextDouble();

        System.out.print("Digite o tipo de combustível (A - Álcool | G - Gasolina): ");
        char tipo = sc.next().toUpperCase().charAt(0);

        double preco = 0, desconto = 0;

        // Processamento
        if (tipo == 'A') {
            preco = 2.89;
            desconto = (litros <= 20) ? 0.03 : 0.05;
        } else if (tipo == 'G') {
            preco = 4.95;
            desconto = (litros <= 20) ? 0.04 : 0.06;
        } else {
            System.out.println("Tipo de combustível inválido!");
            sc.close();
            return;
        }

        double totalBruto = litros * preco;
        double valorDesconto = totalBruto * desconto;
        double totalFinal = totalBruto - valorDesconto;

        // Saída
        System.out.println("\n=== RESULTADO ===");
        System.out.printf("Litros: %.2f\n", litros);
        System.out.printf("Preço por litro: R$ %.2f\n", preco);
        System.out.printf("Desconto: %.1f%%\n", desconto * 100);
        System.out.printf("Valor do desconto: R$ %.2f\n", valorDesconto);
        System.out.printf("Total a pagar: R$ %.2f\n", totalFinal);

        sc.close();
    }
}