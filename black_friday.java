import java.util.Scanner;

public class black_friday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o valor da compra: R$ ");
        double valor = sc.nextDouble();

        System.out.println("\n=== FORMAS DE PAGAMENTO ===");
        System.out.println("1 - À vista (10% de desconto)");
        System.out.println("2 - Cartão (5% de desconto)");
        System.out.println("3 - PIX (3% de desconto)");
        System.out.println("4 - Boleto (7,5% de desconto)");
        System.out.print("Escolha uma opção: ");
        int op = sc.nextInt();

        double desconto = 0;

        // Processamento
        switch (op) {
            case 1:
                desconto = 0.10;
                break;
            case 2:
                desconto = 0.05;
                break;
            case 3:
                desconto = 0.03;
                break;
            case 4:
                desconto = 0.075;
                break;
            default:
                System.out.println("Opção inválida!");
                sc.close();
                return;
        }

        double valorFinal = valor - (valor * desconto);

        // Saída
        System.out.println("\n=== RESULTADO ===");
        System.out.printf("Valor original: R$ %.2f\n", valor);
        System.out.printf("Desconto aplicado: %.1f%%\n", desconto * 100);
        System.out.printf("Valor final: R$ %.2f\n", valorFinal);

        sc.close();
    }
}