import java.util.Scanner;

public class validar_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Digite um número inteiro: ");
        String entrada = sc.nextLine().trim();

        System.out.println("\n=== RESULTADO ===");

        // Validação
        if (entrada.isEmpty()) {
            System.out.println("Dado inválido");
        } else {
            try {
                int num = Integer.parseInt(entrada);
                System.out.println("Número válido: " + num);
            } catch (NumberFormatException e) {
                System.out.println("Erro: digite apenas números inteiros!");
            }
        }

        sc.close();
    }
}